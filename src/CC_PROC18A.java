import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://www.codechef.com/PROC2018/problems/PROC18A
 * @author jayt
 *
 */
public class CC_PROC18A {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			try {
				CC_PROC18A main = new CC_PROC18A();
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
		String[] x = br.readLine().split(" ");
		int n = Integer.parseInt(x[0]);
		int k = Integer.parseInt(x[1]);
		
		String[] g = br.readLine().split(" ");
		int max = 0;
		for (int i = 0; i + k - 1 < n; i++) {
			int newSum = getGirlCount(i , i + k - 1 , g);
			if(newSum > max) {
				max = newSum;
			}
		}

		return "" + max;
	}

	private int getGirlCount(int start, int end, String[] g) {
		int s = 0;
		for(int i = start ; i <= end ; i++) {
			s+=Integer.valueOf(g[i]);
		}
		return s;
	}

}
