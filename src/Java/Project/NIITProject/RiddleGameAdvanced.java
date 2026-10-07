package Java.Project.NIITProject;

import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

    public class RiddleGameAdvanced {
        private static Clip backgroundClip;

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            playBackgroundMusic("C:\\Users\\olagunju\\IdeaProjects\\Java ASS\\sound.wav");

            System.out.println("🎮 Welcome to The Ultimate Riddle Quest!");
            System.out.println("========================================");
            System.out.println("This game has 2 stages with 5 questions each...");
            System.out.println("You need at least 4 correct to move on from Stage 1.");
            System.out.println("If you answer 8 or more correctly, you will become a 🏆 Riddle Legend!");
            System.out.println("----------------------------------------\n");

            int totalScore = 0;

            // Stage 1
            System.out.println("🔥 Stage 1 Begins!");
            totalScore += stageOne(input);

            if (totalScore >= 4) {
                System.out.println("\n🎉 You passed Stage 1! Welcome to Stage 2...");
                System.out.println("----------------------------------------");
                totalScore += stageTwo(input);

                if (totalScore >= 8) {
                    System.out.println("\n🏆 Congratulations, Riddle Legend! You scored " + totalScore + " out of 10!");
                    showTrophy("C:\\Users\\olagunju\\IdeaProjects\\Java ASS\\trophy.png");
                    playSoundEffect("C:\\Users\\olagunju\\IdeaProjects\\Java ASS\\correct.wav");
                } else {
                    System.out.println("\n⚠️ You scored " + totalScore + " out of 10. You didn’t reach Legend level.");
                    System.out.println("⬅️ Try again to become the true Riddle Legend!");
                    playSoundEffect("C:\\Users\\olagunju\\IdeaProjects\\Java ASS\\wrong.wav");
                }
            } else {
                System.out.println("\n❌ You scored below 4 in Stage 1. Please try again!");
                playSoundEffect("C:\\Users\\olagunju\\IdeaProjects\\Java ASS\\wrong.wav");
            }

            saveScore(totalScore);
            stopBackgroundMusic();

            System.out.println("\nThanks for playing, Hero!");
            System.out.println("Developed by Olagunju Fadilulah Abidemi Adeniran ✨");
        }

        // Stage 1 questions
        private static int stageOne(Scanner input) {
            int score = 0;

            score += askQuestion(input, "1. What has to be broken before you can use it?", "egg");
            score += askQuestion(input, "2. What has keys but can’t open locks?", "piano");
            score += askQuestion(input, "3. What runs around a house but doesn’t move?", "fence");
            score += askQuestion(input, "4. What goes up but never comes down?", "age");
            score += askQuestion(input, "5. What has words but never speaks?", "book");

            return score;
        }

        // Stage 2 questions
        private static int stageTwo(Scanner input) {
            int score = 0;

            score += askQuestion(input, "6. I’m tall when I’m young, and short when I’m old. What am I?", "candle");
            score += askQuestion(input, "7. What can you catch but not throw?", "cold");
            score += askQuestion(input, "8. What month has 28 days?", "all");
            score += askQuestion(input, "9. What is always in front of you but can’t be seen?", "future");
            score += askQuestion(input, "10. What has many teeth but can't bite?", "comb");

            return score;
        }

        // Ask a single question
        private static int askQuestion(Scanner input, String question, String correctAnswer) {
            System.out.println(question);
            String answer = input.nextLine().trim().toLowerCase();

            if (answer.contains(correctAnswer)) {
                System.out.println("✔️ Correct!\n");
                playSoundEffect("C:\\Users\\olagunju\\IdeaProjects\\Java ASS\\correct.wav");
                return 1;
            } else {
                System.out.println("❌ Wrong! The correct answer is: " + correctAnswer + "\n");
                playSoundEffect("C:\\Users\\olagunju\\IdeaProjects\\Java ASS\\wrong.wav");
                return 0;
            }
        }

        // Background music
        public static void playBackgroundMusic(String filepath) {
            try {
                File musicPath = new File(filepath);
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
                backgroundClip = AudioSystem.getClip();
                backgroundClip.open(audioInput);
                backgroundClip.loop(Clip.LOOP_CONTINUOUSLY);
            } catch (Exception e) {
                System.out.println("Error playing background music: " + e.getMessage());
            }
        }

        public static void stopBackgroundMusic() {
            if (backgroundClip != null && backgroundClip.isRunning()) {
                backgroundClip.stop();
            }
        }

        // Sound effects
        public static void playSoundEffect(String filepath) {
            new Thread(() -> {
                try {
                    File soundFile = new File(filepath);
                    AudioInputStream audioInput = AudioSystem.getAudioInputStream(soundFile);
                    Clip effectClip = AudioSystem.getClip();
                    effectClip.open(audioInput);
                    effectClip.start();
                } catch (Exception e) {
                    System.out.println("Error playing sound effect: " + e.getMessage());
                }
            }).start();
        }

        // Trophy popup
        public static void showTrophy(String imagePath) {
            JFrame frame = new JFrame("🏆 Riddle Legend Trophy");
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame.setSize(400, 500);

            JLabel imageLabel = new JLabel(new ImageIcon(imagePath));
            JLabel text = new JLabel("🏆 Congratulations, Riddle Legend!", SwingConstants.CENTER);
            text.setFont(new Font("Segoe UI", Font.BOLD, 18));
            frame.setLayout(new BorderLayout());

            frame.add(imageLabel, BorderLayout.CENTER);
            frame.add(text, BorderLayout.SOUTH);

            frame.setVisible(true);
        }

        // Save score
        public static void saveScore(int score) {
            try {
                FileWriter writer = new FileWriter("scores.txt", true);
                writer.write("Player Score: " + score + " out of 10\n");
                writer.close();
            } catch (IOException e) {
                System.out.println("Error saving score: " + e.getMessage());
            }
        }
        public static void playApplauseSound(String filepath) {
            try {
                File soundFile = new File("C:\\Users\\olagunju\\IdeaProjects\\Java ASS\\applause.wav");
                if (soundFile.exists()) {
                    AudioInputStream audioInput = AudioSystem.getAudioInputStream(soundFile);
                    Clip applauseClip = AudioSystem.getClip();
                    applauseClip.open(audioInput);
                    applauseClip.start();
                    applauseClip.loop(Clip.LOOP_CONTINUOUSLY); // 🎉 Loop applause until manually stopped
                } else {
                    System.out.println("Applause sound file not found: " + filepath);
                }
            } catch (Exception e) {
                System.out.println("Error playing applause sound: " + e.getMessage());
            }
        }


    }

