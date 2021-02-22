import java.util.ArrayList;
import java.util.List;

public class Move {
    private int location;
    private int monster=5;
    private int princess=5;
    // private String move;
    public Move()
    {
        location=5;
        while (true) {
            if (monster==5){
            monster=(int)(Math.random()*9+1);}
            else {break;}
        }
        while (true) {
            if (princess==5|princess == monster){
            princess=(int)(Math.random()*9+1);}
            else {break;}
        }
    }
    public void moving (String move)
    {
        if (move.equals("go east")) {
                location++;
        }
        if (move.equals("go west")) {
                location=location-1;
        }
        if (move.equals("go up")) {
                location=location-3;
        }
        if (move.equals("go down")) {
                location=location+3;
        }
    }
    public int getcurrentlocation()
    {
        return location;
    }
    public int getmonster()
    {
        return monster;
    }
    public int getprincess()
    {
        return princess;
    }
    public List getcurrentexit()
    {
        List <String> exits = new ArrayList <String>();
        if (location/3==2 | location/3==1){
            exits.add("up");
        }
        if (location/3==0 | location/3==1){
            exits.add("down");
        }
        if (location%3==0 | location%3==2){
            exits.add("west");
        }
        if (location%3>=0 | location%3<2){
            exits.add("east");
        }
        return exits;
    }
}
