package us.supercheng.springboot.demo.repository;

import org.springframework.data.repository.CrudRepository;
import us.supercheng.springboot.demo.entity.Beer;

import java.util.List;

public interface BeerRepository extends CrudRepository<Beer, Integer> {
    List<Beer> findBeersByName(String name);
}