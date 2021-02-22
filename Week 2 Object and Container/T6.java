import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Set;
import java.util.Map.Entry;

public class T6 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        TreeMap <String, String> name = new TreeMap <String, String>();
        List <String> course = new ArrayList <String>();
        TreeMap<String, TreeMap<String, Double>> coursetomark=new TreeMap <String, TreeMap<String, Double>>();
        Double coursemark = 0.0;
        while (true){
        String line = in.nextLine();
        if (! line.equals("END")) {
        String[] a = line.split(", ");
        if (a.length==2) {
            name.put(a[0],a[1]);
        }

            // 3190110xxx, Name; TreeMap<String, String> idToName;
            // 3190110xxx, Course Name, Course Mark; 
            
            
            // TreeMap<Long, String> idToName;
            // Set<Long> keys = idToName.keySet();
            // for (Entry<Long, String> idName : idToName.entrySet()) {

            // }

            // if (a.length == 3) {
            //     id = a[1];
            //     courseName = a[2];
            //     courseMark = Float.parseFloat(a[2]);
            // }
        if (a.length==3){
            coursemark=Double.parseDouble(a[2]);
            String ids=a[0];
                if (course.contains(a[1])){
                    (coursetomark.get(a[1])).put(ids,coursemark);
                }
                else{
                    course.add(a[1]);
                    coursetomark.put(a[1],new TreeMap<String,Double>());
                    (coursetomark.get(a[1])).put(ids,coursemark);
            }   
        }
        }
        else {
            break;
        }
    }
    Set<String> keys = name.keySet();
    Set<String> keys2 = coursetomark.keySet();
    ArrayList <String> alphacourse = new ArrayList <String>(keys2);
    ArrayList <String> id = new ArrayList <String>(keys);
    int numname=name.size();
    int numcourse=coursetomark.size();
    String firstline="student id, name, ";
    for (int d=0;d<numcourse;d++){
        firstline=firstline+alphacourse.get(d)+", ";
    }
    System.out.println(firstline+"average");
    for (int j=0;j<numname;j++){
        Double marktemp=0.0;
        String outputtemp=id.get(j)+", "+name.get(id.get(j));
        float cnt=0;
        for (int k=0;k<numcourse;k++){
            TreeMap <String,Double> temp = coursetomark.get(alphacourse.get(k));
            if (temp.containsKey(id.get(j))){
                  marktemp=marktemp+temp.get(id.get(j));
                  cnt=cnt+1;
                  outputtemp=outputtemp+", "+temp.get(id.get(j));
            }
            else {
                outputtemp=outputtemp+", ";
            }
         }
         System.out.println(outputtemp+", "+((Math.round(marktemp/cnt*10.0))/10.0));

    }
    // while (index < name.size()){
    //     System.out.println(name.;
    // }
    // Float b = la.get("3180111430");
    in.close();
    }
}
