public class Die {
    public final int MAX = 6;  
    public int faceValue;
    public static int step = 1;
    
    public Die() {         
         faceValue = 1;     
     }     
     public static int roll() {         
          faceValue = (int)(Math.random() * MAX) + 1;         
          return faceValue;     
     }     
     public void setFaceValue (int value) {         
          faceValue = value;     
     }     
     public int getFaceValue() {         
          return faceValue;     
     }     
     public String toString() {         
          String result = Integer.toString(faceValue);         
          return result;     
     } 
}
