package others;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class CF_1025B {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			try {
				CF_1025B main = new CF_1025B();
				int t = Integer.parseInt(br.readLine());
				while (t > 0) {
					String output = main.handleTestCase(br, t);
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

	private String handleTestCase(BufferedReader br, int t) throws IOException {
		HashSet<Long> oddSet = new HashSet<Long>();
		boolean isEvenPresent = true;
		for (int i = 0; i < t; i++) {
			String[] x = br.readLine().split(" ");
			long a = Long.parseLong(x[0]);
			long b = Long.parseLong(x[1]);

			boolean isAodd = a % 2 == 1 ? true : false;
			boolean isBodd = b % 2 == 1 ? true : false;
			if (isEvenPresent && (isAodd || isBodd)) {
				isEvenPresent = false;
			}
			if (isAodd) {
				oddSet.add(a);
			}
			if (isBodd) {
				oddSet.add(b);
			}
		}
		if (isEvenPresent) {
			return "2";
		} else {
			Long onlyDivisorLeft = 0l;
			Set<Long> allDiv = new HashSet<Long>();
			for (Long l : oddSet) {
				if (onlyDivisorLeft != 0) {
					Set<Long> div = getDivisorsOfNumber(l);
					allDiv.retainAll(div);
					if (allDiv.size() == 0) {
						return "-1";
					} else {
						// TODO
					}
				} else {
					if (l % onlyDivisorLeft != 0) {
						return "-1";
					}
				}
			}
			
			if (onlyDivisorLeft != 0) {
				return onlyDivisorLeft + "";
			} else {
			}
		}

		return null;
	}

	private Set<Long> getDivisorsOfNumber(Long l) {
		// TODO Auto-generated method stub
		return null;
	}
}