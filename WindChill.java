package bridglabz.functionalprograms;

import java.util.Scanner;

public class WindChill {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in); 
    double t=sc.nextDouble();
    double v=sc.nextDouble(); 
    if(t < 50 && v < 120 && v > 3) {
    	double windChill=35.74 + 0.6215*t + (0.4275*t - 35.75) * Math.pow(v,0.16);
    	System.out.println("Temperature = " + t);
        System.out.println("wind speed = " + v);
 	    System.out.println("wind chill = " +windChill);
    }
 	    sc.close();
	}
}