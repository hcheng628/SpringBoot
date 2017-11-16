package us.supercheng.springboot.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import us.supercheng.springboot.demo.dao.BeerDao;
import us.supercheng.springboot.demo.entity.Beer;
import us.supercheng.springboot.demo.repository.BeerRepository;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BeerService {

    @Resource
    private BeerRepository beerRepository;
    @Autowired
    private BeerDao beerDao;

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



    // DAO Version
    public Beer saveDaoVersion(Beer beer) {
        return this.beerDao.save(beer);
    }

    public Beer findOneDaoVersion(String id) {
        return this.beerDao.getABeer(id);
    }

    public Beer updateDaoVersion(Beer beer) {
        return this.beerDao.updateBeer(beer);
    }

    public Beer deleteDaoVersion(String id) {
        return this.beerDao.deleteBeer(id);
    }

    public List<Beer> getAllBeerDaoVersion() {
        return this.beerDao.getAllBeer();
    }
}