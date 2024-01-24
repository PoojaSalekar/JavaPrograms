package abstractex;

public class InterfaceImpl implements Addable,Printable{

	public static void main(String[] args) {
		InterfaceImpl impl=new InterfaceImpl();
		impl.print();
		Addable.add(12,6);
		impl.mul(6, 9);
		impl.div(45.7,78.9);
	}
	@Override
	public void print() {
		float r=67;
		System.out.println("Area:"+(PI*r*r));
		
	}
	@Override
	public void div(double a,double b) {
		System.out.println("Div :"+(a/b));
	}
}
