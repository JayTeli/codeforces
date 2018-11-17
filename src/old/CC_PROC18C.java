import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author jayt
 *
 */
public class CC_PROC18C {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			try {
				CC_PROC18C main = new CC_PROC18C();
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
		int l = Integer.parseInt(x[0]);
		int r = Integer.parseInt(x[1]);
		long ans = 0;
		for (int i = l; i <= r; i++) {
			for(int j = i + 1 ; j <=r ; j++) {
				boolean cp = coprime(i , j);
				if(cp) {
					ans++;
				}
			}
		}
		
		return "" + ans;
	}

	private boolean coprime(int i, int j) {
		// TODO
		return false;
	}
}
