package pack1;

public class MethodsDiscussion2


{
 public void m1()
 {
	 
System.out.println("m1");

 }

	
public static void main(String[]args)
{
 // ClassName.methodName();
	
 MethodDiscussion.printText();  // Calling from another class
 
 MethodDiscussion.addNums();
 
 MethodDiscussion m1 = new MethodDiscussion();
 m1.multiplyNums();
	
	
}

}
