package Chapter3;

public class SwitchStatementEg {

	public static void main(String[] args) {
		int firstno=10,secondno=5;
		char operator='*';
		int result=0;
		
		
		switch(operator) {
		case'+': result=firstno+secondno;
		System.out.println("Result="+result);break;
		
		case'-': result=firstno-secondno;
		System.out.println("Result="+result);break;
		
		case'*': result=firstno*secondno;
		System.out.println("Result="+result);break;
		
		case'/': result=firstno/secondno;
		System.out.println("Result="+result);break;
		
		default: System.out.println("invalid operator");break;
		}
		

	}

}
