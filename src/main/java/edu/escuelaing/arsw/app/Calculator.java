package edu.escuelaing.arsw.app;

import java.io.File;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Calculator {

    private static List<Double> numbersList = new LinkedList<Double>();

    public static void main(String[] args) throws Exception {
        fileConverter(args[0]);
        System.out.println(mean(numbersList));
    }

    public static void fileConverter(String path) throws Exception {
        File file = new File(path);
        Scanner scan = new Scanner(file);
        while (scan.hasNextLine()) {
            String number = scan.nextLine().strip();
            numbersList.add(Double.parseDouble(number));
        }
    }

    public static Double mean(List<Double> numList) {
        double mean = 0;
        for (int i = 0; i < numList.size(); i++) {
            mean += numList.get(i);
        }
        mean = Math.round((mean / numList.size()) * 100.0) / 100.0;
        return mean;
    }

}
