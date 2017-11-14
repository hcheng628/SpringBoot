package us.supercheng.springboot.demo.entity;

import com.alibaba.fastjson.annotation.JSONField;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Beer {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;
    String name;
    Double alcoholPercentage;
    @JSONField(serialize = false)
    Double calories;
    String origin;
    @JSONField(format="yyyy-MM-dd HH:mm:SS")
    Date since;

    public Beer() {
        super();
    }
    public Beer(String name, Double alcoholPercentage, Double calories, String origin, Date since) {
        this.name = name;
        this.alcoholPercentage = alcoholPercentage;
        this.calories = calories;
        this.origin = origin;
        this.since = since;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getAlcoholPercentage() {
        return alcoholPercentage;
    }
    public void setAlcoholPercentage(Double alcoholPercentage) {
        this.alcoholPercentage = alcoholPercentage;
    }
    public Double getCalories() {
        return calories;
    }
    public void setCalories(Double calories) {
        this.calories = calories;
    }
    public String getOrigin() {
        return origin;
    }
    public void setOrigin(String origin) {
        this.origin = origin;
    }
    public Date getSince() {
        return since;
    }
    public void setSince(Date since) {
        this.since = since;
    }

    @Override
    public String toString() {
        return "Beer{" +
                "name='" + name + '\'' +
                ", alcoholPercentage=" + alcoholPercentage +
                ", calories=" + calories +
                ", origin='" + origin + '\'' +
                '}';
    }
}