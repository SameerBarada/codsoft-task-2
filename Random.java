import java.util.*;
public class Random {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of times or trails");
        int chance = sc.nextInt();
        int guess,i;
        int num =1+(int)(100*Math.random());
        System.out.println("A number has been choosen between 0 to 100");
         System.out.println("Guess the num");
         for(i=0;i<chance;i++){
            guess = sc.nextInt();
            if(guess == num){
                System.out.println("You have guessed the right number");
                break;
            }
            else if(guess > num){
                System.out.println("Too big");
            }
            else if(guess < num){
                System.out.println("Too short");
            }
         }
         if(i == chance){
            System.out.println("Sorry you Missed it..Better luck next time");
         }
    }
}
