import java.util.Scanner;

public class T4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s=in.nextLine();
        int leng = s.length();
        int start = 0;
        int end = 0;
        String find = "";
        int cnt=0;
        int a=in.nextInt();
        for (int i=0;i<a;i++){
            
            start = in.nextInt();
            end = in.nextInt();
            find= in.nextLine();
            find=find.trim();
            cnt = 0;
            for (int j=start;j<=end;j++){
                 if (s.charAt(j)==find.charAt(0)){
                    cnt++;
                 }
        
            }
            System.out.println(cnt);
        }

    }
}
