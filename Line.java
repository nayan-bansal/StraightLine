package line;

public class User_Case2 {

	public static void main (String[] args) {
		
		double x1,x2,y1,y2;
		
		x1 =   Math.floor(Math.random()*100);
		x2 =   Math.floor(Math.random()*100);
		y1 =   Math.floor(Math.random()*100);
		y2 =   Math.floor(Math.random()*100);
		
		double length1 = 0;
		
		length1  = Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2));
		
		double p1,p2,q1,q2;
		
		p1 =   Math.floor(Math.random()*100);
		p2 =   Math.floor(Math.random()*100);
		q1 =   Math.floor(Math.random()*100);
		q2 =   Math.floor(Math.random()*100);
		
			double length2 = 0;
		
		length2  =   Math.sqrt(Math.pow(p1-p2, 2) + Math.pow(q1-q2, 2));
		
		Double obj1 = new Double(length1);
		Double obj2 = new Double(length2);
		
		if(obj1.equals(obj2) == true)
			System.out.println("Lines are Equal");
		else
			System.out.println("Lines are not Equal");
		
	}
}