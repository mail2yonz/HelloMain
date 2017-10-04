import java.util.Scanner;

public class HelloMainApp {


    public static void main(String[] args)
    {
         String thisname;
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter the persons name:");
        thisname= scan.next ();

        System.out.println(Hello ( thisname ));


    }

    public static String Hello(String name){


        return "Hello " + name +"!";
    }
}
