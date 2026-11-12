package Day06.inputOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter Your Age");
        Scanner sc=new Scanner(System.in);
        int age = sc.nextInt();

        System.out.println("age is = " + age);

        System.out.println("Enter 2 number :");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("sum of the num1 and num 2" +(num1+num2));
    }
}
