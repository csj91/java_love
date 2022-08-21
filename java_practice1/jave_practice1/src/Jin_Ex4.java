
public class Jin_Ex4 {// 

	public static void main(String[] args) 
	{
		String url = "www.jinistar.com"; // String variables url declare
		float f1 = .10f;   // 0.10, 1.0e-1
		float f2 = 1e1f;   // 10.0, 1.0e1, 1.0e+1
		float f3 = 3.14e3f;
		
		System.out.printf("f1=%f, %e, %g%n", f1, f1, f1); 
		System.out.printf("f2=%f, %e, %g%n", f2, f2, f2); 
		System.out.printf("f3=%f, %e, %g%n", f3, f3, f3);
		
		
		double d = 1.23456789;
		
		System.out.printf("d=%f%n", d);
		System.out.printf("d=%10.6f%n", d); //10 digits  6 decimal places
		
		
		System.out.printf("[12345678901234567890]%n");
		
		//To compare strings
		System.out.printf("[%s]%n", url);
		System.out.printf("[%20s]%n", url);
		System.out.printf("[%-20s]%n", url);
		System.out.printf("[%.8s]%n", url);  // '.8' indicates the number of strings
	}

}
