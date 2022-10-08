package edu.ass2.layer2;

import edu.ass2.layer1.Move;
import edu.ass2.layer1.Render;
import edu.ass2.layer1.makeNoise;

public class Player implements Move, Render, makeNoise {

    @Override
    public void render() {
        System.out.println("hi iam player !,  i can render ! ");
    }

    @Override
    public void move() {
        System.out.println("hi iam player !,  i can move ! ");
    }

    @Override
    public void makeNoise() {

    }
}
