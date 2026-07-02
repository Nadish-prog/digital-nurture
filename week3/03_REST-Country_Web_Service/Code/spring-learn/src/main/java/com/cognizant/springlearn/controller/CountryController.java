package com.cognizant.springlearn.controller;

import com.cognizant.springlearn.model.Country;
import java.util.ArrayList;
import java.util.List;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {

    @GetMapping("/country")
    public List<Country> getAllCountries() {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springConfig.xml")) {
            return new ArrayList<>(context.getBeansOfType(Country.class).values());
        }
    }
}
