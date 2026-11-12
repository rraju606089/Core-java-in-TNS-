package Day06.Game;

import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args){
        Random random = new Random();
        int sysInput = random.nextInt(11);
        int attempt = 0;
        boolean isGameOver=false;
        Scanner sc=new Scanner(System.in);

        while(!isGameOver){
            System.out.println("Choose the number between 0 to 10");
         int userInput = sc.nextInt();
            if(sysInput==userInput){
                System.out.println("Game is over ");
                attempt++;
                isGameOver=true;
                System.out.println("user input = "+userInput);
                System.out.println("system input = "+sysInput);
                System.out.println("Attempts = "+attempt);
            }
            else if(userInput>10 || userInput<0){
                System.out.println("Please Choose the correct Number ");
                userInput=sc.nextInt();
                attempt++;
            }
           else{
            attempt++;
            System.out.println("Number is not matched with system number ");
           }
        }


    }
}
