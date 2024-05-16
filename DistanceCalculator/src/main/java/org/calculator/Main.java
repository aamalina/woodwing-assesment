package org.calculator;

import org.calculator.pojo.ParameterRequest;
import org.calculator.pojo.SumResponse;
import org.calculator.service.ParameterService;
import org.calculator.service.ParameterServiceImpl;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Double param1, param2;
        String unit1, unit2, expectedUnit;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Distance 1: ");
        param1 = scanner.nextDouble();

        System.out.print("Metres or yard? (m/y)");
        unit1 = scanner.next();

        System.out.print("Distance 2: ");
        param2 = scanner.nextDouble();

        System.out.print("Metres or yard? (m/y)");
        unit2 = scanner.next();

        System.out.print("Expected unit in metres or yard? (m/y)");
        expectedUnit = scanner.next();

        ParameterRequest parameterRequest = new ParameterRequest();
        parameterRequest.setDistance1(param1);
        parameterRequest.setUnit1(unit1);
        parameterRequest.setDistance2(param2);
        parameterRequest.setUnit2(unit2);
        parameterRequest.setExpectedUnit(expectedUnit);

        ParameterService parameterService = new ParameterServiceImpl();
        SumResponse sumResponse = parameterService.getResult(parameterRequest);

        System.out.println(sumResponse.getSumDistance());
    }
}