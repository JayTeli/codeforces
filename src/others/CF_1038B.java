package others;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * http://codeforces.com/contest/1025/problem/A
 */
public class CF_1038B {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			try {
				CF_1038B main = new CF_1038B();
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

	String handleTestCase(BufferedReader br) throws IOException {
		return null;
	}

}
