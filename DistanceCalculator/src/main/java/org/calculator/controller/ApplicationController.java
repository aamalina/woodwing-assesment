package org.calculator.controller;


import org.calculator.pojo.ParameterRequest;
import org.calculator.pojo.SumResponse;
import org.calculator.service.ParameterService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/distance")
public class ApplicationController {

    ParameterService parameterService;

    @GetMapping("/add")
    public SumResponse getSumParams (ParameterRequest parameterRequest){
        SumResponse res = parameterService.getResult(parameterRequest);
        return res;
    }
}
