package project2;

import java.util.Scanner;

public class check {

public static void main(String[] args) {
// TODO Auto-generated method stub
CheckDetails shape = new CheckDetails();

     Shape shape1 = shape.getcheck("CIRCLE");

     shape1.draw();

     Shape shape2 = shape.getcheck("RECTANGLE");

     shape2.draw();

     Shape shape3 = shape.getcheck("SQUARE");

     shape3.draw();
     

}

}