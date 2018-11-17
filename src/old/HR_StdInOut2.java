import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * https://www.hackerrank.com/challenges/java-stdin-stdout/problem?h_r=next-challenge&h_v=zen
 */
public class HR_StdInOut2 {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			try {
				int i = Integer.parseInt(br.readLine());
				double d = Double.parseDouble(br.readLine());
				String s = br.readLine();
				System.out.println("String: " + s);
				System.out.println("Double: " + d);
				System.out.print("Int: " + i);
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