import java.text.DecimalFormat;
import java.util.Scanner;

public class PracticalTask {
    public static void main(String[] args) {

         short varA = -5;
         short varB = 101;

         if (varA > varB){
             System.out.println (varA);
         }else {System.out.println(varB);}

        if (varA < varB){
            System.out.println (varA);
        }else {System.out.println(varB);}
        if (varA == varB){
            System.out.println ("Both variables are equal");}
        else {
            System.out.println("Variables are not equal");
        }
        if(varA % 2 == 0) {
            System.out.println("VarA is even");
        }else{
            System.out.println("VarA is an odd");
        }
        if (varB % 2 == 0) {
            System.out.println("VarB is even");
        }else{
            System.out.println("VarB is an odd");
    }
        if(varA < 0) {
            System.out.println(varA + " is negative");
        }else{
            System.out.println(varA + " is positive");
}
        if(varB < 0) {
            System.out.println(varB + " is negative");
        }else{
            System.out.println(varB + " is positive");
        }
        if(varA < 100) {
            System.out.println(varA + " is less than 100");
        }else{
            System.out.println(varA + " is more than 100");
        }
        if(varB < 100) {
            System.out.println(varB + " is less than 100");
        }else{
            System.out.println(varB + " is more than 100");
        }
        System.out.println(varA + varB);
        double result = (int)(Math.round ((varA - varB) * 100.0))/100.0;;
        System.out.println(result);

        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println(df.format(result));

           }
    }