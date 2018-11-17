import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * http://codeforces.com/contest/1038/problem/A
 */
public class CF_1038A {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			try {
				CF_1038A main = new CF_1038A();
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
		int n = Integer.parseInt(x[0]);
		int k = Integer.parseInt(x[1]);
		int ascii;
		int count[] = new int[26]; 
		for(int i = 0 ; i < n ; i++) {
			 ascii = (int) br.read();
			 count[ascii - 65]++;
		}
		int min = 0;
		for(int i = 0 ; i < k ; i++) {
			if(i == 0 || count[i] < min) {
				min = count[i];
			}
		}
		return min * k + "";
	}

}
