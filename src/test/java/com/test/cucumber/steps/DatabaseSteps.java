package com.test.cucumber.steps;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.test.cucumber.persistence.model.CountryEntity;
import com.test.cucumber.persistence.model.RegionEntity;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.When;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

@Slf4j
public class DatabaseSteps extends Step {

    @Autowired
    private ObjectMapper objectMapper;

    @When("^following region exists in database$")
    public void regionExistsInDatabase(List<RegionEntity> regions) {
        regions.forEach(region -> log.info(region.toString()));
    }

    @When("^following country exists in database$")
    public void countryExistsInDatabase(List<CountryEntity> countries) {
        countries.forEach(region -> log.info(region.toString()));
    }

    @DataTableType
    public RegionEntity toRegionEntity(Map<String, String> dataTableMap) {
        return objectMapper.convertValue(dataTableMap, RegionEntity.class);
    }

    @DataTableType
    public CountryEntity toCountryEntity(Map<String, String> dataTableMap) {
        return objectMapper.convertValue(dataTableMap, CountryEntity.class);
    }
}
