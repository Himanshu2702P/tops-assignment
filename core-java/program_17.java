package assignment;
/*W.A.J.P to find the second most frequent character in a 
 given string. The given string
 is: successes The second most frequent char
 in the string is: c  */
public class program_17 {
	
	public static char findSecondMostFrequentChar (String str) {
		int[] frequency = new int[256];
		for(int i=0;i<=str.length();i++) {
			 char c = str.charAt(i);
			 frequency[c]++;
		}
		char firstMaxChar = '\0';  // '\0' represents null character
        int firstMaxFreq = Integer.MIN_VALUE;
        char secondMaxChar = '\0';
        int secondMaxFreq = Integer.MIN_VALUE;
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > firstMaxFreq) {
                // Update second max to previous first max
                secondMaxChar = firstMaxChar;
                secondMaxFreq = firstMaxFreq;

                // Update first max to current max
                firstMaxChar = (char) i;
                firstMaxFreq = frequency[i];
            } else if (frequency[i] > secondMaxFreq && frequency[i] != firstMaxFreq) {
               
            	// Update second max if current frequency is greater than previous second max
                secondMaxChar = (char) i;
                secondMaxFreq = frequency[i];
            }
        }

        return secondMaxChar;
		
	}
	
	
	
	

	public static void main(String[] args) {
		
		String inputString="successes";
		
		 char secondMostFreqChar = findSecondMostFrequentChar(inputString);
	        System.out.println("The second most frequent char in the string is: " + secondMostFreqChar);
	}

}
