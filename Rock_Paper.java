package Day06.Game;

import java.util.Random;
import java.util.Scanner;

public class Rock_Paper {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int userInput = sc.nextInt();

        Random random=new Random();
        int sysInput = random.nextInt(3);

        if(userInput == sysInput){
            System.out.println("Draw");
        }

        else if ((userInput ==0 && sysInput ==2) || (userInput ==2 && sysInput== 1) ||(userInput ==1 && sysInput==0)){
            System.out.println("You Win");
        }
        else{
            System.out.println("You Loss");
        }

        System.out.println("System Input " + sysInput);
        System.out.println("User Input " + userInput);
    }
}
