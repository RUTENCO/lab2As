package com.udea.lab2As;

import java.util.Locale;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.javafaker.Faker;



@RestController
public class DataController {
    
    @GetMapping("/")
    public String getHealth() {
        return "HEALTH CHECK OK";
    }

    @GetMapping("/version")
    public String getVersion() {
        return "VERSION IS 1.0.0";
    }
    
    @GetMapping("/nations")
    public JsonNode getRandomNations() {
        var objectMapper = new ObjectMapper();
        var faker = new Faker(new Locale("en-US"));
        var nations = objectMapper.createArrayNode();
        for (int i = 0; i < 10; i++) {
            var nation = faker.nation();
            nations.add(objectMapper.createObjectNode()
                .put("nationality", nation.nationality())
                .put("capitalCity", nation.capitalCity())
                .put("bandera", nation.flag())
                .put("language", nation.language()));
        }
        return nations;
    }

    @GetMapping("/currencies")
    public JsonNode getRandomCurrencies() {
        var objectMapper = new ObjectMapper();
        var faker = new Faker(new Locale("en-US"));
        var currencies = objectMapper.createArrayNode();
        for (int i = 0; i < 20; i++) {
            var currency = faker.currency();
            currencies.add(objectMapper.createObjectNode()
                .put("code", currency.code())
                .put("name", currency.name()));
        }
        return currencies;
    }

    @GetMapping("/aviations")
    public JsonNode getRandomAviations() {
        var objectMapper = new ObjectMapper();
        var faker = new Faker(new Locale("en-US"));
        var aviations = objectMapper.createArrayNode();
        for (int i = 0; i < 20; i++) {
            var aviation = faker.aviation();
            aviations.add(objectMapper.createObjectNode()
                .put("aircraft", String.valueOf(aviation.aircraft()))
                .put("airport", String.valueOf(aviation.airport()))
                .put("METAR", String.valueOf(aviation.METAR())));
        }
        return aviations;
    }


}