package Java.Project.NIITProject;


import java.util.*;
import java.io.*;
import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.*;

    public class RiddleGameFinal {

        private static Clip backgroundClip;
        private static Clip applauseClip;

        public static void main(String[] args) {
            // 🎨 Show the game intro background
            showBackgroundWindow("C:\\Users\\olagunju\\IdeaProjects\\Java ASS\\background.jpg");

            Scanner input = new Scanner(System.in);
            playBackgroundMusic("C:\\Users\\olagunju\\IdeaProjects\\Java ASS\\sound.wav");

            System.out.println("🎮 Welcome to The Ultimate Riddle Quest");
            System.out.println("---------------------------------------");
            System.out.println("There are 2 stages. Each stage has 5 riddles.");
            System.out.println("Get at least 4 right in each stage to win the trophy!");
            System.out.println("Let's begin...\n");

            int totalScore = 0;
            int stage1Score = playStage(input, 1);
            totalScore += stage1Score;

            if (stage1Score >= 4) {
                System.out.println("🔥 You passed Stage 1! Onto Stage 2...\n");
                int stage2Score = playStage(input, 2);
                totalScore = stage2Score;

                if (totalScore >= 8) {
                    stopBackgroundMusic();
                    System.out.println("🏆 Congratulations, RiddleLegend! You got " + totalScore + "/10 riddles!");
                    showTrophyWindow("C:\\Users\\olagunju\\IdeaProjects\\Java ASS\\trophy.jpg");
                    playApplauseSound("C:\\Users\\olagunju\\IdeaProjects\\Java ASS\\applause.wav");
                } else {
                    System.out.println("😢 You got " + totalScore + "/10. Try again to become a RiddleLegend!");
                }
            } else {
                System.out.println("❌ You only got " + stage1Score + "/5 in Stage 1. Please try again!");
            }

            saveScore(totalScore);

            System.out.println("\nThanks for playing The Ultimate Riddle Quest!");
            System.out.println("Developed by Olagunju Fadilulah Abidemi Adeniran 💻");
        }

        // ===== PLAY A STAGE =====
        private static int playStage(Scanner input, int stageNumber) {
            String[][] stageQuestions = {
                    // Stage 1
                    {
                            "What has keys but can’t open locks?", "piano",
                            "What has to be broken before you can use it?", "egg",
                            "What runs but never walks?", "water",
                            "I’m tall when I’m young, and short when I’m old. What am I?", "candle",
                            "What month of the year has 28 days?", "all"
                    },
                    // Stage 2
                    {
                            "What is full of holes but still holds water?", "sponge",
                            "What can you catch but not throw?", "cold",
                            "I speak without a mouth and hear without ears. What am I?", "echo",
                            "What has a heart that doesn’t beat?", "artichoke",
                            "What building has the most stories?", "library"
                    }
            };

            int score = 0;
            System.out.println("---------------------------------------");
            System.out.println("🧩 Stage " + stageNumber + " – Let's go!");
            System.out.println("---------------------------------------");

            for (int i = 0; i < stageQuestions[stageNumber - 1].length; i += 2) {
                score += askQuestion(input, stageQuestions[stageNumber - 1][i],
                        stageQuestions[stageNumber - 1][i + 1]);
            }
            System.out.println("Stage " + stageNumber + " Score: " + score + "/5\n");
            return score;
        }

        // ===== ASK QUESTION =====
        private static int askQuestion(Scanner input, String question, String correctAnswer) {
            System.out.println(question);
            String answer = input.nextLine().trim().toLowerCase();

            if (answer.contains(correctAnswer.toLowerCase()) || answer.equals(correctAnswer)) {
                System.out.println("✔️ Correct!\n");
                playSoundEffect("C:\\Users\\olagunju\\IdeaProjects\\Java ASS\\correct.wav");
                return 1;
            } else {
                System.out.println("❌ Wrong! The correct answer is " + correctAnswer + ".\n");
                playSoundEffect("C:\\Users\\olagunju\\IdeaProjects\\Java ASS\\wrong.wav");
                return 0;
            }
        }

        // ===== BACKGROUND MUSIC =====
        public static void playBackgroundMusic(String filepath) {
            try {
                File musicPath = new File(filepath);
                if (musicPath.exists()) {
                    AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
                    backgroundClip = AudioSystem.getClip();
                    backgroundClip.open(audioInput);
                    backgroundClip.start();
                    backgroundClip.loop(Clip.LOOP_CONTINUOUSLY);
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

        // ===== APPLAUSE SOUND =====
        public static void playApplauseSound(String filepath) {
            try {
                File soundFile = new File(filepath);
                if (soundFile.exists()) {
                    AudioInputStream audioInput = AudioSystem.getAudioInputStream(soundFile);
                    applauseClip = AudioSystem.getClip();
                    applauseClip.open(audioInput);
                    applauseClip.start();
                    applauseClip.loop(Clip.LOOP_CONTINUOUSLY);
                } else {
                    System.out.println("Applause sound file not found: " + filepath);
                }
            } catch (Exception e) {
                System.out.println("Error playing applause sound: " + e.getMessage());
            }
        }

        // ===== GENERIC SOUND EFFECT =====
        public static void playSoundEffect(String filepath) {
            new Thread(() -> {
                try {
                    File soundFile = new File(filepath);
                    if (soundFile.exists()) {
                        AudioInputStream audioInput = AudioSystem.getAudioInputStream(soundFile);
                        Clip effectClip = AudioSystem.getClip();
                        effectClip.open(audioInput);
                        effectClip.start();
                    }
                } catch (Exception e) {
                    System.out.println("Error playing sound effect: " + e.getMessage());
                }
            }).start();
        }

        // ===== SHOW BACKGROUND WINDOW =====
        public static void showBackgroundWindow(String imagePath) {
            JFrame frame = new JFrame("🎮 The Ultimate Riddle Quest 🎮");
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame.setSize(800, 600);

            JLabel background = new JLabel(new ImageIcon("C:\\Users\\olagunju\\IdeaProjects\\Java ASS\\background.png"));
            background.setLayout(new BorderLayout());
            frame.add(background);

            JLabel title = new JLabel("Welcome to The Ultimate Riddle Quest!", SwingConstants.CENTER);
            title.setFont(new Font("Arial Black", Font.BOLD, 24));
            title.setForeground(Color.GRAY);
            background.add(title, BorderLayout.SOUTH);

            frame.setVisible(true);
        }

        // ===== SHOW TROPHY =====
        public static void showTrophyWindow(String trophyImagePath) {
            JFrame frame = new JFrame("🏆 Congratulations, RiddleLegend!");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(600, 400);

            JLabel trophy = new JLabel(new ImageIcon("C:\\Users\\olagunju\\IdeaProjects\\Java ASS\\trophy.png"));
            trophy.setLayout(new BorderLayout());
            frame.add(trophy);

            JLabel message = new JLabel("🎊 RiddleLegend – You are unstoppable! 🎊", SwingConstants.CENTER);
            message.setFont(new Font("Segoe UI", Font.BOLD, 20));
            message.setForeground(Color.BLACK);
            trophy.add(message, BorderLayout.SOUTH);

            frame.setVisible(true);
        }

        // ===== SAVE SCORE =====
        public static void saveScore(int score) {
            try {
                FileWriter writer = new FileWriter("scores.txt", true);
                writer.write("Final Score: " + score + "/10\n");
                writer.close();
            } catch (IOException e) {
                System.out.println("Error saving score: " + e.getMessage());
            }
        }
    }

