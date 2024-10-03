package org.example.robot;


public class Robot extends org.example.Unit implements Movement{
    public  int x, y;

    public Robot(int x, int y) {
        super(x, y );
    }

    @Override
    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return super.getX();
    }

    public int getY() {
        return super.getY();
    }
    @Override
    public Robot step(Dir d) {
        x = getX();
        y = getY();

        switch (d){
            case UP -> y++;
            case DOWN -> y--;
            case LEFT -> x--;
            case RIGHT -> x++;
        }
        super.setX(x);
        super.setY(y);
        return new Robot(x, y);
    }

}
