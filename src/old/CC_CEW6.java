import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CC_CEW6 {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			try {
				CC_CEW6 main = new CC_CEW6();
				int t = Integer.parseInt(br.readLine());
				while (t > 0) {
					String output = "" + main.handleTestCase(br);
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

	private long handleTestCase(BufferedReader br) throws IOException {
		String line = br.readLine();
		String[] x = line.split(" ");
		x[0] = x[0].replace("0", "");
		x[1] = x[1].replace("0", "");
		if(x[0].isEmpty() || x[1].isEmpty()) {
			return 0;
		} else {
			return Long.valueOf(x[0]) * Integer.valueOf(x[1]);
		}
	}
}
