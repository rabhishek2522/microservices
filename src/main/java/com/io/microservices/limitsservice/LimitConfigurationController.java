package com.io.microservices.limitsservice;

import com.io.microservices.limitsservice.bean.LimitConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitConfigurationController {


    @Autowired
    private Configuration configuration;

    @GetMapping("/limits")
    public LimitConfiguration retrieveLimitsFromConfiguration(){
        //System.out.println("configuration = " + configuration);
//return new LimitConfiguration(1000,99); //w/o properties files
    return new LimitConfiguration(configuration.getMaximum(),configuration.getMinimum());//From properties data is coming
    }
}
