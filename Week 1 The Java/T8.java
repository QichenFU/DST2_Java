import java.util.Scanner;

public class T8 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int count = 2;
        int b=0;
        if (a==1){System.out.println(a+" is not a prime number.");}
        else{
        while (count<a){
            if (a%count==0){
            b++;
            }
            count=count+1;
        }
        if (b!=0){
            System.out.println(a+" is not a prime number.");
        }
        else{
            System.out.println(a+" is a prime number.");
        }
     }
        in.close();
    }
}
