package rikkei.academy;

import Drawing.Circle;
import Drawing.Shape;
import Drawing.Square;
import Drawing.Rectangle;
import Resizeable.Resizeable;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Shape[] shapes = new Shape[3];
        shapes[0]= new Circle(10);
        shapes[1]=new Rectangle(5,7);
        shapes[2]=new Square(8,5);
        System.out.println("dien tich ban dau");
        for (Shape shape1: shapes) {
            System.out.println(shape1);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao % =");
        double per = scanner.nextDouble();
        for (Shape shape1: shapes) {
            ((Resizeable)shape1).resize(per);
            System.out.println(shape1);
        }
    }
}
