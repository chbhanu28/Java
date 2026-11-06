package basic;

public class Var {

	// variable is container  which  holds  the value  while  the java program s executed 
	/**
	 *  instant variable // global
	 *  class variable  // global
	 * --------------------
	 * local variable 
	 * parameters variable 
	 * @param args
	 */
	
	//  keyword datatype variablename = variablevalue
	static int a=11;// instant variable
	
	int a1 =11; //class variable
	public static void main(String[] args) {
// syntax : datatype variablename = variablevalue
		System.out.println(a);//access variable
		
		Var v=new Var();
		System.out.println(v.a1);
	}


}
