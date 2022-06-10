package edu.escuelaing.arsw.app;

import java.io.File;
// import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Calculator {

    private static List<Double> numbersList = new OpLinkedList<Double>();

    /**
     * Programa que calcula la media y la desviacion estandar dado un archivo de numeros.
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        numbersList = fileConverter(args[0]);
        System.out.println(mean(numbersList));
        System.out.println(standardDeviation(numbersList));
    }

    /**
     * Metodo que lee un archivo y digita los numeros en una lista enlazada.
     * @param path as String
     * @return Lista enlazada de numeros.
     * @throws Exception
     */
    public static List<Double> fileConverter(String path) throws Exception {
        List<Double> numList = new OpLinkedList<Double>();
        File file = new File(path);
        Scanner scan = new Scanner(file);
        while (scan.hasNextLine()) {
            String number = scan.nextLine().strip();
            numList.add(Double.parseDouble(number));
        }
        scan.close();
        return numList;
    }

    /**
     * Metodo que calcula la media dada una lista de numeros.
     * @param numList as linkedList.
     * @return media de la lista.
     */
    public static Double mean(List<Double> numList) {
        double mean = 0;
        for (Double num : numList) {
            mean += num;
        }
        mean = Math.round((mean / numList.size()) * 100.0) / 100.0;
        return mean;
    }

    /**
     * Metodo que calcula la desviacion estandar dada una lista de numeros.
     * @param numList as linkedList.
     * @return desviacion estandar de la lista.
     */
    public static Double standardDeviation(List<Double> numList) {
        Double mean = mean(numList);
        Double sd = (double) 0;
        for (Double num : numList) {
            sd += Math.pow(num - mean, 2);
        }
        sd = Math.round((Math.sqrt(sd / (numList.size() - 1))) * 100.0) / 100.0;
        return sd;
    }

}
