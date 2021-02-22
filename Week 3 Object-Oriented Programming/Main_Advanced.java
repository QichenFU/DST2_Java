import java.util.Scanner;

public class Main_Advanced {
    public static void main (String[] args){
        Move_Advanced b = new Move_Advanced();
        Boolean meetprincess = false;
        Boolean meetmonster = false;
        Scanner in = new Scanner(System.in);
        String input = "";
        b.intialization();
        while (meetprincess == false && meetmonster == false) {
            System.out.println("Welcome to the " + b.getroomname() + ". There are " + b.getcurrentexit().size() + " exits as: " + b.getcurrentexit().toString());
            System.out.println("Enter your command:");
            input = in.nextLine();
            b.moving(input);
            if (b.getcurrentlocation()[0] == b.getmonster()[0] && b.getcurrentlocation()[1] == b.getmonster()[1]){
                System.out.println("You meet a monster. Game over!");
                meetmonster = true;
            }
            if (b.getcurrentlocation()[0] == b.getprincess()[0] && b.getcurrentlocation()[1] == b.getprincess()[1]){
                System.out.println("You meet the princess. Please bring her out of the castle!");
                meetprincess = true;
            }

        }
        while ((meetprincess == true) && (meetmonster == false) && ((b.getcurrentlocation()[0]!=3) || (b.getcurrentlocation()[1]!=3))){
            System.out.println("Welcome to the " + b.getroomname() + ". There are " + b.getcurrentexit().size() + " exits as: " + b.getcurrentexit().toString());
            System.out.println("Enter your command:");
            input = in.nextLine();
            b.moving(input);
            if (b.getcurrentlocation()[0] == b.getmonster()[0] && b.getcurrentlocation()[1] == b.getmonster()[1]){
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
