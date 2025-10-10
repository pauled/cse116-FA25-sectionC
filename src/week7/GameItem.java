package week7;


public abstract class  GameItem {
    protected double xLoc;
    private double yLoc;

    public GameItem(double x,double y){
        this.xLoc=x;
        this.yLoc=y;
    }
    public void move(double dx,double dy){
        this.xLoc+=dx;
        this.yLoc+=dy;
    }
    //public abstract void use(Player player);
    public String toString(){
        String out="loc: ("+this.xLoc+",";
        out+=this.yLoc+") ";
        return out;
    }
}
