import java.util.Scanner;
public class adlib {
    public static void game1(){
        int lives = 3;
        Scanner input = new Scanner(System.in);
        while (lives > 0){
            System.out.println("Question 1: ");
            String name1 = input.nextLine();
            if (name1.equals("21 Savage")){
                System.out.println("Correct!");
            }
            else{
                System.out.println("Incorrect!");
                lives -= 1;
            }
            System.out.println("Question 2: ");
            String name2 = input.nextLine();
            if (name2.equals("Migos")){
                System.out.println("Correct!");
            }
            else{
                System.out.println("Incorrect!");
                lives -= 1;
            }
            System.out.println("Question 3: ");
            String name3 = input.nextLine();
            if (name3.equals("Travis Scott")){
                System.out.println("Correct!");
            }
            else{
                System.out.println("Incorrect!");
                lives -= 1;
            }
            System.out.println("Question 4: ");
            String name4 = input.nextLine();
            if (name4.equals("Playboi Carti")){
                System.out.println("Correct!");
            }
            else{
                System.out.println("Incorrect!");
                lives -= 1;
            }
            System.out.println("Question 5: ");
            String name5 = input.nextLine();
            if (name5.equals("Lil Uzi Vert")){
                System.out.println("Correct!");
            }
            else{
                System.out.println("Incorrect!");
                lives -= 1;
            }
            System.out.println("Question 6: ");
            String name6 = input.nextLine();
            if (name6.equals("Drake")){
                System.out.println("Correct!");
            }
            else{
                System.out.println("Incorrect!");
                lives -= 1;
            }
            System.out.println("Question 7: ");
            String name7 = input.nextLine();
            if (name7.equals("Pusha T")){
                System.out.println("Correct!");
            }
            else{
                System.out.println("Incorrect!");
                lives -= 1;
            }
            System.out.println("Question 8: ");
            String name8 = input.nextLine();
            if (name8.equals("Westside Gunn")){
                System.out.println("Correct!");
            }
            else{
                System.out.println("Incorrect!");
                lives -= 1;
            }
            System.out.println("Congratulations! You beat the adlib game!");
        }
        System.out.println("Sorry, you lost...");
    }
}
