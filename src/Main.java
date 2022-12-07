import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Unfinished Bit Life!");
        System.out.println("Would you like to begin?");
        String answer = scan.nextLine();


        if (answer.equals("no") || answer.equals("No")) {
            System.out.println("ok bye");
        } else if (answer.equals("yes") || answer.equals("Yes")) {
            Game hi = new Game();
            System.out.println("What is your profile name?");
            hi.userName = scan.nextLine();

            System.out.println("Welcome to Bit Life, " + hi.userName + "! \nLet's see where life takes you.. Good luck!");
            hi.Beginning();
            hi.Childhood();
            hi.BeginningRecap();
            if (hi.life) {
                hi.School();
                hi.Adulthood();
            }else{
                System.out.println("Game over.");
            }

            }else {
                System.out.println("give a real answer next time");
            }
        }
    }
