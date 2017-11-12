package us.supercheng.springboot.demo.repository;

import org.springframework.data.repository.CrudRepository;
import us.supercheng.springboot.demo.entity.Beer;

public interface BeerRepository extends CrudRepository<Beer, Integer> {

}