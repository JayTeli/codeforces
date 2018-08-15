import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			try {
				Main main = new Main();
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
		String line = br.readLine();
		String[] x = line.split(" ");
		int a = Integer.parseInt(x[0]);
		int b = Integer.parseInt(x[1]);
		if(a < 2 && b < 2) {
			return "0.000000";
		} else {
			return "1.000000";
		}
	}

}
