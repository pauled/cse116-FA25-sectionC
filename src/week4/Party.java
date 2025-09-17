package week4;

import java.util.ArrayList;

public class Party {
    private ArrayList<Character> members;
    private int battlesWon;

    public Party(){
        this.battlesWon=0;
        this.members=new ArrayList<>();
    }
    public void addCharacter(Character member){
        this.members.add(member);
    }
    public void winBattle(int xp){
        this.battlesWon+=1;
        for (int x=0;x<this.members.size();x++){
            this.members.get(x).winBattle(xp);
        }
    }
    public String toString(){
        String out="";
        out+="Battles won: "+this.battlesWon+"\n";
        for (int x=0;x<this.members.size();x++){
            out+="-"+this.members.get(x)+"\n";
        }
        return out;
    }

    public static void main(String[] args) {
        Character c1=new Character();
        Character c2=new Character();
        Party p=new Party();
        p.addCharacter(c1);
        p.winBattle(10);
        p.addCharacter(c2);
        p.winBattle(20);
        System.out.println(p);
    }
}
