package others;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://codeforces.com/contest/1027/problem/B
 */
public class CF_1027B {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			try {
				CF_1027B main = new CF_1027B();
				String[] x = br.readLine().split(" ");
				int n = Integer.parseInt(x[0]);
				int t = Integer.parseInt(x[1]);
				while (t > 0) {
					String output = main.handleTestCase(br, n);
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

	private String handleTestCase(BufferedReader br, int n) throws IOException {
		String[] x = br.readLine().split(" ");
		int a = Integer.parseInt(x[0]);
		int b = Integer.parseInt(x[1]);
		int init = (int) (((a + b) % 2 == 0) ? 0 : Math.ceil(Math.pow(n, 2d) / 2d));
		int prevRow = (int) Math.ceil((n * (a-1) / 2d));
		int currRow = (int) Math.ceil((b / 2d));
		int ans = init + prevRow + currRow; 
		return "" + ans;
	}
}
