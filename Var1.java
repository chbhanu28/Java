package basic;

public class Var1 {
	public static void main(String[] args) {
 int a=10;//local variable
 System.out.println(a);
 
 //parameter vaariable 
 Var1 v1 =new Var1();
 vote(22);

	}
	

	public static void  vote(int age) {
	if(age>=18) {
		System.out.println("apply vote : ");
	}
	else {
		System.out.println("no apply vote");
	}
	}
}
 