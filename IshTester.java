public class IshTester{
	public static void main(String[] args){
		Point origin = new Point(0,0); 
		Point number1 = new Point(3,4);
		Point number2 = new Point(10,28);
		Point origin0 = new Point(origin);
		Point origin1 = new Point(0,0);
		//distanceTo test cases
		System.out.println(origin.distanceTo(number1)); //5.0
		System.out.println(origin.distanceTo(number2)); //29.732137494637012
		System.out.println(number1.distanceTo(number2)); //25.0
		//.equals test cases
		System.out.println(number1.equals(number2)); //false
		System.out.println(number1.equals(number2)); //false
		System.out.println(number1.equals(number2)); //false
		System.out.println(origin.equals(origin0)); //true
		System.out.println(origin.equals(origin1)); // true
		
		Triangle a = new Triangle(0,0,0,0,0,0);
		Triangle b = new Triangle(new Point(0,1),new Point(5,6),new Point(21,10));
		
		System.out.println(a.getPerimeter());
		System.out.println(b.getPerimeter());
		
		System.out.println(a.getArea());
		System.out.println(b.getArea());
		
		System.out.println(a.classify());
		System.out.println(b.classify());
	}

}