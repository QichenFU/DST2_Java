import java.util.Scanner;

public class Hello {
    public static void main(String[] args){ 
        Scanner in = new Scanner(System.in);
        String a = in.next();
        System.out.println(a);
        int cm=in.nextInt();
        double mid=cm/30.48;
        int foot = (int)(mid);
        double inch =(mid-foot)*12;
        System.out.printf("%d %d\n",foot,(int)inch);
        in.close();
        System.out.println(6/3);
    }
}