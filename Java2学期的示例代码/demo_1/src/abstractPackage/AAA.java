package abstractPackage;


public class AAA {
	
	public class GeometricObject {
		protected String color="white";
		private boolean filled;
		protected java.util.Date dateCreated;
		
		public GeometricObject() {
			dateCreated=new java.util.Date();
		}
		
		public GeometricObject(String color,boolean filled) {
			dateCreated=new java.util.Date();
			this.color=color;
			this.filled=filled;
		}
		
		public String gerColor() {
			return color;
		}
		
		public void setColor(String color) {
			this.color=color;
		}
		
		public boolean isFilled() {
			return filled;
		}
		
		public void setFilled(boolean filled) {
			this.filled=filled;
		}
		
		public java.util.Date getDateCreated(){
			return dateCreated;
		}
		
		public String toString() {
			return "created on "+dateCreated+"\ncolor: "+color+" and filled: "+filled;
		}
	}
	
	public class Circle extends GeometricObject {
		private double radius;
		
		public Circle() {
		}
		
		public Circle(double radius) {
			this.radius=radius;
		}
		
		public Circle(double radius,String color,boolean filled) {
			this.radius=radius;
			setColor(color);
			setFilled(filled);
		}
		
		public double getRadius() {
			return radius;
		}
		
		public void setRadius(double radius) {
			this.radius=radius;
		}
		
		public double getArea() {
			return radius*radius*Math.PI;
		}
		
		public double getDiameter() {
			return 2*radius;		
		}
		
		public double getPertimeter() {
			return 2*radius*Math.PI;
		}
		
		public void printCircle() {
			System.out.println("The circle is created "+getDateCreated()+" and the radius id "+radius);
		}
	}
	
	public class Rectangle extends GeometricObject{
		private double width;
		private double height;
		
		public Rectangle() {
		}
		
		public Rectangle(double width,double height) {
			this.width = width;
			this.height = height;
		}
	     
		public Rectangle(double width,double height,String color,boolean filled) {
			this.width = width;
			this.height = height;
			setColor(color);
			setFilled(filled);
		}
		
		public double getWidth() {
			return width;
		}
		
		public void setWidth(double width) {
			this.width = width;
		}
		//This method overrides the method 
		public void setWidth(int width) {
			this.width = width;
		}
		
		public double getHeigth() {
			return height;
		}
		
		public void setHeigth(double height) {
			this.height = height;
		}
		
		public String toString() {
			return "created on "+dateCreated+"\ncolor: "+color+" and filled: "+filled;
		}
		
		public String toRectangle() {
			return "width" + width + "height" + height;
		}
	}

}
