package com.in.microservices.currencyconvertservice.bean;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="currency-exchange-service")
//@FeignClient(name="currency-exchange-service",url="http://localhost:8000")
@RibbonClient(name="currency-exchange-service")
public interface CurrencyConverterInterface {

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public CurrencyConversionBean retrieveExchangeValue(@PathVariable("from") String from, @PathVariable("to") String to);
}
