package Java.Project.NIITProject;


import java.util.*;
import java.io.*;
import javax.sound.sampled.*;

public class RiddleGame {
    private static Clip backgroundClip;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        playBackgroundMusic("background.wav");

        System.out.println(" Welcome to The Ultimate Riddle Quest!");
        System.out.println("---------------------------------------");
        System.out.println("There are 5 stages. Answer correctly to advance!");
        System.out.println("Let's begin...\n");

        int score = 0;

        score += askQuestion(input, "Stage 1: What has keys but can’t open locks?", "piano");
        score += askQuestion(input, "Stage 2: What has to be broken before you can use it?", "egg");
        score += askQuestion(input, "Stage 3: What runs but never walks?", "water", "river");
        score += askQuestion(input, "Stage 4: I’m tall when I’m young, and short when I’m old. What am I?", "candle");
        score += askQuestion(input, "Final Stage: What month of the year has 28 days?", "all");


        stopBackgroundMusic();

        System.out.println("---------------------------------------");
        System.out.println("🎉 Game Over! You scored " + score + " out of 5.");

        if (score == 5) {
            System.out.println("🏆 Congratulations, Champion! You’re unstoppable!");
        } else if (score >= 3) {
            System.out.println("🔥 Great job, you did very well!");
        } else {
            System.out.println("💪 Keep practicing, you’ll master it next time!");
        }

        saveScore(score);

        System.out.println("\nThank you for playing The Ultimate Riddle Quest!");
        System.out.println("Developed by Olagunju Fadilulah Abidemi Adeniran 💻");
    }

    private static int askQuestion(Scanner input, String question, String... correctAnswers) {
        System.out.println(question);
        String answer = input.nextLine().trim().toLowerCase();

        for (String correct : correctAnswers) {
            if (answer.contains(correct.toLowerCase())) {
                System.out.println("✅ Correct!\n");
                playSoundEffect("correct.wav");
                return 1;
            }
        }

        System.out.print("Wrong! ");
        if (question.contains("keys")) System.out.println("The answer is 'piano'.\n");
        else if (question.contains("broken")) System.out.println("The answer is 'egg'.\n");
        else if (question.contains("runs")) System.out.println("The answer is 'water' or 'river'.\n");
        else if (question.contains("tall")) System.out.println("The answer is 'candle'.\n");
        else if (question.contains("month")) System.out.println("The answer is 'all of them'.\n");

        playSoundEffect("wrong.wav");
        return 0;
    }

    public static void playBackgroundMusic(String filepath) {
        try {
            File musicPath = new File("C:\\Users\\olagunju\\IdeaProjects\\Java ASS\\sound.wav");
            if (musicPath.exists()) {
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
                backgroundClip = AudioSystem.getClip();
                backgroundClip.open(audioInput);
                backgroundClip.start();
                backgroundClip.loop(Clip.LOOP_CONTINUOUSLY);
            } else {
                System.out.println("Background music file not found: " + filepath);
            }
        } catch (Exception e) {
            System.out.println("Error playing background music: " + e.getMessage());
        }
    }

    public static void stopBackgroundMusic() {
        if (backgroundClip != null && backgroundClip.isRunning()) {
            backgroundClip.stop();
        }
    }

    public static void playSoundEffect(String filepath) {
        new Thread(() -> {
            try {
                File soundFile = new File("C:\\Users\\olagunju\\IdeaProjects\\Java ASS\\sound.wav");
                if (soundFile.exists()) {
                    AudioInputStream audioInput = AudioSystem.getAudioInputStream(soundFile);
                    Clip effectClip = AudioSystem.getClip();
                    effectClip.open(audioInput);
                    effectClip.start();
                } else {
                    System.out.println("Sound effect file not found: " + filepath);
                }
            } catch (Exception e) {
                System.out.println("Error playing sound effect: " + e.getMessage());
            }
        }).start(); // play in a separate thread so it doesn't block the game
    }

    // ===== SAVE SCORE =====
    public static void saveScore(int score) {
        try {
            FileWriter writer = new FileWriter("scores.txt", true);
            writer.write("Player Score: " + score + " out of 5\n");
            writer.close();
        } catch (IOException e) {
            System.out.println("Error saving score: " + e.getMessage());
        }
    }
}