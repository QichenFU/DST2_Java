import java.util.Scanner;

public class T2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int cnt = 0;
        while (in.hasNextInt()){
            String s = in.next();
            if (s.equals("pass")){
                  cnt++;
            }
        }
        System.out.println(cnt);
        System.out.println("e23wrw");
        in.close();
    }
}