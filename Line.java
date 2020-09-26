package line;

public class User_Case3 {

	public static void main (String[] args) {
		
		//Find Length of Line 1
		
		double x1,x2,y1,y2;
		
		x1 =   Math.floor(Math.random()*100);
		x2 =   Math.floor(Math.random()*100);
		y1 =   Math.floor(Math.random()*100);
		y2 =   Math.floor(Math.random()*100);
		
		double length1 = 0;
		
		length1  =   Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2));
		
		// Find Length of Line 2
		
		double p1,p2,q1,q2;
		
		p1 =   Math.floor(Math.random()*100);
		p2 =   Math.floor(Math.random()*100);
		q1 =   Math.floor(Math.random()*100);
		q2 =   Math.floor(Math.random()*100);
		
			double length2 = 0;
		
		length2  =   Math.sqrt(Math.pow(p1-p2, 2) + Math.pow(q1-q2, 2));
		
		
		//Comparison of Two Lengths
		
		Double obj1 = new Double(length1);
		Double obj2 = new Double(length2);
		
		//Program Output
		
		if(obj1.compareTo(obj2) == 1)
		System.out.println("Line 1");
		else if(obj1.compareTo(obj2) == -1)
			System.out.println("Line 2");
		else
			System.out.println("Equal Lines");
	}
}
