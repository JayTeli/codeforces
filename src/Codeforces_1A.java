import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * http://codeforces.com/contest/1/problem/A
 */
public class Codeforces_1A {

	public static void main(String[] args) throws Exception {
		new Codeforces_1A().solve(new InputReader());
	}

	private void solve(InputReader in) {
		double m = in.nextDouble();
		double n = in.nextDouble();
		double a = in.nextDouble();

		double ans = Math.ceil(m / a) * Math.ceil(n / a);
		System.out.println((long) ans);
	}

	static class InputReader {
		BufferedReader br;
		StringTokenizer st;

		public InputReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}
}