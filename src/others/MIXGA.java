package others;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MIXGA {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			try {
				MIXGA main = new MIXGA();
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
		String[] arr = br.readLine().split(" ");
		int sum = 0;
		for(int i = 0 ; i < n ; i++) {
			if(i % 2 == 0) {
				sum +=  Integer.parseInt(arr[i]);
			} else {
				sum -= Integer.parseInt(arr[i]);
			}
		}
		if(Math.abs(sum) >= k) {
			return "1"; 
		} else {
			return "2";
		}
	}
}