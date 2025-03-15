package operator;

import java.util.Scanner;

public class angleType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter then triangle first side");
        int AB = sc.nextInt();
        System.out.println("Enter then triangle second side");
        int BC = sc.nextInt();
        System.out.println("Enter then triangle third side");
        int CA = sc.nextInt();
        if(AB==BC)
        {
            if(AB==CA){
                System.out.println("The Traingle is Equilateral");
            }
            else{
                System.out.println("The Traingle is Isosceles");
            }
        }
        else
        {
            System.out.println("The Traingle is not scalene");
        }
    }
}
