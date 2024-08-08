package assignment;
/*W.A.J.P to compare a given string to the specified character sequence. 
  Comparing topsint.com and topsint.com:
  true Comparing Topsint.com and topsint.com: false*/
public class program_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="topint.com";
		String str2="topint.com";
		String str3="Topint.com";
		
		boolean compareString = str2.equals(str1);
		boolean compareString2 = str3.equals(str1);
		
		System.out.println("string 1 & string 2 are same :  "+compareString);
		System.out.println("string 2 & string 3 are same : "+compareString2);

	}

}
