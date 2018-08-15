import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://www.hackerrank.com/challenges/java-loops/problem
 * 
 * @author jayt
 *
 */
public class HR_Series {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			try {
				HR_Series main = new HR_Series();
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

	private String handleTestCase(BufferedReader br) throws NumberFormatException, IOException {
		String line = br.readLine();
		String[] x = line.split(" ");
		int a = Integer.parseInt(x[0]);
		int b = Integer.parseInt(x[1]);
		int n = Integer.parseInt(x[2]);
		
		String series[] = new String[n];
		for (int i = 0; i < n; i++) {
			series[i] = String.valueOf(a + getSumOfB(i , b));
		}
		return String.join(" " , series);
	}

	private int getSumOfB(int n , int b) {
		int sum = 0;
		for (int i = 0; i <=n ; i++) {
			sum += (Math.pow(2, i) * b);
		}
		return sum;
	}
}
