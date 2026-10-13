import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("What game do you want to play? 1. Adlib Game 2. Hangman ");
        int game = input.nextInt();
        if (game == 1){
            System.out.println("Great! You are going to play the Adlib Game!");
        }
        else if (game == 2){
            System.out.println("Great! You are going to play Hangman!");
        }
        else{
            System.out.println("I hope you enjoyed your time with these minigames!");
    }
    }
}
