import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * https://www.codechef.com/PROC2018/problems/PROC18B
 * @author jayt
 *
 */
public class CC_PROC18B {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			try {
				CC_PROC18B main = new CC_PROC18B();
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
		int x = Integer.valueOf(br.readLine());
		String[] y = br.readLine().split(" ");
		double[] z = convertStringArrayToDoubleArray(y);
		Arrays.sort(z);
		int len = z.length;
		for (int i = len - 1 ; i >= 1; i--) {
			z[i-1] = (z[i] + z[i-1]) / 2;
			Arrays.sort(z);
		}
		return String.format("%.6f", z[0]);
	}

	private double[] convertStringArrayToDoubleArray(String[] y) {
		return Arrays.stream(y).mapToDouble(Double::parseDouble).toArray();
	}
}
