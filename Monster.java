package edu.ass2.layer2;

import edu.ass2.layer1.Move;
import edu.ass2.layer1.Render;
import edu.ass2.layer1.makeNoise;

public class Monster implements Render , Move , makeNoise {

    @Override
    public void makeNoise() {
        System.out.println("hi iam monster !,  i can make some Noise ! ");
    }

    @Override
    public void move() {
        System.out.println("hi iam monster !,  i can move ! ");
    }

    @Override
    public void render() {
        System.out.println("hi iam monster !,  i can render ! ");
    }



}
