package forloop;

public class SumOfEven {

	public static void main(String[] args) {
		int i;
		int sum=0;
		for(i=50;i<=100;i++)
		{
			if(i%2==0)
			{
				sum=sum+i;
			}
		}
		System.out.println("The sum is : "+sum);
	}

}
