package others;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * http://codeforces.com/contest/1/problem/A
 */
public class CF_1A {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			try {
				CF_1A main = new CF_1A();
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
		String[] x = br.readLine().split(" ");
		BigDecimal m = new BigDecimal(x[0]);
		BigDecimal n = new BigDecimal(x[1]);
		BigDecimal a = new BigDecimal(x[2]);
		
		BigDecimal ans =  m.divide(a , 2 , RoundingMode.UP).setScale(0, RoundingMode.UP).multiply(n.divide(a  , 2 , RoundingMode.UP).setScale(0, RoundingMode.UP)) ;
		
		return "" + ans;
	}
}
