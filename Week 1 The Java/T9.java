import java.util.Scanner;

public class T9 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int c = in.nextInt();
        int count = 2;
        int count1=a;
        int b=0;
        int res=0;
        if (a==1){a=a+1;
            count1++;}
        while ((count1>=a) & (count1<=c)){
        while (count<count1){
            if (count1%count==0){
            b++;
            }
            count=count+1;
        }
        if (b==0){
            res=res+count1;
     }
     count=2;
     b=0;
     count1++;
    }
    System.out.println(res);
    in.close();
    }
}

