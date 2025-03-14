package operator;

import java.util.Scanner;

public class task_13th_TernaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks");
        int marks = sc.nextInt();

        char grade = (90 <= marks ) ? 'A' : (80<= marks) ? 'B' : (70<=marks) ? 'C' :(60<=marks?'D': 'F');
        System.out.println(grade);
    }
}
