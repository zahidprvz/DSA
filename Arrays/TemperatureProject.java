package Arrays;

import java.util.Scanner;

public class TemperatureProject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TemperatureProject tp = new TemperatureProject();
        int avg = 0;

        System.out.print("Enter the number of days for temperature: ");
        int days = sc.nextInt();

        int[] temperature = new int[days];

        System.out.println();

        for(int i=0; i<temperature.length; i++) {
            System.out.print("Enter Day " + (i+1) + "s temperature: " );
            temperature[i] = sc.nextInt();
            avg += temperature[i];
        }
        System.out.println("\nValues inserted successfully!\n");

        tp.findDaysAboveAverage(temperature, avg);

        sc.close();
    }

    public void findDaysAboveAverage(int[] temperature, int avg) {
        avg = avg/temperature.length;

        System.out.println("Average is: " + avg);

        System.out.println("\nThe temperature for following days was recorded more than the avg: ");

        for(int i=0; i<temperature.length; i++) {
            if(temperature[i] > avg) {
                System.out.println("Day: " + (i+1) + " , Temperature: " + temperature[i]);
            }
        }
    }
}