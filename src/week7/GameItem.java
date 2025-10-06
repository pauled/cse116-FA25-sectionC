package week7;

import week4.Player;

public class GameItem {
    private double xLoc;
    private double yLoc;

    public GameItem(double x,double y){
        this.xLoc=x;
        this.yLoc=y;
    }
    public void use(Player player){}
    public String toString(){
        String out="loc: ("+this.xLoc+",";
        out+=this.yLoc+") ";
        return out;
    }
}
