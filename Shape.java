// TODO Auto-generated method stub
		/*.    Create a class to print the area of a square and a rectangle.The class has two methods ‘printArea’ and ‘printPerimeter’ with the same name but different number of parameters. The method for printing area of
		Rectangle has two parameters which are length and breadth respectively while the other method for printing area of square has one parameter which is side of square

		*/// Q2.
		



package Assignment5;

public class Shape {

	
		    public void printArea(double side) {
		        double area = side * side;
		        System.out.println("Area of the square is " + side + " is: " + area);
		    }

		    public void printArea(double length,double breadth) {
		        double area = length * breadth;
		       
		        System.out.println("Area of the rectangle is " + length+"and bredth"+breadth + " is: " + area);
		    }
		    public void printPerimeter(double side) {
		        double perimeter = 4 * side;
		        System.out.println("Perimeter of the square of" + side + " is: " + perimeter);
		    }
		    public void printPerimeter(double length, double breadth) {
		        double perimeter = 2 * (length + breadth);
		        System.out.println("Perimeter of the rectangle with length " + length + " & breadth " + breadth + " is: " + perimeter);
		    }


		public static void main(String[] args) {
		Shape shape=new Shape();
		shape.printArea(5);
		shape.printPerimeter(5);

		shape.printArea(4,5);
		         shape.printPerimeter(4, 5);
		}

		

	}


