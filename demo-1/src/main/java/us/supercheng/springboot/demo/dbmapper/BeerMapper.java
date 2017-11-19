package us.supercheng.springboot.demo.dbmapper;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import us.supercheng.springboot.demo.entity.Beer;
import java.util.List;

@Component
public interface BeerMapper {

    @Select("SELECT *FROM beer Where id = #{id}")
    public Beer getBeerById(String id);

    @Select("SELECT * FROM beer")
    public List<Beer> getAllBeer();
}
