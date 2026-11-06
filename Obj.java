package object;

public class Obj {

	public static void main(String[] args) {
Obj o=new Obj();
//o.leap(2025);
o.prime(5, true);

	}
	public static void leap(int n) {
		if(n%4==0||n%400==0 && n%100!=0) {
			System.out.println("Leap Year");
		}
		else {
			System.out.println("not Leap year");
		}
	}

	public static void prime(int n,boolean prime) {
		prime =true;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				prime =false;
			}
		}
		System.out.println(prime);
	}
	
	
	

}
