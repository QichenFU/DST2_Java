import java.util.Scanner;

public class T6 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int sum=0;
        int count=0;
        while (true)
        {int x=in.nextInt();
        if (x<0) {break;}
        sum+=x;
        count++;
        
    }
        if (count==0) System.out.println("None");
        else {System.out.printf("%.2f\n", (double)sum/count);}
        System.out.println(10^6);
        in.close();
    }
}
