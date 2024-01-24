package abstractex;

public class inAmsterdam {
	public int countAm(String str) {
		int  result=0;
		String count[]=str.split(" ");
		for(int i=0;i<count.length;i++)
		{
			if(count[i].equalsIgnoreCase("am"));
			result=result+1;
		}
		return result;
	}
	public static void main(String[] args) {
		

	}

}
