package week4;

public class Character {
    private int battlesWon;
    private int XP;

    public Character(){
        this.battlesWon=0;
        this.XP=0;
    }
    public void winBattle(int xp){
        this.battlesWon++;
        this.XP+=xp;
    }
    public String toString(){
        String out="";
        out+="Battles won: "+this.battlesWon+" ";
        out+="XP: "+this.XP;
        return out;
    }
}
