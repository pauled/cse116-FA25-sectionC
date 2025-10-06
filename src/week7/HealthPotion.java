package week7;

import week4.Player;

public class HealthPotion extends GameItem{
    private int increase;

    public HealthPotion(double x,double y,int incrse){
        super(x,y);
        this.increase=incrse;
    }

    @Override
    public void use(Player player) {
        player.takeDamage(-this.increase);
    }
}
