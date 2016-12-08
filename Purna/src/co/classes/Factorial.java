package co.classes;



class Fact{
	static long factor(int num)
	{
		long fac=1;
		while(num>0)
			fac=fac*num--;
		return fac;
	}
}
public class Factorial {

	public static void main(String[] args) {
		//This is a factorial program
		
		System.out.println("factorial of 5"+"\t"+Fact.factor(5));
		// TODO Auto-generated method stub

	}

}
