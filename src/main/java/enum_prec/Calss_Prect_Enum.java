package enum_prec;

public class Calss_Prect_Enum {
 
//  public static final int num=20;

	enum Var {
		TEST,STV,DEV,LIVE
	}

	public static void main(String[] args) {
		
		for(Var vl:Var.values()) {
			
			System.out.println(vl);
			
		}
	}
	
	public void method(int ...arg) {
		
	}

}
