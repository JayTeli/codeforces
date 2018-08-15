import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HR_StdInOut {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			try {
				HR_StdInOut main = new HR_StdInOut();
				int n1 = Integer.parseInt(br.readLine());
				int n2 = Integer.parseInt(br.readLine());
				int n3 = Integer.parseInt(br.readLine());
				System.out.println(n1);
				System.out.println(n2);
				System.out.print(n3);
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				br.close();
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}