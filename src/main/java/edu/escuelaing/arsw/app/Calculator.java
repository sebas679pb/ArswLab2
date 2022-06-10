package edu.escuelaing.arsw.app;

import java.io.File;
// import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Calculator {

    private static List<Double> numbersList = new OpLinkedList<Double>();

    public static void main(String[] args) throws Exception {
        fileConverter(args[0]);
        System.out.println(mean(numbersList));
        System.out.println(standardDeviation(numbersList));
    }

    public static void fileConverter(String path) throws Exception {
        File file = new File(path);
        Scanner scan = new Scanner(file);
        while (scan.hasNextLine()) {
            String number = scan.nextLine().strip();
            numbersList.add(Double.parseDouble(number));
        }
        scan.close();
    }

    public static Double mean(List<Double> numList) {
        double mean = 0;
        for (Double num : numList) {
            mean += num;
        }
        mean = Math.round((mean / numList.size()) * 100.0) / 100.0;
        return mean;
    }

    public static double standardDeviation(List<Double> numList) {
        Double mean = mean(numList);
        Double sd = (double) 0;
        for (Double num : numList) {
            sd += Math.pow(num - mean, 2);
        }
        sd = Math.round((Math.sqrt(sd / (numList.size() - 1))) * 100.0) / 100.0;
        return sd;
    }

}
