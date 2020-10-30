public class Point{
	private double x,y;
	
	public Point(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	public Point(Point p){
		x = p.x;
		y = p.y;
	}
	
	public double getX(){
		return x;
	}
	
	public double getY(){
		return y;
	}
	
	public double distanceTo(Point other){
		return Math.sqrt((y-other.y)*(y-other.y)+(x-other.x)*(x-other.x));
	}
}