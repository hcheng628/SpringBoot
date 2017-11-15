package us.supercheng.springboot.demo.dao;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import us.supercheng.springboot.demo.entity.Beer;
import javax.annotation.Resource;

@Component
public class BeerDao {

    @Resource
    private JdbcTemplate jdbcTemplate;

    public Beer save() {
        this.jdbcTemplate.execute("");
        return null;
    }

    public Beer getABeer(String id) {
        String sql = "select *from Beer where id=?";
        RowMapper<Beer> rowMapper = new BeanPropertyRowMapper<Beer>(Beer.class);
        return jdbcTemplate.queryForObject(sql, rowMapper,id);
    }

    public Beer updateBeer() {
        return null;
    }

    public Beer deleteBeer() {
        return null;
    }

}