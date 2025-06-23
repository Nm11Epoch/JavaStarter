import java.util.Scanner;


public class TicTacToe{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("How llllong do you want the base of your triangle to be? ");
        int base = scan.nextInt();
        String plus = "";
        for (int x = 0; x < base; x ++) {
            plus += "+"; 
            System.out.println(plus);
            } 
    }
        
}

        

