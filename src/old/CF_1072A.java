import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * http://codeforces.com/contest/1072/problem/A
 */
public class CF_1072A {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			try {
				CF_1072A main = new CF_1072A();
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
		String[] x = br.readLine().split(" ");
		int w = Integer.parseInt(x[0]);
		int h = Integer.parseInt(x[1]);
		int k = Integer.parseInt(x[2]);

		int glide = 0;
		for (int i = 0; i < k; i++) {
			glide += (w * 2) + ((h - 2) * 2);
			w -= 4;
			h -= 4;
			if (w < 0 && h < 0) {
				break;
			}
		}

		return "" + glide;
	}

}
