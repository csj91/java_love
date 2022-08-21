public class Jin_Ex7 {// Example of type conversion
	public static void main(String[] args) 
	{
		String str = "3";

		System.out.println(str.charAt(0) - '0');  //number
		System.out.println('3' - '0' + 1); //number
		System.out.println(Integer.parseInt("3") + 1); //number
		System.out.println("3" + 1); //string
		System.out.println(3 + '0');   // '0' is number 48
	}

}
