package homeworkWeek2;

import java.util.Scanner;

public class Programme6 {
   static double radius, area;
    public static double areaOfCircle(){
        area = Math.PI *radius*radius;
        System.out.println(area);
        return  area;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of radius");
        radius = input.nextDouble();
        areaOfCircle();

    }


}
