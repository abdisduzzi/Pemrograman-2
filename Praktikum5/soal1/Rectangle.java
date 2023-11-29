package Praktikum5.soal1;
public class Rectangle extends Shape{
    private Double length, width;

    public Rectangle(Double l,Double w){
        super("Rectangle");
       this.length = l;
       this.width = w;
    }

    public double area() {return length * width;}

    @Override
    public String toString() {return super.toString() + " of length " + length + " and width " + width;}
}