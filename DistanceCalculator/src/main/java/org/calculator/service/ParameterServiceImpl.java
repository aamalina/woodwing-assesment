package org.calculator.service;

import org.calculator.pojo.ParameterRequest;
import org.calculator.pojo.SumResponse;

public class ParameterServiceImpl implements ParameterService{
    @Override
    public SumResponse getResult(ParameterRequest parameterRequest) {

        SumResponse res = new SumResponse();

        Double sumDistance;
        if (isMetre(parameterRequest.getExpectedUnit())) {
            if (!isMetre(parameterRequest.getUnit1())) {
                Double newDistance = unitConverter(parameterRequest.getDistance1(), "m");
                parameterRequest.setDistance1(newDistance);
            }
            if (!isMetre(parameterRequest.getUnit2())){
                Double newDistance = unitConverter(parameterRequest.getDistance2(), "m");
                parameterRequest.setDistance2(newDistance);
            }
        }
        if (!isMetre(parameterRequest.getExpectedUnit())){
            if (isMetre(parameterRequest.getUnit1())) {
                Double newDistance = unitConverter(parameterRequest.getDistance1(), "y");
                parameterRequest.setDistance1(newDistance);
            }
            if (isMetre(parameterRequest.getUnit2())){
                Double newDistance = unitConverter(parameterRequest.getDistance2(), "y");
                parameterRequest.setDistance2(newDistance);
            }
        }

        sumDistance = parameterRequest.getDistance1() + parameterRequest.getDistance2();
        res.setSumDistance(sumDistance);
        return res;
    }

    private boolean isMetre(String unit){
        if (unit.equals("m"))
            return true;
        else
            return false;
    }
    private Double unitConverter(double param, String unit){
        if (unit.equals("m"))
            return param * 0.9144;
        else
            return param * 1.0936133;
    }
}
