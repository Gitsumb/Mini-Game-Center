import java.util.Scanner;
public class menu {
    public static void selection(){
            Scanner input = new Scanner(System.in);
        System.out.println("What game do you want to play? 1. Adlib Game 2. Hangman ");
        int game = input.nextInt();
        if (game == 1){
            adlib.game1();
        }
        else if (game == 2){
            hangman.game2();
        }
        else{
            System.out.println("I hope you enjoyed your time with these minigames!");
    }
}
}
