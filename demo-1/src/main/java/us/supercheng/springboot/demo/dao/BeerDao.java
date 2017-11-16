package us.supercheng.springboot.demo.dao;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import us.supercheng.springboot.demo.entity.Beer;
import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Component
public class BeerDao {
    public final String SQL_Beer_Insert = "INSERT INTO beer (alcohol_percentage, calories, name, origin, since) VALUES ( ?, ?, ?, ?, ?)";
    public final String SQL_Beer_GetById = "SELECT * FROM beer WHERE id=?";
    public final String SQL_Beer_DeleteById = "DELETE FROM beer WHERE id = ?";
    public final String SQL_Beer_UpdateById = "UPDATE beer SET alcohol_percentage=?, calories=?, name=?, origin=?, since=? WHERE id = ?";
    public final String SQL_Beer_GetALL_TESTING_ONLY = "SELECT * FROM beer";
    @Resource
    private JdbcTemplate jdbcTemplate;

    public Beer save(Beer beer) {
        this.jdbcTemplate.update(SQL_Beer_Insert, new Object[] {
            beer.getAlcoholPercentage(), beer.getCalories(), beer.getName(), beer.getOrigin(), beer.getSince()
        });
        return beer;
    }

    public Beer getABeer(String id) {
        RowMapper<Beer> rowMapper = new BeanPropertyRowMapper<Beer>(Beer.class);
        return this.jdbcTemplate.queryForObject(SQL_Beer_GetById, rowMapper,id);
    }

    public List<Beer> getAllBeer() {
        List<Map<String, Object>> rows = this.jdbcTemplate.queryForList(SQL_Beer_GetALL_TESTING_ONLY);
        List<Beer> beers = new ArrayList<>();
        for (Map<String, Object> row : rows) {
            Beer beer = new Beer();
            beer.setId(Integer.parseInt(row.get("id")+""));
            beer.setAlcoholPercentage(Double.parseDouble(row.get("alcohol_percentage") + ""));
            beer.setCalories(Double.parseDouble(row.get("calories") + ""));
            beer.setName(row.get("name")+"");
            beer.setOrigin(row.get("origin")+"");

            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:SS");
            try {
                beer.setSince(formatter.parse(row.get("since")+""));
            } catch (Exception ex) {

            }
            beers.add(beer);
        }
        return beers;
    }

    @Transactional
    public Beer updateBeer(Beer beer) {
        this.jdbcTemplate.update(SQL_Beer_UpdateById, new Object[]{
                beer.getAlcoholPercentage(), beer.getCalories(), beer.getName(), beer.getOrigin(), beer.getSince(), beer.getId()
        });
        return beer;
    }

    @Transactional
    public Beer deleteBeer(String id) {
        Beer beer = this.getABeer(id);
        this.jdbcTemplate.update(SQL_Beer_DeleteById, new Object[]{
                id
        });
        return beer;
    }


}