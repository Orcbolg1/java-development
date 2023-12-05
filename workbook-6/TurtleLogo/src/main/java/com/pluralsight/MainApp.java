package com.pluralsight;
import com.pluralsight.Forms.Turtle;
import com.pluralsight.Forms.World;

import java.awt.*;

public class MainApp
{
    public static void main(String[] args)
    {
//        // This starter code to get you familiar with how
//        // the TurtleLogo application works
//
//        // The world is your canvas
//        World world = new World(200, 200);
//        Turtle turtle = new Turtle(world,-100, -100);
//
//        int width = 200;
//        int height = 200;
//
//        // calculate the hypotenuse (diagonal)
//        // a2 + b2 = c2
//        double widthSquared = Math.pow(width, 2);
//        double heightSquared = Math.pow(height, 2);
//        double hypotenuse = Math.sqrt(widthSquared + heightSquared);
//
//
//        turtle.setPenWidth(3);
//        turtle.setColor(Color.GREEN);
//
//        turtle.turnRight(45);
//        turtle.forward(hypotenuse);
//
//        turtle.penUp();
//        turtle.goTo(100, 100);
//        turtle.turnRight(90);
//
//        turtle.penDown();
//        turtle.forward(hypotenuse);
//    }

        // Create a world and a turtle
        World world = new World(400, 400);
        Turtle turtle = new Turtle(world, 0, 0);

        // Set pen width, color, and shell size
        turtle.setPenWidth(5);  // Adjust the pen width
        turtle.setColor(Color.RED);  // Set the color to red
        turtle.setShellSize(15);  // Adjust the shell size

        // Draw a square
        for (int i = 0; i < 4; i++) {
            turtle.forward(200);  // Adjust the size of the square by changing the value
            turtle.turnRight(90);
        }



    }
}