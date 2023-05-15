package homeworkWeek2;

public class Programme4 {
    int a = 10; // instance variable 1
    int b = 20; // instance variable 2
    static int c = 30; // static variable 1
    static int d = 40; // static variable 2

    // instance method
    public void printInstanceVariable(){
        System.out.println(a);
        System.out.println(b);
    }

    // static method
    public static void printStaticVariable(){
        System.out.println(c);
        System.out.println(d);
    }

    public static void main(String[] args) {
        Programme4 cal = new Programme4(); // creating object
        cal.printInstanceVariable(); // calling instance method using object
        printStaticVariable(); // calling static method
    }

}
