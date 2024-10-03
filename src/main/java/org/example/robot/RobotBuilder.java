package org.example.robot;

public class RobotBuilder {
    private int x;
    private int y;

    public RobotBuilder setX(int x) {
        this.x = x;
        return this;
    }

    public RobotBuilder setY(int y) {
        this.y = y;
        return this;
    }

    public Robot createRobot() {
        return new Robot(x, y);
    }
}