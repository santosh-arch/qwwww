package stringPgm;

public class multipleOcurrance
 {

	public static void main(String[] args) 
{
		String s="welcome to atuomation testing using selenium with java";
		
		int totcount=s.length();
		
		int withoutcount=s.replace("a", "").length();
		int count=totcount-withoutcount;
		System.out.println("multiple occurance is = "+count);
	}


}
