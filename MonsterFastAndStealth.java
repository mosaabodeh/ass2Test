package edu.ass2.layer3;
import edu.ass2.layer1.Move;
import edu.ass2.layer1.Render;
import edu.ass2.layer2.Monster;

public class MonsterFastAndStealth extends Monster implements Render , Move {


    @Override
    public void render() {
        System.out.println("hi iam monster fast and stealth i can render so hard for you to see me or hear me ! ");
    }



    @Override
    public void move() {
        System.out.println("hi iam monster fast and stealth i can move vary fast from location to others ! ");
    }
}
