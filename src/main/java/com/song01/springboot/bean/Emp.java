package com.song01.springboot.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import java.util.Date;
import java.util.List;
import java.util.Map;
/**
 * /**
 *  * @ConfigurationProperties 告诉SpringBoot将配置文件中的对应属性值，映射到这个组件类中，
 *  * 进行一一绑定
 *  *  prefix = "emp" ： 配置文件中的前缀名，配置了哪个前缀就会与下面的所有属性进行一一映射
 *  *
 *  *
 *  *  @PropertySource ： 加载局部配置文件，
 *  * @Title: Emp
 */
@Component
@ConfigurationProperties(prefix = "emp")
@PropertySource(value = {"classpath:emp.properties"}) //加载指定的配置文件,value 属性是数组类型, 用于指定文件位置
@Validated
public class Emp {

//    @Value("${emp.lastname}")   //总结 使用场景:
//如果只是在某个业务逻辑中需要获取配置文件中的某个属性值，就使用 @Value
    //如果专门使用javaBean和配置文件进行映射，就使用@ConfigurationProperties
//    @Email
    private  String lastName;
//    @Value("#{10*2}")
    private Integer age;
//    @Value("8000")
    private Double salary;

    private Boolean boss;
    private Date birthday;
    private Map map;
    private List list;
    //特长
    private Forte forte;

    @Override
    public String toString() {
        return "Emp{" +
                "lastName='" + lastName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", boss=" + boss +
                ", birthday=" + birthday +
                ", map=" + map +
                ", list=" + list +
                ", forte=" + forte +
                '}';
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Boolean getBoss() {
        return boss;
    }

    public void setBoss(Boolean boss) {
        this.boss = boss;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public Forte getForte() {
        return forte;
    }

    public void setForte(Forte forte) {
        this.forte = forte;
    }
}
