import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * http://codeforces.com/contest/1047/problem/A
 */
public class CC_OETW {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			try {
				CC_OETW main = new CC_OETW();
				int t = Integer.parseInt(br.readLine());
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
		int a[] = new int[n];
		boolean b[] = new boolean[2 * n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(br.readLine());
			b[a[i]] = true;
		}
		int c = 0;
		for (int i = 0; i < 2 * n; i++) {
			if (b[i]) {
				c++;
			} else {
				int sum = 0;
				for (int j = 0; j < n; j++) {
					sum = 0;
					for (int k = 0; k < n; k++) {
						if (sum == i) {
							break;
						}
					}
					if (sum == i) {
						break;
					}
				}
				if(sum == i) {
					
				} 
			}
		}

		return c + "";
	}

}
