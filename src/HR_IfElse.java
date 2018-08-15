import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * https://www.hackerrank.com/challenges/java-if-else/problem
 */
public class HR_IfElse {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			try {
				HR_IfElse main = new HR_IfElse();
				int n = Integer.parseInt(br.readLine());
				main.handleTestCase(n);
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				br.close();
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	private void handleTestCase(int n) {
		if ((n % 2 == 1) || ((n % 2 == 0) && (n >= 6 && n <= 20))) {
			System.out.print("Weird");
		} else {
			System.out.print("Not Weird");
		}
	}
}
