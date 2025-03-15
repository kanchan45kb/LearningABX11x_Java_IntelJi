package operator;

import java.util.Scanner;

public class evenoddmaxnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        String numberType1,numberType2,maxnumber;
       System.out.println(numberType1 = (number1 % 2 == 0) ? "Number1 is even" : "Number1 is odd");
        System.out.println(numberType2 = (number2 % 2 == 0) ? "Number2 is even" : "Number2 is odd");
        System.out.println (maxnumber =(number1>number2)?"Number1 is greater":"Number2 is greater");
    }
}
