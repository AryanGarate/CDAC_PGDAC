public class Recursion01 {
	static int i = 0 ;
	
	static void show() {
		++i;
		if(i<=5) {
			System.out.println("Hello students");
			show();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   show();
	}
}