package us.supercheng.springboot.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import us.supercheng.springboot.demo.entity.Beer;
import us.supercheng.springboot.demo.service.BeerService;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(value = "/beer/api")
public class BeerControllerDao {

    @Autowired
    private BeerService beerService;

    @RequestMapping(value = "/daoCreateBeer", method = RequestMethod.GET)
    public Beer createBeer(Beer beer) {
        return this.beerService.saveDaoVersion(beer);
    }

    @RequestMapping(value = "/daoGetBeer", method = RequestMethod.GET)
    public Beer getBeerById(String id) {
        return this.beerService.findOneDaoVersion(id);
    }

    @RequestMapping(value = "/daoGetAllBeer", method = RequestMethod.GET)
    public List<Beer> getAllBeer() {
        return this.beerService.getAllBeerDaoVersion();
    }


    @RequestMapping(value = "/daoUpdateBeer", method = RequestMethod.GET)
    public Beer updateBeer(Beer beer) {
        return this.beerService.updateDaoVersion(beer);
    }

    @RequestMapping(value = "/daoDeleteBeer", method = RequestMethod.GET)
    public Beer deleteBeer(String id) {
        return this.beerService.deleteDaoVersion(id);
    }

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:SS");
        simpleDateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(simpleDateFormat, true));
    }
}