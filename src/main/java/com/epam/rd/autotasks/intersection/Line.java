package com.epam.rd.autotasks.intersection;

public class Line {
    int k,b;

    public Line(int k, int b) {
        this.k=k;
        this.b=b;

    }
    public Point intersection(Line other) {
        if(this.k== other.k)
            return null;
        else{
            int x=Math.abs((other.b-this.b)/(this.k- other.k));
            int y= Math.abs(this.k*x+this.b);
            return new Point(x,y);
        }
        //throw new UnsupportedOperationException();
    }


}
