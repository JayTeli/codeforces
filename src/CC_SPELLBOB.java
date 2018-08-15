import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://www.codechef.com/AUG18B/problems/SPELLBOB
 */
public class CC_SPELLBOB {

	public static void main(String[] args) {

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			try {
				CC_SPELLBOB main = new CC_SPELLBOB();
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

	public String handleTestCase(BufferedReader br) throws IOException {
		String frontLine = br.readLine();
		String backLine = br.readLine();
		int result = 1;
		int numberOfB = 0;
		int numberOfO = 0;
		for (int index = 0; index < 3; index++) {
			char front = frontLine.charAt(index);
			char back = backLine.charAt(index);
			boolean isValidFront = isValid(front);
			boolean isValidBack = isValid(back);
			if (!isValidBack && !isValidFront) {
				result = 0;
				break;
			}
			if (hasB(front, back)) {
				numberOfB++;
			}
			if (hasO(front, back)) {
				numberOfO++;
			}
			if (index == 2 && (numberOfB < 2 || numberOfO < 1)) {
				result = 0;
				break;
			}
		}
		if (result == 1) {
			return "yes";
		} else {
			return "no";
		}
	}

	public boolean isValid(char c) {
		return (c == 'b') || (c == 'o');
	}

	public boolean hasB(char front, char back) {
		return (front == 'b') || (back == 'b');
	}

	public boolean hasO(char front, char back) {
		return (front == 'o') || (back == 'o');
	}
}