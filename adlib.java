//all of these imports except scanner are for audio and were AI generated
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.CountDownLatch;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class adlib {
    //this line is AI generated, used for browser usage when the audio is not avaliable to keep the game going
    //also, all of the audio lines preceded by "playSound" are AI generated. the rest is completely handtyped and no AI assist at all
    private static boolean soundUnavailable;

    public static void game1(){
        String again = "yes";
        Scanner input = new Scanner(System.in);
        while (again.equals("yes")){
            int points = 0;
            System.out.println("Welcome to the adlib game! Guess the name of the artist that says each adlib.");
            playSound("audio/21.wav");
            System.out.println("Question 1: ");
            String name1 = input.nextLine();
            if (name1.equals("21 Savage")){
                System.out.println("Correct!");
                points += 1;
            }
            else{
                System.out.println("Incorrect!");
            }
            playSound("audio/migos.wav");
            System.out.println("Question 2: ");
            String name2 = input.nextLine();
            if (name2.equals("Migos")){
                System.out.println("Correct!");
                points += 1;                
            }
            else{
                System.out.println("Incorrect!");
            }
            playSound("audio/travis.wav");
            System.out.println("Question 3: ");
            String name3 = input.nextLine();
            if (name3.equals("Travis Scott")){
                System.out.println("Correct!");
                points += 1;
            }
            else{
                System.out.println("Incorrect!");
            }
            playSound("audio/carti.wav");
            System.out.println("Question 4: ");
            String name4 = input.nextLine();
            if (name4.equals("Playboi Carti")){
                System.out.println("Correct!");
                points += 1;
            }
            else{
                System.out.println("Incorrect!");
            }
            playSound("audio/uzi.wav");
            System.out.println("Question 5: ");
            String name5 = input.nextLine();
            if (name5.equals("Lil Uzi Vert")){
                System.out.println("Correct!");
                points += 1;
            }
            else{
                System.out.println("Incorrect!");
            }
            playSound("audio/drake.wav");
            System.out.println("Question 6: ");
            String name6 = input.nextLine();
            if (name6.equals("Drake")){
                System.out.println("Correct!");
                points += 1;
            }
            else{
                System.out.println("Incorrect!");
            }
            playSound("audio/pusha.wav");
            System.out.println("Question 7: ");
            String name7 = input.nextLine();
            if (name7.equals("Pusha T")){
                System.out.println("Correct!");
                points += 1;
            }
            else{
                System.out.println("Incorrect!");
            }
            playSound("audio/westside.wav");
            System.out.println("Question 8: ");
            String name8 = input.nextLine();
            if (name8.equals("Westside Gunn")){
                System.out.println("Correct!");
                points += 1;
            }
            else{
                System.out.println("Incorrect!");
            }
            System.out.println("You got " + points + " questions right. Do you want to play again? Type yes or no.");
            again = input.nextLine();
        }
        System.out.println("Sending you back to the menu...");
        menu.selection();
    }

    //this entire class is fully AI generated as well since we do not have audio usage in the standards for this course, but it is still functional
    private static void playSound(String filePath) {
        if (soundUnavailable) {
            return;
        }
        try (AudioInputStream audio = AudioSystem.getAudioInputStream(new File(filePath));
             Clip clip = AudioSystem.getClip()) {
            clip.open(audio);
            CountDownLatch soundFinished = new CountDownLatch(1);
            clip.addLineListener(event -> {
                if (event.getType() == LineEvent.Type.STOP) {
                    soundFinished.countDown();
                }
            });
            clip.start();
            soundFinished.await();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            System.out.println("Could not play sound: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            soundUnavailable = true;
            System.out.println("Audio playback is unavailable here; continuing without sound.");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
