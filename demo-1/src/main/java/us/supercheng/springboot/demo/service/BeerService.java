package us.supercheng.springboot.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import us.supercheng.springboot.demo.entity.Beer;
import us.supercheng.springboot.demo.repository.BeerRepository;

import javax.annotation.Resource;

@Service
public class BeerService {

    @Resource
    private BeerRepository beerRepository;

    @Transactional
    public void save(Beer beer) {
        this.beerRepository.save(beer);
    }
}
