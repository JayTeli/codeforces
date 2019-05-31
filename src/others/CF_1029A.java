package others;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CF_1029A {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			try {
				CF_1029A main = new CF_1029A();
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
		int n = Integer.parseInt(x[0]);
		int k = Integer.parseInt(x[1]);
		String t = br.readLine();

		int reusable = 0;
		for (int i = 1; i < n; i++) {
			String a = t.substring(i , n);
			String b = t.substring(0 , n-i);
			if(a.equals(b)) {
				reusable = n-i;
				break;
			}
		}
		String uncommon = t.substring(reusable, n);
		String ans = t;
		for(int i = 0 ; i < k-1 ; i++) {
			ans += uncommon;
		}

		return ans;
	}

}
