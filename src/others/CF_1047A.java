package others;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * http://codeforces.com/contest/1047/problem/A
 */
public class CF_1047A {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			try {
				CF_1047A main = new CF_1047A();
				// int t = Integer.parseInt(br.readLine());
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
		int a = 0, b = 0, c = 0;
		for (int i = 0;; i++) {
			if (i == 0) {
				a = b = n / 3;
				c = n - (a + b);
			} else {
				a++;
				b++;
				c -= 2;
			}
			if (a % 3 != 0 && b % 3 != 0 && c %3 != 0) {
				break;
			}
		}

		return a + " " + b + " " + c;
	}

}
