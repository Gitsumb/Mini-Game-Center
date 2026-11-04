import java.util.Scanner;
public class hangman {
    public static void game2(){
        String again = "yes";
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the hangman game! Guess the word by typing in one letter at a time. You have 3 mistakes until you lose.");
        while (again.equals("yes")){
            String word = "two words";
            String known = "___ _____";
            boolean gameOn = true;
            int lives = 3;
            while (gameOn == true && lives > 0) {
                boolean isFound = false;
                System.out.println(known);
                String letter = input.nextLine();
                for (int j = 0; j < word.length(); j++) {
                    if (word.substring(j, j + 1).equals(letter)){
                        known = known.substring(0, j) + letter + known.substring(j + 1);
                        isFound = true;
                    }
                }
                if (isFound == false){
                        lives --;
                        System.out.println("Incorrect. You have " + lives + " lives remaining.");
                    }
                if (known.equals(word)){
                    System.out.println("You win!");
                    gameOn = false;
                }
                if (lives == 0){
                    System.out.println("You lose!");
                    gameOn = false;
                }
            }
        System.out.println("Do you want to play again? Type yes or no.");
        again = input.nextLine();
        }
        System.out.println("Sending you back to the menu...");
        menu.selection(); 
    }
}
