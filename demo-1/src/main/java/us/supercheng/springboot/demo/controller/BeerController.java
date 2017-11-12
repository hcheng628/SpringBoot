package us.supercheng.springboot.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import us.supercheng.springboot.demo.entity.Beer;
import java.util.Date;

@RestController
@RequestMapping("/beer/api")
public class BeerController {

    @RequestMapping(value = "/bestbeer", method = RequestMethod.GET)
    public Beer bestBeer() {
        return new Beer("PERONI", 8.1, 234.4, "Itlay", new Date());
    }
}