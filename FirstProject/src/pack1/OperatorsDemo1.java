package pack1;

public class OperatorsDemo1


{
    	
	public static void main(String[]args) 
	
{
		// pre-increment operators
		
		
	System.out.println("***********Increment Operator **********");
	
    int  x= 10;
	int  y= ++x; // first value of X will be increased by 1  and then assigned to Y
	
	System.out.println("Value of y:" + y);
	System.out.println("Value of x:" + x);
	
	System.out.println("***********decrement Operator **********");
	System.out.println();
	System.out.println();
	
	// pre-decrement operators
	
	//int p =10;
	//int q= p++; // first value of p will be assigned to q and then increased by 1
	
	//System.out.println("Value of q:" + q);
	//System.out.println("Value of p:" + p);
	
	
	int t = 10;
	int u= --t; // //  first value of  t will decreased by 1 and then assigned to u
	
	System.out.println("Value of t:" + t);
	System.out.println("Value of y:" + u);
	
	System.out.println("Value of t:" + t);
	
	System.out.println("t+u "+ t + u);
	
	System.out.println("t+u"+ "=" +(t + u));
	
	
	// post decrement operator
	
	int c=10;
	int d= c--;  // first value of c will be assigned to d and then  decreased by 1
	
 
	
	System.out.println("Value of d:" + d);
	System.out.println("Value of c:" + c);
	System.out.println();
	
		
	
	System.out.println();
	System.out.println("***********Comparison Operator **********");
	System.out.println();
	
	
	
	
	int aa =30;
	int bb=60;
	
	bb=aa;    //assignment operator
	
	System.out.println(bb);
	
	boolean greaterThan= (aa > bb);
	System.out.println("greaterThan:" +greaterThan);
	
	
	boolean lessThan = aa<bb;
    System.out.println("lessThan: "+lessThan);
    
    boolean equalTo = (aa==bb);
    System.out.println("equalTo: "+equalTo);
    
    boolean greaterThanEqualTo= (aa >= bb);
	System.out.println("greaterThanEqualTo: "+greaterThanEqualTo);
	
	boolean lessThanEqualTo= (aa <= bb);
	System.out.println("greaterThanEqualTo: "+lessThanEqualTo);
	
	boolean notEqualTo= (aa != bb);
	System.out.println("notEqualTo: "+notEqualTo);
	
	
	boolean EqualTo2= !(aa != bb);
	System.out.println("equalTo2: "+EqualTo2);
	
	
	
	System.out.println();
	System.out.println("***********Logical Operator **********");
	System.out.println();
	
	
	int w=10;
	int z=20;
	
	 boolean res1 = w<0; //true     
	 
	 boolean res2 = w<z; // true
	 
	 
	 boolean finalResult = res1 && res2; //true
	 System.out.println("finalResult:" + finalResult);
	 
	 boolean finalResult2 = res1 || res2; //true
	 System.out.println("finalResult2:" + finalResult2);
	 
	 
	 
	 
	 
	 
	 
	 
	System.out.println();
	System.out.println("*********** Modulus Operator **********");
	System.out.println();
	
	
	int num1 = 11;
	int num2 = 3;
	
	int ans = num1 % num2;
	
	System.out.println ("Remainder:" +ans);
	
	
	
	
	
		
	 
	 
	
	
	
	
	
	
	
	
	
	
	
}

}