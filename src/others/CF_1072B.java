package others;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * http://codeforces.com/contest/1072/problem/A
 */
public class CF_1072B {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			try {
				CF_1072B main = new CF_1072B();
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
		String[] a = br.readLine().split(" ");
		String[] b = br.readLine().split(" ");
		String[] t = new String[n];

		int curr_or = 0, curr_and = 0;
		int prev_or = 0, prev_and = 0;
		int ai = 0, bi = 0;
		boolean notPossible = false;
		for (int i = 0; i < n - 1 && !notPossible; i++) {

			ai = Integer.parseInt(a[i]);
			bi = Integer.parseInt(b[i]);

			curr_or = ai | bi;
			curr_and = ai & bi;

			if (i > 0) {
				if (curr_or == prev_or) {
					t[i - 1] = prev_and + "";

				} else if (curr_or == prev_and) {
					t[i - 1] = prev_or + "";
				} 
				else {
					notPossible = true;
				}
				if (i == n - 2 && !notPossible) {
					t[n - 2] = curr_or + "";
					t[n - 1] = curr_and + "";
				}
			}
			prev_and = curr_and;
			prev_or = curr_or;
		}
		String ans = "";
		if (notPossible) {
			ans = "NO";
		} else {
			ans = "YES\n";
			ans += String.join(" ", t);
		}

		return ans;
	}

}
