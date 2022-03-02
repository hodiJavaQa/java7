import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // int x = 13;
        // myPrint(x);
        // x=x+13;
        // myPrint(x);
        // x=x*5; // x*=5
        // myPrint(x);
        // x++;
        // x++;
        // x--;
        // x=0;
        // myPrint(x);
        // myPrint(18);

        //printHello();
//
        //String name = "Obama Baby";
//
        //printHelloWithName(name);
        //printHelloWithName("yuval");
        //printHelloWithName("bar");
        //add(5,9);
        //int a=19,b=-55;
        //add(a,b);
//
       //double d = div(12.3,19.8);
        //System.out.println(d);
//
        //Math.max(99,44);
        //System.out.println(isxpositive(-119));

        //sq(25);
        //כתבו פונקציה שמקבלת מספר ומדפיה את השורש שלו

        //foo("hodi",18);

        //כתבו פונקציה  שמקבלת 2 מספרים ומחזריה את המכפלה של שני המספרים
        //Scanner scanner=new Scanner(System.in);
//
        //int x1= scanner.nextInt();
        //int x2= scanner.nextInt();
//
        //int result=multi(5,6);
        //System.out.println(result);
        System.out.println(LocalTime.now());

    }

















    public static int multi(int number1,int number2){
        return number1*number2;

    }

    private static void foo(String name, int age) {

    }


    public static void sq(int x){
        System.out.println(Math.sqrt(x));
    }













    public static void printHello() {
        for (int i = 0; i < 10; i++) {
            System.out.println("hello");
        }
    }  // פונציות לא מקבלות ערך ולא מחזירות ערך
    public static void printHelloWithName(String name) {
        System.out.println("hello " + name);
    }
    static void add(int x , int y) {
        System.out.println( x+" + "+y+" = "+(x+y) );
    }
    static double div(double numb1,double numb2){
        double result =numb1/numb2;
        return result;
    }
    private static boolean isxpositive(int x ){
        if(x>0)
            return true;
        else
            return false;
    }

}
