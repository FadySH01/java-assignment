package Java.Project.NIITProject;
import java.util.*;
import java.io.*;

        public class TrillionaireMind {
            public static void main(String[] args) {

                Scanner scan = new Scanner(System.in);
                int score = 0;
                int lives = 3;

                System.out.println("🎮====================================🎮");
                System.out.println("   WELCOME TO RIDDLE QUEST: MIND HUNT");
                System.out.println("🎮====================================🎮");
                System.out.print("Enter your name, future trillionaire: ");
                String name = scan.nextLine();

                System.out.println("\nHello " + name + "! 🧠");
                System.out.println("Get ready to test your logic and wit.");
                System.out.println("You have " + lives + " lives. Each correct answer gives you +10 points!");
                System.out.println("Let's begin...\n");
                System.out.println("--------------------------------\n");

                // === Stage 1 ===
                System.out.println("Stage 1: I speak without a mouth and hear without ears. I have no body, but I come alive with wind. What am I?");
                String answer1 = scan.nextLine();
                if (answer1.equalsIgnoreCase("echo")) {
                    System.out.println("✅ Correct!");
                    score += 10;
                } else {
                    System.out.println("❌ Wrong! The answer was 'Echo'.");
                    lives--;
                }
                System.out.println("Score: " + score + " | Lives: " + lives);
                System.out.println("--------------------------------\n");

                // === Stage 2 ===
                if (lives > 0) {
                    System.out.println("Stage 2: The more of this you take, the more you leave behind. What is it?");
                    String answer2 = scan.nextLine();
                    if (answer2.equalsIgnoreCase("footsteps")) {
                        System.out.println("✅ Correct!");
                        score += 10;
                    } else {
                        System.out.println("❌ Wrong! The answer was 'Footsteps'.");
                        lives--;
                    }
                    System.out.println("Score: " + score + " | Lives: " + lives);
                    System.out.println("--------------------------------\n");
                }

                // === Stage 3 ===
                if (lives > 0) {
                    System.out.println("Stage 3: What has keys but can’t open locks?");
                    String answer3 = scan.nextLine();
                    if (answer3.equalsIgnoreCase("piano")) {
                        System.out.println("✅ Correct!");
                        score += 10;
                    } else {
                        System.out.println("❌ Wrong! The answer was 'Piano'.");
                        lives--;
                    }
                    System.out.println("Score: " + score + " | Lives: " + lives);
                    System.out.println("--------------------------------\n");
                }

                // === Stage 4 ===
                if (lives > 0) {
                    System.out.println("Stage 4: What runs but never walks, has a bed but never sleeps?");
                    String answer4 = scan.nextLine();
                    if (answer4.equalsIgnoreCase("river")) {
                        System.out.println("✅ Correct!");
                        score += 10;
                    } else {
                        System.out.println("❌ Wrong! The answer was 'River'.");
                        lives--;
                    }
                    System.out.println("Score: " + score + " | Lives: " + lives);
                    System.out.println("--------------------------------\n");
                }

                // === Stage 5 ===
                if (lives > 0) {
                    System.out.println("Stage 5: I’m tall when I’m young, and I’m short when I’m old. What am I?");
                    String answer5 = scan.nextLine();
                    if (answer5.equalsIgnoreCase("candle")) {
                        System.out.println("✅ Correct!");
                        score += 10;
                    } else {
                        System.out.println("❌ Wrong! The answer was 'Candle'.");
                        lives--;
                    }
                    System.out.println("Score: " + score + " | Lives: " + lives);
                    System.out.println("--------------------------------\n");
                }

                // === End Game ===
                System.out.println("\n🎮 GAME OVER 🎮");
                System.out.println("Final Score: " + score);
                System.out.println("Lives left: " + lives);

                try (FileWriter writer = new FileWriter("TrillionaireScore.txt", true)) {
                    writer.write("Player: " + name + ", Score: " + score + ", Lives: " + lives + "\n");
                    System.out.println("📁 Your result has been saved to TrillionaireScore.txt");
                } catch (IOException e) {
                    System.out.println("Error saving score: " + e.getMessage());
                }

                System.out.println("\nThanks for playing, " + name + "! Keep that trillionaire mindset alive 🧠💎");
                scan.close();
            }
        }


