package us.supercheng.springboot.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import us.supercheng.springboot.demo.entity.Beer;
import us.supercheng.springboot.demo.service.BeerService;

@RestController
@RequestMapping(value = "/beer/api")
public class BeerControllerDao {

    @Autowired
    private BeerService beerService;

    @RequestMapping(value = "/daoGetBeer", method = RequestMethod.GET)
    public Beer getBeerById(String id) {
        return this.beerService.findOneDaoVersion(id);
    }

}