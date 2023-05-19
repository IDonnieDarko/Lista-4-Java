
package main;


public class main {


     public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();

        rectangle.setLength(5.0);
        rectangle.setWidth(3.0);

        double perimeter = rectangle.calculatePerimeter();
        double area = rectangle.calculateArea();

        System.out.println("Comprimento: " + rectangle.getLength());
        System.out.println("Largura: " + rectangle.getWidth());
        System.out.println("Perimetro: " + perimeter);
        System.out.println("Area: " + area);
    }
}