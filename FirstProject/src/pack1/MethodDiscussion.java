package pack1;

public class MethodDiscussion


{

// SYNTAX:
	
//	public static void methodName()
// {
//  // method Body/Logic
	
// }
	
	
	public static void printText()
{
 System.out.println("Text from print Text method");	
 
 // Calling of non-static method inside static
 
 
 MethodDiscussion ref1 = new MethodDiscussion();
 
 ref1.multiplyNums();
 
}
	public static void addNums()
{
		
   int num1 = 90;
   int num2 = 20;
   
   int add = num1 + num2;
   
 System.out.println(add);
 
 
 }
	
public void multiplyNums()
	
	{	
	 int num1 = 90;
	 int num2 = 20;
	   
	 int product = num1 * num2;
	 
   System.out.println(product);
   addNums();  // Calling for static method in non-static
   
}

   public void divideNums()
   
{
	   int num1 = 90;
	   int num2 = 20;
		   
	  int division = num1 / num2;
		 
	   System.out.println(division);
	 
	   multiplyNums(); // Calling of non- static method inside  non -static
	   
	   // non-static method calling from another class
	   
	   MethodsDiscussion2 ref2 = new MethodsDiscussion2();
	   ref2.m1();

	   
}
	 
	
	
public static void main(String[]args)


{
	  
// Calling static method
	
   printText();  
   
   
    addNums();

// Calling of Non Static method 


   MethodDiscussion ref1 = new MethodDiscussion();
// ref1.multiplyNums();
   
   
   
   ref1.divideNums();

	
	}
}
