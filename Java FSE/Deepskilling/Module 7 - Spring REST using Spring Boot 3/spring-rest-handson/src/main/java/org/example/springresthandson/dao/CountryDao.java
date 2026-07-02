package org.example.springresthandson.dao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.example.springresthandson.model.Country;
import org.springframework.stereotype.Repository;
import org.example.springresthandson.exception.CountryNotFoundException;
import java.util.List;
@Repository
public class CountryDao {

    public Country getCountry() {

        Country country = new Country();
        country.setCode("IN");
        country.setName("India");

        return country;
    }
    public Country getCountryFromXml() {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("country.xml");

        return context.getBean("country", Country.class);
    }
    public Country getCountry(String code) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("country.xml");

        if(code.equalsIgnoreCase("IN"))
            return context.getBean("in", Country.class);

        if(code.equalsIgnoreCase("US"))
            return context.getBean("us", Country.class);

        if(code.equalsIgnoreCase("DE"))
            return context.getBean("de", Country.class);

        if(code.equalsIgnoreCase("JP"))
            return context.getBean("jp", Country.class);

        throw new CountryNotFoundException("Country not found");

    }
    public List<Country> getAllCountries() {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("country.xml");

        return context.getBean("countryList", List.class);
    }
}