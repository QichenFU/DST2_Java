import java.util.Scanner;
public class T22 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int s=0;
    String str=null;
    while(sc.hasNext()){
      if(sc.hasNextInt()){//判断是否是数字
      s+=sc.nextInt();
        
      }else{
        str=sc.next();//不写这句话会导致只会加非数字前数字的和，必须将这个非数字字符串吸收了
      }
        
    }
    System.out.println(s);
    if(str!=null){
      System.out.println("attention");
    }sc.close();
  }
}
