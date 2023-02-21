
public class CoreJavaBrushUp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int MyNum = 5;
		String website = "Ayesha A.Ghaffar";
		char letter = 'A';
		double MyNum2 = 3.74;
		boolean myCard = true;
		
		System.out.println(myCard);
		System.out.println(website + " is my website name");
		
		//Arrays
		int[] arr = new int[5];
		arr[0] =3;
		arr[1]= 4;
		arr[2] = 7;
		arr[3] = 8;
		arr[4]=3;
		
		int[] arr2 = {4,5,2,5,6};
		
		System.out.println(arr2[3]);
		
		//for loop
		for (int i =0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		
		String[] name = {"Ayesha", "A.Ghaffar", "Selenium"};
		//1st method
		for (int i =0; i<name.length; i++)
		{
			System.out.println(name[i]);
		}
		//2nd method
		for (String s : name)
		{
			System.out.println(s);
		}
		
		
		
	
	}
}
