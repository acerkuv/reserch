package org.example.robot;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Object> trace = new HashSet<>();
        Robot robot = new Robot(2, 2);

        System.out.println("У стартовых координат нет уникальности " + robot.getX() + " " + robot.getY());

        List<Dir> listMovement = new ArrayList<>(Arrays.asList(
              Dir.UP, Dir.DOWN, Dir.UP, Dir.DOWN, Dir.RIGHT, Dir.LEFT, Dir.UP, Dir.DOWN, Dir.RIGHT,
                Dir.RIGHT, Dir.RIGHT, Dir.RIGHT, Dir.UP, Dir.DOWN, Dir.DOWN, Dir.LEFT
        ));

      for (Dir d:listMovement){
            System.out.println(trace.add(robot.step(d)) + " " + robot.getX() + " " +robot.getY());
        }


    }
}
