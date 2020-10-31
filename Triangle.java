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
	
	public double sideAR(){
		double a = sideA();
		a *= 10000;  
		int distanceInteger = (int)a;
		a = distanceInteger / 10000.0;

		return a;
	}
	
	public double sideBR(){
		double b = sideB();
		
		b *= 10000;  
		int distanceInteger = (int)b;
		b = distanceInteger / 10000.0;

		return b;
	}
	
	public double sideCR(){
		double c = sideC();
		
		c *= 10000;  
		int distanceInteger = (int)c;
		c = distanceInteger / 10000.0;

		return c;
	}
	
	
	public double getArea(){
		double semiPerimeter = getPerimeter() / 2;
		return Math.sqrt(semiPerimeter * (semiPerimeter - sideA()) * (semiPerimeter - sideB()) * (semiPerimeter - sideC()));
	}
	
	public String classify(){
		if(sideAR() == sideBR() && sideBR() == sideCR()){
			return ("equilateral");
		}
		
		else if(sideAR() == sideBR() || sideAR() == sideCR() || sideBR() == sideCR()){
			return ("isosceles");
		}
		else{
			return ("scalene");
		}
	}
	
	public String toString(){
		return ("v1" + v1.toString() + " v2" + v2.toString() + " v3" + v3.toString());
	}
	
	public void setVertex(int index, Point newP){
		Point current;
		if(index == 0){
			v1 = newP;
		}
		
		else if (index == 1){
			v2 = newP;
		}
		
		else if(index == 2){
			v3 = newP;
		}
		
	}

}