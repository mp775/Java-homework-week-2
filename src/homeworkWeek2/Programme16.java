package homeworkWeek2;

import java.util.Scanner;

public class Programme16 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first binary number:");
        String firstBinaryNumber = s.nextLine();
        System.out.println("Enter second binary number:");
        String secondBinaryNumber = s.nextLine();

        int b1 = Integer.parseInt(firstBinaryNumber,2);
        int b2 = Integer.parseInt(secondBinaryNumber,2);
        int sum = b1 + b2;
        System.out.println("The sum of two binary number is: "+Integer.toBinaryString(sum));
    }
}
