package others;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://www.hackerrank.com/challenges/java-loops-i/problem
 * 
 * @author jayt
 *
 */
public class HR_Tables {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			try {
				HR_Tables main = new HR_Tables();
				// int t = Integer.parseInt(br.readLine());
				int t = 1;
				while (t > 0) {
					main.handleTestCase(br);
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

	private void handleTestCase(BufferedReader br) throws NumberFormatException, IOException {
		int x = Integer.valueOf(br.readLine());
		for (int i = 1; i < 11; i++) {
			System.out.println(x + " x " + i + " = " + x * i);
		}
	}
}
