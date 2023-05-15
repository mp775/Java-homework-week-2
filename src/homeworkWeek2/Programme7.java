package homeworkWeek2;

import java.util.Scanner;

public class Programme7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Input temperature value in degree Fahrenheit:");
        double Fahrenheit = input.nextDouble();

        Double Celsius  = ((Fahrenheit-32))*5/9;
        System.out.println("Temperature value in degree Celsius = " +Celsius);
    }
}

