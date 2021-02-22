import java.util.ArrayList;
import java.util.List;

public class Move_Advanced {
    private int[] location = new int[2];
    private int[] monster = new int[2];
    private int[] princess = new int[2]; 
    private int num; // the number of the rooms (randomly assigned, range: 5-15)
    private int col, row; 
    private int i = 1;
    private int [][] a = new int[7][7]; // to record the structure of the castle
    String []roomname =new String[]{"lobby","study 1","study 2","living room","bedroom 2","kitchen","canteen 1","bathroom 1","bathroom 2","chess room","canteen 2","bedroom 1","garden","room with princess","room with monster"};
    String [][]b = new String[7][7]; // to record the roomnames
    public Move_Advanced()
    {
        num = (int)(Math.random()*11) + 5; 
    }
    public void intialization()
    {
        a[3][3]=1;
        location[0]=3;
        location[1]=3;
        b[3][3]= roomname[0];
        while (i <= num-1){
            col = (int)(Math.random() * 5)+1; 
            row = (int)(Math.random() * 5)+1;
            if ((a[row][col] != 1) && ((a[row+1][col] == 1) || (a[row-1][col] == 1) || (a[row][col+1] == 1) || (a[row][col-1] == 1)) && (i <= num-3)){
                a[row][col] = 1;
                b[row][col] = roomname[i];
                i++;
            }
            if ((a[row][col] != 1) && ((a[row+1][col] == 1) || (a[row-1][col] == 1) || (a[row][col+1] == 1) || (a[row][col-1] == 1)) && (i == num-2)){
                a[row][col] = 1;
                b[row][col] = roomname[13];
                princess[0]=row;
                princess[1]=col;
                i++;
            }
            if ((a[row][col] != 1) && ((a[row+1][col] == 1) || (a[row-1][col] == 1) || (a[row][col+1] == 1) || (a[row][col-1] == 1)) && (i == num-1)){
                a[row][col] = 1;
                b[row][col] = roomname[14];
                monster[0]=row;
                monster[1]=col;
                i++;
            }
        }
    }
    public void moving (String move)
    {
        if (move.equals("go east")) {
                location[1]++;
        }
        if (move.equals("go west")) {
                location[1]--;
        }
        if (move.equals("go north")) {
                location[0]--;
        }
        if (move.equals("go south")) {
                location[0]++;
        }
    }
    public int[] getcurrentlocation()
    {
        return location;
    }
    public String getroomname()
    {
        return b[location[0]][location[1]];
    }
    public int[] getmonster()
    {
        return monster;
    }
    public int[] getprincess()
    {
        return princess;
    }
    public List getcurrentexit()
    {
        List <String> exits = new ArrayList <String>();
        if (a[location[0]-1][location[1]] == 1){
            exits.add("north");
        }
        if (a[location[0]+1][location[1]] == 1){
            exits.add("south");
        }
        if (a[location[0]][location[1]-1] == 1){
            exits.add("west");
        }
        if (a[location[0]][location[1]+1] == 1){
            exits.add("east");
        }
        return exits;
    }
}
