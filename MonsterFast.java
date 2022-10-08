package edu.ass2.layer3;

import edu.ass2.layer1.Move;
import edu.ass2.layer2.Monster;

public class MonsterFast extends Monster implements Move {

    @Override
    public void move() {
        System.out.println("hi iam monster fast , i can move fast! ");
    }

}
