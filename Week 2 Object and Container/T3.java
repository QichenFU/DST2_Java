import java.util.Scanner;

public class T3 {
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int [][] table = new int [4][3];
    for (int row=0; row < 4;row++)
        for (int col=0;col < 3;col++)
            table[row][col] = in.nextInt();
    int x=0;
    int [] sum = new int[5];
    for (int i=0;i<3;i++){
        x=0;
        for (int j=0;j<4;j++){
             x=x+table[j][i];}
        sum[i]=x;
    }
    {System.out.printf("%d %d %d ", sum[0],sum[1],sum[2]);}
    in.close();
    }
}
