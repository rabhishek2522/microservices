package com.in.microservices.currencyexchangeservice;

import com.in.microservices.currencyexchangeservice.bean.ExchangeValue;
import com.in.microservices.currencyexchangeservice.bean.ExchangeValueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class CurrenctExchangeController {

    @Autowired
    private Environment environment;

    @Autowired
    private ExchangeValueRepository exchangeValueRepository;

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public ExchangeValue retrieveExchangeValue(@PathVariable String from, @PathVariable String to){

        //ExchangeValue exchangeValue = new ExchangeValue(1000L, from, to, BigDecimal.valueOf(65));
        ExchangeValue exchangeValue = exchangeValueRepository.findByFromAndTo(from,to);
        exchangeValue.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
        return exchangeValue;

    }
}
