package others;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class CC_BFTT {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			try {
				CC_BFTT main = new CC_BFTT();
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
		if (n < 333) {
			return "333";
		} else {
			Set<Long> test = new TreeSet<Long>();
			String x = "333";
			while (true) {
				for (int i = 0; i < 10; i++) {
					test.addAll(getAllPermutationsOfString(x + "" + i));
				}
				for (Long l : test) {
					if (l > n) {
						return l + "";
					}
				}
				x += "3";
			}
		}
	}

	private Set<Long> getAllPermutationsOfString(String s) {
		
		return null;
	}
}