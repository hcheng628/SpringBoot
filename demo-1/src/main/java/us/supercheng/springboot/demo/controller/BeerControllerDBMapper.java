package us.supercheng.springboot.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import us.supercheng.springboot.demo.entity.Beer;
import us.supercheng.springboot.demo.service.BeerService;
import java.util.List;

@RestController
@RequestMapping(value = "/beer/api")
public class BeerControllerDBMapper {

    @Autowired
    private BeerService beerService;

    @RequestMapping(value = "/dbMapperGetBeer", method = RequestMethod.GET)
    public Beer getBeer(String id) {
        return this.beerService.findOneMapperVersion(id);
    }

    @RequestMapping(value = "/dbMapperGetAllBeer", method = RequestMethod.GET)
    public List<Beer> getAllBeer() {
        return this.beerService.getAllBeerMapperVersion();
    }
}