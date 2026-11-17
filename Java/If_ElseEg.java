package Chapter3;

public class If_ElseEg {

	public static void main(String[] args) {
		int units=1000, serviceFee=5;
		int totalKyats=0;
		
		if(units<=500) {
			totalKyats=(units*2)+serviceFee;
		}
		else if(units>500 && units<=1000) {
			totalKyats=(500*2)+((units-500)*4)+serviceFee;

	}
	
		System.out.println("Total kyats for resident="+totalKyats);


	}

}
