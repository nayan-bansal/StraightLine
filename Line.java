package line;

public class User_Case1 {
	
	public static void main (String[] args) {
		
		double x1,x2,y1,y2;
		
		x1 =   Math.floor(Math.random()*100);
		x2 =   Math.floor(Math.random()*100);
		y1 =   Math.floor(Math.random()*100);
		y2 =   Math.floor(Math.random()*100);
		
		double length = 0;
		
		length  =   Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2));
		
		System.out.println(length);
		
	}
}
