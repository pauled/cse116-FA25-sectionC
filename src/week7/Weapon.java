package week7;

public class Weapon extends GameItem{
    private int damage;

    public Weapon(double x,double y,int damage){
        super(x,y);
        this.damage=damage;
    }
    public void use(Player player){
        player.setDamageDealt(this.damage);
    }
    public String toString(){
        String out="Damage dealt: "+this.damage+" ";
        out+=super.toString();
        return out;
    }

    public static void main(String[] args) {
        Player p1=new Player(10);
        Weapon w=new Weapon(1,2,20);
        w.use(p1);
        //System.out.println(p1);
        System.out.println(w);
        w.move(10,10);
        System.out.println(w);
        System.out.println(p1);
        p1.move(3,3);
        System.out.println(p1);
    }
}
