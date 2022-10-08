package edu.ass2.layer3;

import edu.ass2.layer1.Render;
import edu.ass2.layer2.Monster;

public class MonsterStealth extends Monster implements Render {
    @Override
    public void render() {
        System.out.println("hi there!  monster stealth ,  i can render and you cant see me or hear me  ! ");

    }


}
