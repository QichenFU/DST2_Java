import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Move a = new Move();
        Boolean meetprincess = false;
        Boolean meetmonster = false;
        Scanner in = new Scanner(System.in);
        String input = "";
        while (meetprincess == false & meetmonster == false) {
            System.out.println("Welcome to the " + a.getcurrentlocation() + ". There are " + a.getcurrentexit().size() + " exits as: " + a.getcurrentexit().toString());
            System.out.println("Enter your command:");
            input = in.nextLine();
            a.moving(input);
            if (a.getcurrentlocation() == a.getmonster()){
                System.out.println("You meet a monster. Game over!");
                meetmonster = true;
            }
            if (a.getcurrentlocation() == a.getprincess()){
                System.out.println("You meet the princess. Please bring her out of the castle!");
                meetprincess = true;
            }

        }
        while (meetprincess == true & meetmonster == false & a.getcurrentlocation()!=5){
            System.out.println("Welcome to the " + a.getcurrentlocation() + ". There are " + a.getcurrentexit().size() + " exits as: " + a.getcurrentexit().toString());
            System.out.println("Enter your command:");
            input = in.nextLine();
            a.moving(input);
            if (a.getcurrentlocation() == a.getmonster()){
                System.out.println("You meet a monster. Game over!");
                meetmonster = true;
            }
        }
        if (meetprincess == true & meetmonster == false) {
            System.out.println("Congratulations! You win!");
        }
        in.close();
    }
}
