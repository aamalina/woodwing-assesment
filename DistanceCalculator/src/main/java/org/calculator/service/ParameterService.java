package org.calculator.service;

import org.calculator.pojo.ParameterRequest;
import org.calculator.pojo.SumResponse;

public interface ParameterService {

    SumResponse getResult(ParameterRequest parameterRequest);
}
