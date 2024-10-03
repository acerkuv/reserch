package org.example;

public class Unit {
    public  int x, y;

    Unit(){

    }
    public Unit(int x, int y){
        this.x = x;
        this.y = y;

    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Unit unit = (Unit) obj;
//        return c == unit.c &&  (x == unit.x && y == unit.y);
        return  (x == unit.x && y == unit.y);

    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((x == 0) ? 99 : x);
        result = prime * result + ((y == 0) ? 99 : y);
        return result;
    }

}
