import java.util.*;
import java.math.*;

public class Main {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("enter base ");

        double base = reader.nextDouble();

        System.out.print("enter exponent ");

        double exponent = reader.nextDouble();

        double pow = Math.pow(base, exponent);

        System.out.println("The answer is: " + pow);


        try{

            int num = 8;

            switch(num){

                case 9:
                    System.out.println("9");
                    break;
            }

            while(true){



            }

        }
        catch (Exception e){

            System.out.println(e);

        }

    }
}