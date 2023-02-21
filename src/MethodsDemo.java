
public class MethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodsDemo d = new MethodsDemo();
		getData();
		String name = d.getData1();
		System.out.println(name);
		
		//access another class method
		MethodsDemo2 d1 = new MethodsDemo2();
		d1.getData();
	}
	
	//return type is void so not return any thing.
	public static void getData() {
		System.out.println("Helo world!");
	}

	public String getData1() {
		System.out.println("Helo world!");
		return "Ayesha Ghaffar";
	}

}
