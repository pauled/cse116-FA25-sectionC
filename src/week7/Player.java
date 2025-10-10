package week7;

public class Player extends GameItem{
    private int maxHP;
    private int HP;
    private int damageDealt;

    public Player(int maxHP, double x,double y){
        super(x,y);
        this.maxHP=maxHP;
        this.HP=maxHP;
        this.damageDealt=4;
    }
    public Player(int maxHP){
        super(0,0);
        this.maxHP=maxHP;
        this.HP=maxHP;
        this.damageDealt=4;
    }

    public int getHP(){
        return this.HP;
    }
    public int getMaxHP(){
        return this.maxHP;
    }
    public int getDamageDealt(){
        return this.damageDealt;
    }
    public void setDamageDealt(int damage){
        this.damageDealt=damage;
    }
    public void takeDamage(int amount){
        this.HP-=amount;
    }
    public void attack(Player otherPlayer){
        otherPlayer.takeDamage(this.damageDealt);
    }
    public String toString(){
        String out="Health "+this.HP+"/"+this.maxHP;
        out+=" attack: "+this.damageDealt;
        out+=" "+super.toString();
        return out;
    }
    public static void main(String[] args) {
        week4.Player p1=new week4.Player(10);
        week4.Player p2=new week4.Player(9);
        week4.Player p3=p1;
        int temp=p1.getHP();
        p1.attack(p2);
        System.out.println( p1.toString());
    }
}
