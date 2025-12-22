//https://www.naukri.com/code360/problems/string-palindrome_624944?interviewProblemRedirection=true&search=pali&count=25&sort_entity=order&sort_order=ASC&leftPanelTabValue=SUBMISSION&customSource=studio_nav&page=1&attempt_status=COMPLETED


public class Palindrome_Check {

	public static boolean isPalindrome(String str) {
		int n = str.length()-1;
		for(int i = 0; i <= n/2; i++){
			if(str.charAt(i) != str.charAt(n-i)){
				return false;
			}
		}
		return true;
	
	}

}