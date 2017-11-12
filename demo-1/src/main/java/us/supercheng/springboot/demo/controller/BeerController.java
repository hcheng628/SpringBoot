package us.supercheng.springboot.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import us.supercheng.springboot.demo.entity.Beer;
import us.supercheng.springboot.demo.service.BeerService;

import java.util.Date;

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

}