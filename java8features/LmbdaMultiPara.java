package java8features;

//created by Pooja Salekar

interface Addable{
	int add(int a,int b);
}
public class LmbdaMultiPara {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addable a1 =(x,y) -> x+y;
		System.out.println("Add :"+a1.add(34,89));
		
		Addable a2 = (int x,int y) -> {
			return x+y;
		};
		System.out.println("Add :"+a2.add(45, 34));
		}

	}


