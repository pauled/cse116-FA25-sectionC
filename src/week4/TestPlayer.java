package week4;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestPlayer {
    public static void comparePlayers(Player p1,Player p2){
        assertEquals("HP should be equal ",p1.getHP(),p2.getHP());
        assertEquals("MaxHP should be equal",p1.getMaxHP(),p2.getMaxHP());
        assertEquals("Damage should be same",p1.getDamageDealt(),p2.getDamageDealt());
    }
    @Test
    public void testPlayer(){
        Player p1=new Player(4);
        Player p2=new Player(4);
        comparePlayers(p1,p2);
    }
}
