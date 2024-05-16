package org.calculator.controller;


import org.calculator.pojo.ParameterRequest;
import org.calculator.pojo.SumResponse;
import org.calculator.service.ParameterService;


public class ApplicationController {

    ParameterService parameterService;
    public SumResponse getSumParams (ParameterRequest parameterRequest){
        SumResponse res = parameterService.getResult(parameterRequest);
        return res;
    }
}
