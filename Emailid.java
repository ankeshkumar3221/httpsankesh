import java.util.*;
import java.util.regex.Pattern;
public class Emailid {
	
	public static void validationEmail() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your string :");
		String str = sc.next();
		
		String emailCheck = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
                "[a-zA-Z0-9_+&*-]+)*@" + 
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
                "A-Z]{2,7}$"; 
                  
		Pattern pat = Pattern.compile(emailCheck); 
		if (str == null) {
			System.out.println("Enter your mail to check!");
		}
		else {
			boolean bool1 = pat.matcher(str).matches();
			if(bool1 == true) {
				System.out.println(str+" is valid");
			}
			else {
				System.out.println(str+" is not valid");
			}
		}
		
		entryAgain();
	}
	
	public static void entryAgain() {
		System.out.println(" if you want to check again:");
		System.out.println("1 : YES");
		System.out.println("2 : NO");
		 Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		str1 = str1.toUpperCase();
		if(str1.equals("YES")){
			validationEmail();
		}
		else if(str1.equals("NO")) {
			System.out.println("   THANK  YOU  for USE APPLICATION :)   ");
		}
		else {
			System.out.println("WRONG INPUT!!!!");
			entryAgain();
		}
		
	}
	public static void main(String[] args) {
		
		validationEmail();
	}

}
