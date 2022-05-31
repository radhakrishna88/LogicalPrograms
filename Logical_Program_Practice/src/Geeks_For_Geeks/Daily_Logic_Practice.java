package Geeks_For_Geeks;

public class Daily_Logic_Practice {
	
	int lps(String s) {
		int i=0;
		int n=(s.length()/2-1);
		while(n<s.length()) {
		if(s.charAt(i)==s.charAt(n)) {
			i++;
			n++;
		}
		else {
			n++;
			i=0;
			if(s.charAt(i)==s.charAt(n)) {
				i++;
				n++;
			}
			else {
				n++;
				i=0;
			}
		}
		}
        return i;
    }

	public static void main(String[] args) {
		Daily_Logic_Practice dlp=new Daily_Logic_Practice();
		String str="acccbaaacccbaac";
		System.out.println(dlp.lps(str));
	}

}
