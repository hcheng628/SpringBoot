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
@RequestMapping("/beer/api")
public class BeerController {

    @Autowired
    private BeerService beerService;

    @RequestMapping(value = "/bestbeer", method = RequestMethod.GET)
    public Beer bestBeer() {
        return new Beer("PERONI", 8.1, 234.4, "Itlay", new Date());
    }

    @RequestMapping(value = "/save", method = RequestMethod.GET)
    public Beer save() {
        Beer beer = new Beer("PERONI", 8.1, 234.4, "Itlay", new Date());
        this.beerService.save(beer);
        return beer;
    }

    @RequestMapping(value = "/findOne", method = RequestMethod.GET)
    public Beer findOne(String id) {
        return this.beerService.findOne(Integer.parseInt(id));
    }

    @RequestMapping(value = "/findByName", method = RequestMethod.GET)
    public List<Beer> findByName(String name) {
        return this.beerService.findByName(name);
    }

    @RequestMapping(value = "/update", method = RequestMethod.GET)
    public Beer update(Beer beer) {
        this.beerService.save(beer);
        return beer;
    }

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public String delete(String id) {
        this.beerService.delete(Integer.parseInt(id));
        return "Delete Success! ID: " + id;
    }

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:SS");
        simpleDateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(simpleDateFormat, true));
    }
}