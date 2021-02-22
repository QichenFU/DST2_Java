import java.util.Scanner;


public class T7 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int x=in.nextInt();
        String a=Integer.toString(x);
        int len=a.length()-1;
        int res=0;
        while (true){
            if (x/10==0){res=res+x;break;}
            else {
            double ab=Math.pow(10,len);
            res=res+x/(int)(ab);
            x=x%(int)(ab);
            len=len-1;}
        }
        
        System.out.println(res);
        in.close();
    }

}
