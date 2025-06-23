import java.util.Scanner;

public class quizGame {
    public static void main(String[] args) throws Exception {
       Scanner scan = new Scanner(System.in);
       int count = 0;
       System.out.println("Welcome to Quiz Game! I will ask you three multiple choice questions.");
       System.out.print("Question 1: What is the value of x in the equation 5x + 4 = 19? A: 2,  B: 2.5, C: 3, or D: 4? ");
       String answer1 = scan.nextLine();
       if (answer1.equals("C") || answer1.equals("c") || answer1.equals("3")) {
        System.out.println("You are correct!");
        count ++;
       }
       else {
        System.out.println("Sorry, that is incorrect. The correct answer was C: 3.");
       }
       System.out.print("Question 2: What is the tallest mountain in the world? A: Denali, B: Fuji, C: Kilimanjaro, or D: Everest? ");
       String answer2 = scan.nextLine();
       if (answer2.equals("D") || answer2.equals("d") || answer2.equals("Everest")) {
       System.out.println("You are correct!");
       count ++;
       }
       else {
        System.out.println("Sorry, that is incorrect. The correct answer was D: Everest.");
    }
    System.out.print("Final Question: What is the capital of Serbia? A: Belgrade, B: Podgorica, C: Athens, or D: Sofia? ");
       String answer3 = scan.nextLine();
       if (answer3.equals("A") || answer3.equals("a") || answer3.equals("Belgrade")) {
       System.out.println("You are correct!");
       count ++;
       }
       else {
        System.out.println("Sorry, that is incorrect. The correct answer was A: Belgrade.");
    }
    System.out.println("You got " + count + " questions correct!");
    }
}