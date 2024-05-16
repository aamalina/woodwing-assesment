package org.calculator;

import org.calculator.pojo.ParameterRequest;
import org.calculator.pojo.SumResponse;
import org.calculator.service.ParameterService;

import java.util.Scanner;

public class Main {

    static ParameterService parameterService;
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Distance 1: ");
        Double param1 = scanner.nextDouble();

        System.out.print("Metres or yard? ");
        String unit1 = scanner.next();

        System.out.print("Distance 2: ");
        Double param2 = scanner.nextDouble();

        System.out.print("Metres or yard? ");
        String unit2 = scanner.next();

        System.out.print("Expected unit in metres or yard? ");
        String expectedUnit = scanner.next();

        ParameterRequest parameterRequest = new ParameterRequest();
        parameterRequest.setDistance1(param1);
        parameterRequest.setUnit1(unit1);
        parameterRequest.setDistance2(param2);
        parameterRequest.setUnit2(unit2);
        parameterRequest.setExpectedUnit(expectedUnit);

        SumResponse sumResponse = parameterService.getResult(parameterRequest);

        System.out.println(sumResponse.getSumDistance());
    }
}