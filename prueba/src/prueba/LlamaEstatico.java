package prueba;

public class LlamaEstatico {
	
	public static class Test{
		 int sum(Integer a,int b) {return a+b;}
		static long sum(long x,int y) {return x+y+10;}
//		static double sum(int n,double r) {return n+r;}
		
	}
	
	
	public static void main(String[] args) {
		System.out.println(Test.sum(3,2));
		
		
	}

}
