package week9;

import week7.GameItem;

import java.util.ArrayList;

public class Player extends GameItem {
    private int maxHP;
    private int HP;
    private int damageDealt;
    ArrayList<Usable> inventory=new ArrayList<>();

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
    public void pickUpItem(Usable u1){
        this.inventory.add(u1);
    }
    public void useAll(){
        for (Usable item : this.inventory){
            item.use(this);
        }
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
    public void attack(week7.Player otherPlayer){
        otherPlayer.takeDamage(this.damageDealt);
    }
    public String toString(){
        String out="Health "+this.HP+"/"+this.maxHP;
        out+=" attack: "+this.damageDealt;
        out+=" "+super.toString();
        return out;
    }/*
    public static void main(String[] args) {
        Usable gm= new Weapon(3,4,5);
        System.out.println(gm);
        //gm.move(10,10);
        //System.out.println(gm);
        Player p1=new Player(10);
        Weapon w1=(Weapon) gm;
        GameItem gm2=w1;
        w1.use(p1);
        gm.use(p1);
        w1.move(10,10);
        gm2.move(10,10);
        gm.move(10,10);
        //gm2.use(p1);
        System.out.println((double)4/(double)6);
    }*/
}

