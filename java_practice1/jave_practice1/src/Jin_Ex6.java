public class Jin_Ex6 {// Examples of maximum and minimum values
	public static void main(String[] args) 
	{
		short sMin = -32768,  sMax = 32767; //short 2bytes
		char  cMin = 0,       cMax = 65535; //char 2bytes

		System.out.println("sMin  = " + sMin);
		System.out.println("sMin-1= " + (short)(sMin-1)); //sMax (Minus 1 from the minimum is the maximum.)
		System.out.println("sMax  = " + sMax);
		System.out.println("sMax+1= " + (short)(sMax+1)); //sMin
		System.out.println("cMin  = " + (int)cMin);
		System.out.println("cMin-1= " + (int)--cMin);
		System.out.println("cMax  = " + (int)cMax);
		System.out.println("cMax+1= " + (int)++cMax);
	}

}
