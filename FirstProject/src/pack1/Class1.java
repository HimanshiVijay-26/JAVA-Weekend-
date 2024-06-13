package pack1;

public class Class1 {

	static int newVar;
	static boolean b;
	static long longVar;
	static double doubleVar;
	static char charVar;

	public void MethodName() {
		// Method body/ Logic that needs to be implemented
	}

	public void addition() {
		// addition logic
	}

	// this method is executing XYZ logic
	public static void main(String[] args)

	{
		System.out.println(newVar);
		System.out.println(b);
		System.out.println(longVar);
		System.out.println(doubleVar);
		System.out.println(charVar);

		System.out.println("Hello World..!!"); // logic to print text in console

		// ClassName referenceVariableName:newClassName()

		Class1 ref1 = new Class1();
		Class1 ref3 = new Class1();

		Class1 ref4 = new Class1(); // shortcut for commenting the code: Ctrl + shift + c
		Class1 ref5 = new Class1();

		// data types

		byte age = 55;
		int num = 30;
		short num2 = 6;
		long longNum = 65654;

		float floatNum = 65.387f; // 32.69
		double doubleNum = 9836.545; // 365.5566655887844

		char ch = 'u'; // english alphabet
		char ch2 = 'R';
		char ch3 = '4'; // Numbers
		char ch4 = '$'; // Special Character
		char ch5 = '~'; // symbols

		boolean result = true;
		boolean result2 = false;

		System.out.println(age + "");
		System.out.println(num + "");
		System.out.println(ch4 + "");

		String name = "My name is Aditya.$#~123445";
		System.out.println(name);
		System.out.println(name + "extra String" + floatNum);

		// String name = "Himanshi";
		// System.out.println("My name is "+name);

		// + : its a concatenation operator

	}
}