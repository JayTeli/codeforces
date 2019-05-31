package others;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://www.hackerrank.com/challenges/java-output-formatting/problem
 * @author jayt
 *
 */
public class HR_StringFormatting {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			try {
				HR_StringFormatting main = new HR_StringFormatting();
//				int t = Integer.parseInt(br.readLine());
				int t = 3;
				System.out.println("================================");
				while (t > 0) {
					String output = main.handleTestCase(br);
					System.out.println(output);
					t--;
				}
				System.out.println("================================");
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
		String line = br.readLine();
		String[] x = line.split(" ");
		String s = x[0];
		int i = Integer.valueOf(x[1]);
		
		String a = padSpacesToRight(s , 15);
		String b = padZeroToLeft(i , 3); 
		
		return a + b;
	}
	
	private String padZeroToLeft(int num, int d) {
		return String.format("%0" + d + "d", num);
	}

	public static String padSpacesToRight(String str, int n) {
	     return String.format("%1$-" + n + "s", str);  
	}
}
