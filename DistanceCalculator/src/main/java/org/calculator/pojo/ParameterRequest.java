package org.calculator.pojo;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ParameterRequest {

    private Double distance1;
    private Double distance2;
    private String unit1;
    private String unit2;
    private String expectedUnit;
}
