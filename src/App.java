import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.print("Give me a time of day (0:00 am/pm form): "); // Note: There was an error here where exactly one input failed until we rearranged them.
        String time = scan.nextLine();
        System.out.print("Finally, give me a verb: ");
        String verb = scan.nextLine();
        System.out.print("Give me a noun: ");
        String noun = scan.nextLine();
        System.out.print("Give me an adjective: ");
        String adjective = scan.nextLine();
        System.out.print("Give me a number: ");
        int number = scan.nextInt();
        System.out.println("Okay! Your sentence is:");
        System.out.println("The " + adjective + " " + noun + " " + verb + " " + number + " times at " + time + ".");
        
    }
}
