/*  package org.example.springresthandson;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringRestHandsonApplication {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(SpringRestHandsonApplication.class);

    public static void main(String[] args) {

        LOGGER.info("START");

        SpringApplication.run(SpringRestHandsonApplication.class, args);

        LOGGER.info("END");
    }
}*/

package org.example.springresthandson;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.example.springresthandson.model.Country;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class SpringRestHandsonApplication {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(SpringRestHandsonApplication.class);

    public static void main(String[] args) throws Exception {

        LOGGER.info("START");

        SpringApplication.run(SpringRestHandsonApplication.class, args);

        displayDate();

        displayCountry();

        displayCountries();

        LOGGER.info("END");
    }

    public static void displayDate() throws Exception {

        LOGGER.info("START");

        ApplicationContext context =
                new ClassPathXmlApplicationContext("date-format.xml");

        SimpleDateFormat format =
                context.getBean("dateFormat", SimpleDateFormat.class);

        Date date = format.parse("31/12/2018");

        /*System.out.println(date);*/
        LOGGER.debug("Date : {}", date);

        LOGGER.info("END");

    }
    public static void displayCountry() {

        LOGGER.info("START");

        ApplicationContext context =
                new ClassPathXmlApplicationContext("country.xml");

        Country country1 =
                context.getBean("country", Country.class);

        Country country2 =
                context.getBean("country", Country.class);

        LOGGER.debug("Country 1 : {}", country1);

        LOGGER.debug("Country 2 : {}", country2);

        LOGGER.debug("Same Object : {}", country1 == country2);

        LOGGER.info("END");
    }
    public static void displayCountries() {

        LOGGER.info("START");

        ApplicationContext context =
                new ClassPathXmlApplicationContext("country.xml");

        List<Country> countries =
                context.getBean("countryList", List.class);

        for (Country country : countries) {
            LOGGER.debug("{}", country);
        }

        LOGGER.info("END");
    }
}
