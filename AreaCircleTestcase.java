package testcase;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.junit.runners.Parameterized.Parameters;

import javaclass.AreaCircle;

class AreaCircleTestcase {
    AreaCircle ob=new AreaCircle();
    private int input = 11;
    private double expected = 314.0;

    @Test
    public void Circletest() {
    	System.out.print("Input Value is " + input + "\n");
    	System.out.print("Actual Value is " + AreaCircle.findarea(input));  
        assertEquals(expected,AreaCircle.findarea(input));
        

    }

}
