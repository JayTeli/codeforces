package others;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * http://codeforces.com/contest/1025/problem/A
 */
public class CF_1025A {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			try {
				CF_1025A main = new CF_1025A();
//				int t = Integer.parseInt(br.readLine());
				int t = 1;
				while (t > 0) {
					String output = main.handleTestCase(br);
					System.out.println(output);
					t--;
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				br.close();
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	private String handleTestCase(BufferedReader br) throws IOException {
		int n = Integer.parseInt(br.readLine());
		String s = br.readLine();
		boolean isPossible = false; 
		for (int i = 0; i < s.length(); i++){
		    char c = s.charAt(i);        
		    long count = getOccuranceOfCharInString(s , c);
		    s = s.replace(c + "", "");
		    if(count > 1) {
		    	isPossible = true;
		    	break;
		    }
		}
		if(isPossible || n == 1) 
			return "Yes";
		else 
			return "No";
	}

	private long getOccuranceOfCharInString(String s, char c) {
		return s.chars().filter(ch -> ch == c).count();
	}
}
