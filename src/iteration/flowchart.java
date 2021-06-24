package iteration;

public class flowchart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			//loopA();
			//flowChartb();
			//numPrint10();
			numPrint();
	}
	
	public static void loopA() {
		
		for(int a = 100; a <= 200; a++) {
			System.out.println("A");
		}
	}
	
	public static void flowChartb() {
		
		for (int a = 100;  a<=200; a++) {
			
			if(a%2 == 0) {
				System.out.println("-");
			}
			else {
				System.out.println("*");
			}
			
		}
		
	}
	
	
	public static void numPrint10() {
		
		for(int i = 1; i <= 10; i++) {
			for(int t = 1; t <= 10; t++) {
				System.out.println(i);
			}
		}
	}
	
	public static void numPrint() {
		
		for(int i = 1; i <= 10; i++) {
			for(int t = 0; t < i ; t++) {
				System.out.println(i);
			}
		}
	}
	

}
