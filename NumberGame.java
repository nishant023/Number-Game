import java.util.Scanner;
import java.util.Random;

    public class NumberGame {


    public static void game(){
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();
        int count=0;
        while (true){
            System.out.println("Enter your guess:");//To input guessed number
            int guess_number=sc.nextInt();
            count++;
            int random_number=rand.nextInt(1,100);
            System.out.println("Random number is:"+random_number); //Generate random number and print it

            //if guessed number is entered more than 5 time it will break out of the loop
            if (count==5) {
                System.out.println("Not able to guess.You loss.");
                break;
            }

            //conditions of the game
            if(guess_number<random_number){
                System.out.println("GUESS IS TOO LOW");
            }
            else if(guess_number>random_number){
                System.out.println("GUESS IS TOO HIGH");
            }
            else if (guess_number==random_number) {
                System.out.println("GUESS IS CORRECT");
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        game(); //calling method

        //to play again the game
        while (true) {
            System.out.println("Do you want to play again.");
            System.out.println("Enter 'yes' to play,Enter  'no' to exit the game");
            String input= sc.next();
            if(input.equals("yes")){
                game();
            }
            else if (input.equals("no")) {
                break;
            }
        }
    }
}