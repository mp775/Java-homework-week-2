package homeworkWeek2;

public class Programme3 {
    int a = 5;//declaring instance variable
    static int b = 10;// declaring static variable

    // instance method
    public void printInstanceVariable() {
        System.out.println(a);
    }

    // static method
    public static void printStaticVariable() {
        System.out.println(b);
    }

    public static void main(String[] args) {
    Programme3 cal = new Programme3(); // creating object
    cal.printInstanceVariable(); // calling instance method
    printStaticVariable(); // calling static method
    }
}



