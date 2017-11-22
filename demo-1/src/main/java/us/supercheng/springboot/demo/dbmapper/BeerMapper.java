package us.supercheng.springboot.demo.dbmapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import us.supercheng.springboot.demo.entity.Beer;
import java.util.List;

@Component
public interface BeerMapper {

    @Select("SELECT *FROM beer Where id = #{id}")
    Beer getBeerById(String id);

    @Select("SELECT * FROM beer")
    List<Beer> getAllBeer();

    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    @Insert("INSERT INTO beer (alcohol_percentage, calories, name, origin, since) " +
            "VALUES (#{alcoholPercentage}, #{calories}, #{name}, #{origin}, #{since});")
    void saveBeer(Beer newBeer);
}
