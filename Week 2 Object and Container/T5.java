import java.util.Scanner;

public class T5 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num =in.nextInt();
        int a =0;
        int rec=0;
        int label=0;
        int[] a1 = new int[num];
        int num1=0;
        for (int i = 0;i<num;i++){
            a = in.nextInt();
            for (int j = 0;j<num1;j++){
                if (a==a1[j]){
                    label++;
                }
            }
            if (label==0){
                a1[num1]=a;rec=i;num1++;
            }
            label=0;
            
        }
        System.out.println(rec);
    }
}
