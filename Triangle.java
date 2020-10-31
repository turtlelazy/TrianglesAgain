public class Triangle{
	private Point v1,v2,v3;
	
	public Triangle(double x1, double y1,double x2, double y2,double x3, double y3){
		v1 = new Point(x1,y1);
		v2 = new Point(x2,y2);
		v3 = new Point(x3,y3);

	}
	
	public Triangle(Point a, Point b, Point c){
		v1 = a;
		v2 = b;
		v3 = c;
	}
	public double sideA(){
		return v1.distanceTo(v2);
	}
	
	public double sideB(){
		return v2.distanceTo(v3);
	}
	
	public double sideC(){
		return v3.distanceTo(v1);
	}
	
	public double getPerimeter(){
		return sideC() + sideA() + sideB();
	}
	
	public double getArea(){
		double semiPerimeter = getPerimeter() / 2;
		return Math.sqrt(semiPerimeter * (semiPerimeter - sideA()) * (semiPerimeter - sideB()) * (semiPerimeter - sideC()));
	}
	
	

}