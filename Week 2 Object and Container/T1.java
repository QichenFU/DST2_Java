import java.util.Scanner;

public class T1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        int d=in.nextInt();
        StringBuffer sb = new StringBuffer();
        for (int e=0;e<=a;e++){
            sb.append(e);
        }
        String s = sb.toString();
        int leng = s.length();
        int cnt=0;
        for (int z=b;z<=c;z++){
            if (s.charAt(z)==d+'0'){
                cnt++;
            }
        }
        System.out.println(leng+" "+cnt);
        in.close();
    }
}
