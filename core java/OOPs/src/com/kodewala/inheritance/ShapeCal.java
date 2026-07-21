package com.kodewala.inheritance;


class Shape {
	String shape;

	public Shape(String shape) {
		setShape(shape);
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

}

class Rectangle extends Shape {
	int length;
	int width;

	public Rectangle(String shape,int length, int width) {
		super(shape);
		setLength(length);
		setWidth(width);
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	
	public float calculateArea() {
		return length*width;
	}

}

public class ShapeCal {
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle("Rectangle",5,4);
		
		System.out.println(rectangle.getShape());
		System.out.println(rectangle.calculateArea());
	}
}
