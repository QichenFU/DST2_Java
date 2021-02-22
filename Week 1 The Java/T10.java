import java.util.Scanner;

public class T10 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt()-1;
        int count = 2;
        int count1 = 1;
        int count2 = 3;
        int b=0;
        int res=2;
        while (count1<=a){{while (count<count2){
            if (count2%count==0){
            b++;
            }
            count=count+1;
        }}
        if (b==0){
            res=res+count2;
            count1++;}
     count=2;
     b=0;
     count2++;}
     System.out.println(res);
     in.close();}
}
