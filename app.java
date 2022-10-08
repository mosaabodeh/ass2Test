package edu.ass2.layer1;

import edu.ass2.Any;
import edu.ass2.layer2.Monster;
import edu.ass2.layer2.Player;
import edu.ass2.layer3.MonsterFast;
import edu.ass2.layer3.MonsterFastAndStealth;
import edu.ass2.layer3.MonsterStealth;

public class app {

    public static void main(String[] args) {
        Any App=new Any();
        System.out.println("the player :");
       App.getMov().add( new Player());
        System.out.println("the monster :");
        App.getRen().add(new Monster());
        System.out.println("the monster fast :");
      App.getMov().add( new MonsterFast());
        System.out.println("the monster stealth :");
      App.getRen().add(new MonsterStealth());
        System.out.println("the monster stealth and fast :");
      App.getRen().add( new MonsterFastAndStealth());
    }
}
