package line;

public class User_Case4 {
	
	//Length of the Lines
	public static double Length() {
			
		double x1,x2,y1,y2;
		
		x1 =   Math.floor(Math.random()*100);
		x2 =   Math.floor(Math.random()*100);
		y1 =   Math.floor(Math.random()*100);
		y2 =   Math.floor(Math.random()*100);
		
		double length = Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2));
		
		return length;
	}
	
	//Equality of the Lines
	public static boolean Equality(double a, double b) {
		
		Double obj1 = new Double(a);
		Double obj2 = new Double(b);
		
		
		boolean equal  = obj1.equals(obj2);
		
		return equal;
	}
	
	public static int Compare (double a, double b) {
		
		Double obj1 = new Double(a);
		Double obj2 = new Double(b);
		
		int A  = obj1.compareTo(obj2);
		return A;
	}
	
	public static void main(String[] args) {
		
		
		//Computation of Length
		
		double length1 = 0;
		
		length1  =  User_Case4.Length();
		
		double length2 = 0;
		
		length2  = User_Case4.Length();
		
		//Check Equality
		
		if(Equality(length1, length2)== true)
			System.out.println("Lines are Equal");
		else
			System.out.println("Lines are not Equal");
		
		//Comparison 
		
		switch(Compare(length1,length2)) {
		case 1: 
			System.out.println("Line 1 is greater than Line 2 with length: "+length1);
			break;
			
		case -1: 
			System.out.println("Line 2 is greater than Line 1 with length: "+length2);
			break;
		
		default :
			System.out.println("The Length of Equal lines is: "+length1);
			
		
		
		}	
	}
}
