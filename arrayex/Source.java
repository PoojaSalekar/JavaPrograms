package arrayex;

public class Source {
	
	public static int getSecondSmallest(int[] a){
		int temp,i,j;
		for(i=0;i<a.length;i++) {
			for(j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a[1];
	}
	public static void main(String[] args) {
		Source s1= new Source();
		int a[]= {23,45,32,22,20,96};
		System.out.println("Second Smallest :"+getSecondSmallest(a));
	}
}
