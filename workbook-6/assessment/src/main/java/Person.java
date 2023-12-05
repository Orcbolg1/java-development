import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

interface Movable{
    default void Move(){
        System.out.println("I am Moving");
    }
}

public class Program{
    public static void main(String[] args) {
        Moveable item = new Movable();
        item.move();
    }
}
