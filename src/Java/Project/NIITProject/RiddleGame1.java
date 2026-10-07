package Java.Project.NIITProject;
import java.util.*;
import java.io.*;
import javax.sound.sampled.*;

    public class RiddleGame1 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            playBackgroundMusic("background.wav");

            System.out.println("🎮 Welcome to The Ultimate Riddle Quest!");
            System.out.println("---------------------------------------");
            System.out.println("There are 5 stages. Answer correctly to advance!");
            System.out.println("Let's begin...\n");

            int score = 0;

            // Stage 1
            System.out.println("Stage 1: What has keys but can’t open locks?");
            String ans1 = input.nextLine().trim().toLowerCase();
            if (ans1.contains("piano")) {
                System.out.println("✅ Correct! Moving to Stage 2...\n");
                score++;
            } else {
                System.out.println("❌ Wrong! The answer is 'piano'.\n");
            }

            // Stage 2
            System.out.println("Stage 2: What has to be broken before you can use it?");
            String ans2 = input.nextLine().trim().toLowerCase();
            if (ans2.contains("egg")) {
                System.out.println("✅ Nice one! On to Stage 3...\n");
                score++;
            } else {
                System.out.println("❌ Oops! The answer is 'egg'.\n");
            }

            // Stage 3
            System.out.println("Stage 3: What runs but never walks?");
            String ans3 = input.nextLine().trim().toLowerCase();
            if (ans3.contains("water") || ans3.contains("river")) {
                System.out.println("✅ You’re sharp! Stage 4 loading...\n");
                score++;
            } else {
                System.out.println("❌ Nope! The answer is 'water' or 'river'.\n");
            }

            // Stage 4
            System.out.println("Stage 4: I’m tall when I’m young, and short when I’m old. What am I?");
            String ans4 = input.nextLine().trim().toLowerCase();
            if (ans4.contains("candle")) {
                System.out.println("✅ Brilliant! Final Stage...\n");
                score++;
            } else {
                System.out.println("❌ Not quite. The answer is 'candle'.\n");
            }

            // Stage 5
            System.out.println("Final Stage: What month of the year has 28 days?");
            String ans5 = input.nextLine().trim().toLowerCase();
            if (ans5.contains("all")) {
                System.out.println("✅ Perfect! You got it right!\n");
                score++;
            } else {
                System.out.println("❌ The correct answer is 'all of them'.\n");
            }

            // Stop the background music
            stopBackgroundMusic();

            // Final Score Summary
            System.out.println("---------------------------------------");
            System.out.println("🎉 Game Over! You scored " + score + " out of 5.");

            if (score == 5) {
                System.out.println("🏆 Congratulations, Champion! You’re unstoppable!");
            } else if (score >= 3) {
                System.out.println("🔥 Great job, you did very well!");
            } else {
                System.out.println("💪 Keep practicing, you’ll master it next time!");
            }

            // Save score to file
            saveScore(score);

            System.out.println("\nThank you for playing The Ultimate Riddle Quest!");
            System.out.println("Developed by Olagunju Fadilulah Abidemi Adeniran 💻");
        }

        // ========== BACKGROUND MUSIC SECTION ==========
        private static Clip clip;

        public static void playBackgroundMusic(String filepath) {
            try {
                File musicPath = new File(filepath);
                if (musicPath.exists()) {
                    AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
                    clip = AudioSystem.getClip();
                    clip.open(audioInput);
                    clip.start();
                    clip.loop(Clip.LOOP_CONTINUOUSLY); // loops music
                } else {
                    System.out.println("Music file not found: " + filepath);
                }
            } catch (Exception e) {
                System.out.println("Error playing music: " + e.getMessage());
            }
        }

        public static void stopBackgroundMusic() {
            if (clip != null && clip.isRunning()) {
                clip.stop();
            }
        }

        // ========== SAVE SCORE SECTION ==========
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

