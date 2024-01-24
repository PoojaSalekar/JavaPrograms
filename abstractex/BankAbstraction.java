package abstractex;
import java.util.Scanner;
 abstract class Bank {
	public abstract float getRateofInterest();
 }
	class BOI extends Bank {
		@Override
		public float getRateofInterest() {
			return 8.7f;
		}
	}
	
	class TJSB extends Bank {
		@Override
		public float getRateofInterest() {
			return 6.6f;
		}
	}
	public class BankAbstraction{
		
	
		public static void main(String[] args) {
			float pricipleAmount,years,rateBOI,rateTJSB;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter priciple amount: ");
			pricipleAmount= sc.nextFloat();
			System.out.println("Enter number of years: ");
			years= sc.nextFloat();
			Bank bBOI = new BOI();
			rateBOI=bBOI.getRateofInterest();
			Bank bTJSB = new TJSB();
			rateTJSB=bTJSB.getRateofInterest();
			float interstBOI=(pricipleAmount*years*rateBOI)/100;
			float interstTJSB=(pricipleAmount*years*rateTJSB)/100;
			System.out.println("Simple interest of BOI:"+interstBOI);
			System.out.println("Simple interest of TJSB:"+interstTJSB);
		}

	}
