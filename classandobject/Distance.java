package classandobject;
import java.util.Scanner;
public class Distance {
	public static void calDistance(int t1,int t2) {
		int u=10;
		int a=5;
		int distanceT1=u*t1+((a*t1*t1/2));
		int distanceT2=u*t2+((a*t2*t2/2));
		System.out.println(distanceT1);
		System.out.println(distanceT2);
	}

	public static void main(String[] args) {
		int v1;
		int v2;
		Scanner sc =new Scanner(System.in);
		v1=sc.nextInt();
		v2=sc.nextInt();
		calDistance(v1,v2);

	}

}
