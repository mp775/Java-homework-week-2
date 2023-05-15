package homeworkWeek2;

public class Programme5 {

    // instance method with parameters
    public void addition(int a, int b) {
        int addResult = a + b;
        System.out.println("Addition of two number = " + addResult); // string concatenation
    }

    // instance method with parameters
    public void subtraction(int a, int b) {
        int subResult = a - b;
        System.out.println("Subtraction of two number is = " + subResult); // string concatenation
    }

    // static method with parameters
    public static void multiplication(int a, int b) {
        int mulResult = a * b;
        System.out.println("Multiplication of two number is = " + mulResult); // string concatenation
    }

    // static method with parameters
    public static void division(int a, int b){
        int divResult = a/b;
        System.out.println("Division of two number is = " + divResult); // string concatenation

    }

    public static void main(String[] args) {
        Programme5 cal = new Programme5(); // creating object
        cal.addition(10,5); // calling instance parameterized method
        cal.subtraction(20,10); // calling instance parameterized method
        multiplication(30,4); // calling static parameterized method
        division(16,4); // calling static parameterized method
    }
}

