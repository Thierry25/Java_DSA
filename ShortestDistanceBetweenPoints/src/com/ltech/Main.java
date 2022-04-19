package com.ltech;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the amount of points that you would like to enter: ");
        double[][] pointsArray = new double[input.nextInt()][2];
        for(int i = 0; i < pointsArray.length; i++){
            pointsArray[i][0] = input.nextDouble();
            pointsArray[i][1] = input.nextDouble();
        }
        double shortestDistance = Integer.MAX_VALUE;
        int point1 = 0, point2 = 0;
        for(int i = 0; i < pointsArray.length; i++){
            for(int j = i + 1; j < pointsArray.length; j++){
                double distance = distance(pointsArray[i][0], pointsArray[i][1]
                        , pointsArray[j][0], pointsArray[j][1]);
                if(distance < shortestDistance){
                    shortestDistance = distance;
                    point1 = i;
                    point2 = j;
                }
            }
        }
        System.out.printf("The two closest points are (%.0f, %.0f) and (%.0f, %.0f). The distance between them is %4.2f\n"
                , pointsArray[point1][0], pointsArray[point1][1],pointsArray[point2][0],pointsArray[point2][1],
                shortestDistance);

    }

    public static double distance(double x1, double x2, double y1, double y2){
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }
}
