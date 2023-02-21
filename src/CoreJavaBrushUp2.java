import java.util.ArrayList;

public class CoreJavaBrushUp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr2 = {1,23,4,5,2,5,6,8,3,5,2,6,5,10,12,15,16};
		//check is array has multiple of 2
		for (int i=0; i<arr2.length; i++)
		{
			if (arr2[i] % 2 == 0)
			{
				System.out.println(arr2[i]);
				//break;
			}
			else 
				System.out.println(arr2[i] + "is not multiple of 2");
		}

		ArrayList<String> a = new ArrayList<String>();
		a.add("Ayesha");
		a.add("Abdul");
		a.add("Ghaffar");
		System.out.println(a.get(2));
		
		//string is an object
		//String literal
		String s = "Ayesha A.ghaffar";
		String s1 = "Ayesha A.ghaffar";
		String s4 = "Hello";
		//new keyword
		String s2 = new String("Welcome");
		String s3 = new String("Welcome");
		
		//Split string base on spaces
		String s6 = "Ayesha Abdul Ghaffar";
		String[] splittedString = s6.split(" ");
		System.out.println(splittedString[2]);
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);
		
		String[] splittedString1 = s6.split("Abdul");
		System.out.println(splittedString1[1]);
		System.out.println(splittedString1[0]);
		
		//To remove left or right spaces
		System.out.println(splittedString1[1].trim());
		
		//print character by characters
		for (int i=0; i<s6.length(); i++)
		{
			System.out.println(s6.charAt(i));
		}
		
		//print string in reverse order character by characters
		for (int i= s6.length()-1; i>=0; i--)
		{
			System.out.println(s6.charAt(i));
		}
	}

}
