package us.supercheng.springboot.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import us.supercheng.springboot.demo.entity.Beer;
import us.supercheng.springboot.demo.repository.BeerRepository;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BeerService {

    @Resource
    private BeerRepository beerRepository;

    // Create + Update
    @Transactional
    public void save(Beer beer) {
        this.beerRepository.save(beer);
    }

    public Beer findOne(Integer id) {
        return this.beerRepository.findOne(id);
    }

    public List<Beer> findByName(String name) {
        return this.beerRepository.findBeersByName(name);
    }

    @Transactional
    public void delete(Integer id) {
        this.beerRepository.delete(id);
    }
}