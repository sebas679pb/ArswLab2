package edu.escuelaing.arsw.app;

import static org.junit.Assert.fail;

import java.io.File;
import java.util.List;
import java.util.Scanner;

import org.junit.*;

public class CalculatorTest {

    @Test
    public void deberiaRealizarMediaDocumento1() {
        try {
            List<Double> numList = Calculator.fileConverter("src\\main\\java\\edu\\escuelaing\\arsw\\app\\ProxySize.txt");
            Assert.assertEquals((Double)550.6, Calculator.mean(numList));
        } catch (Exception e) {
            fail();
        }
    }

    @Test
    public void deberiaRealizarDesviacionEstandarDocumento1() {
        try {
            List<Double> numList = Calculator.fileConverter("src\\main\\java\\edu\\escuelaing\\arsw\\app\\ProxySize.txt");
            Assert.assertEquals((Double) 572.03, Calculator.standardDeviation(numList));
        } catch (Exception e) {
            fail();
        }
    }

    @Test
    public void deberiaRealizarMediaDocumento2() {
        try {
            List<Double> numList = Calculator.fileConverter("src\\main\\java\\edu\\escuelaing\\arsw\\app\\DevelopmentHours.txt");
            Assert.assertEquals((Double) 60.32, Calculator.mean(numList));
        } catch (Exception e) {
            fail();
        }
    }

    @Test
    public void deberiaRealizarDesviacionEstandarDocumento2() {
        try {
            List<Double> numList = Calculator.fileConverter("src\\main\\java\\edu\\escuelaing\\arsw\\app\\DEvelopmentHours.txt");
            Assert.assertEquals((Double) 62.26, Calculator.standardDeviation(numList));
        } catch (Exception e) {
            fail();
        }
    }

}
