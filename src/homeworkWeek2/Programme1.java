package homeworkWeek2;

public class Programme1 {
    //declaring instance variable
    int a = 10;
    int b = 20;
    //declaring instance method
    public void printVariable() {
        System.out.println(a);
        System.out.println(b);

    }
// declaring main method
    public static void main(String[] args) {
     Programme1 cal = new Programme1();   // creating object
     cal.printVariable(); // calling instance method
    }
}