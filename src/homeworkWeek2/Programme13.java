package homeworkWeek2;


import java.util.Scanner;

public class Programme13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Input the first number: ");
        double x = s.nextDouble();
        System.out.print("Input the second number: ");
        double y = s.nextDouble();
        System.out.print("Input the third number: ");
        double z = s.nextDouble();
        System.out.println("The average value is: " + average(x, y, z));
    }

    public static double average(double x, double y, double z) {
        return (x + y + z) / 3;
    }
}
