package edu.ass2;

import edu.ass2.layer1.Move;
import edu.ass2.layer1.Render;

import java.util.ArrayList;
import java.util.List;

public class Any {


    public List<Move> getMov() {
        return mov;
    }

    private  List <Move>mov;

    public List<Render> getRen() {
        return ren;
    }

    private List <Render>ren;

    public Any(){

        mov=new ArrayList<>();
        ren=new ArrayList<>();
    }

}
