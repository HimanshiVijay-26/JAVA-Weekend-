package pack1;


public class LoopsDiscussion
{
	
	
	
public static void main(String[]args)	
{
	
	
	
	
	
	

// SYNTAX


//  While (boolean Condition)
//  {

//  // code to repeat/iterate

// }

//  System.out.println("Loop");
//  System.out.println("Loop");
//  System.out.println("Loop");
//  System.out.println("Loop");
//  System.out.println("Loop");
  
   System.out.println();
   System.out.println("**********While Loop********");
   System.out.println();
  
 
    int i=1;
    
  

   while(i<=5)
	 
 {
	   
	   if(i==3) 
	   System.out.println("Loop");
	   i++;   
  if(i==3)  
	  
  {
	  continue; 
  }
  
	
 
     System.out.println("out of while loop");
     
     
     System.out.println();
     System.out.println("********** Do While Loop********");
     System.out.println();
     
}
   
   
  



// SYNTAX

// do

// {

//    // code to repeat

// }

//  while(boolean condition);


{

    int j=1;
   

    do 
    {
    	
   System.out.println("Loop");
   
   j++;
   
    }
    
   while(j<=5);
   
  
  System.out.println("Out of do-while loop");
  
  
  
  
  
  System.out.println();
  System.out.println("********** For Loop********");
  System.out.println();
  
  
 //         1              2,5       4,7
//  for(initialization, condition, increment/decrement)
// {
	 //    3,6
//	  
//	  // Code to Repeat
//  }
 
  
  //  1         2, 5    4   k=1,
  
  for(int k =1; k<=5; k++)      //  k= 1,2,3,4,5,6
  {
	  
	
	  System.out.println("Loop");
	  
  }
  
  System.out.println("Out of For loop");
  
  
  
  
  System.out.println();
  System.out.println("********** array using For Loop********");
  System.out.println();
  
  
  
  int[]array = {50,55,60,40,70,80}; 
  
  
 // System.out.println(array[0]); 
 // System.out.println(array[1]);
//  System.out.println(array[2]);
//  System.out.println(array[3]);
//  System.out.println(array[4]);
  
  
  
  for(int index = 0; index <=4; index++)
  {
	  
	  System.out.println(array[index]);
	  
  }
  
	  System.out.println("Out of For loop");
	  
	  
	  
	  System.out.println();
	  System.out.println("********** Array using ForEach Loop********");
	  System.out.println();
	  
	  
	  
 
// int[]array = { 50,55,60, 40, 70,80};	  
	  
// SYNTAX:
	  

	  
 for(int num :array)
{
	System.out.println(num);	 
}
   System.out.println("Out of For-each loop");
   

	  
   
      System.out.println();
	  System.out.println("********** Keywords in Loop********");
	  System.out.println();
	  
	  
	  
	// int[]array = { 50,55,60, 40, 70,80};	  
	  
	// SYNTAX:
		  

		  
	 for(int num :array)
	{
		
	
	if(num == 60)	
	{
		
//	break;  // to break/stop execution of the loop	
	
	continue;  // to skip the current condition and jump to  next one
	
	}
	
	 System.out.println(num);
	
	
	   System.out.println("Out of For-each loop");
	   
	   
	   
	   System.out.println();
	   System.out.println("********** Print even/odd nums in Loop********");
	   System.out.println();
	
	  
	 for(int num1 =1; num1 <=10; num1++)
		 
	 {
		 if(num1 %2==0)
		 {	
			 
	continue;
		 }
		 System.out.println(num1);
	    
	  
  }
}
}

}


}















