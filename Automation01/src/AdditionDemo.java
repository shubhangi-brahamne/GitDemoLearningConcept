
public class AdditionDemo {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * System.out.println("5. Print Star"); int t=5; for (t=0;t<=5; t++) {
		 * System.out.print("*"); System.out.println(); } int u=5; for (u=0;u<=5;u--) {
		 * System.out.print("*"); }
		 * 
		 * System.out.println("hii");
		 */
		System.out.println("* Printing top to bottomProgramme");
		for (int i = 1 ; i<=5; i++) {
			System.out.println();
			for(int j=i; j>=1; j--) {
				System.out.print("*");
				
			}
		}
		
		
		System.out.println("* Printing bottom to top  Programme");
		for (int i = 1 ; i<=5; i--) {
			System.out.print("*");
			for(int j=i; j<=5; j--) {
				System.out.println();
			}
		}
}
}