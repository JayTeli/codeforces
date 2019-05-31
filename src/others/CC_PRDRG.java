package others;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class CC_PRDRG {

	private static HashMap<String, Long> map = new HashMap<String, Long>();

	public static long gcd(long a, long b) {
		if (b == 0) {
			return a;
		} else {
			return gcd(b, a % b);
		}
	}

	private static String removeTrailingZeros(double d) {
		String s = String.valueOf(d);
		return s = s.indexOf(".") < 0 ? s : s.replaceAll("0*$", "").replaceAll("\\.$", "");
	}

	private static HashMap<String, Long> getFractionFromDouble(double area) {
		String[] number = removeTrailingZeros(area).split("\\.");
		map.put("N", Long.valueOf(number[0]) + Long.valueOf(number[1]));
		map.put("D", (long) Math.pow(10, number[1].length()));
		return map;
	}

	private static HashMap<String, Long> getIrreductionFractionFromFraction(HashMap<String, Long> fraction) {
		long num = fraction.get("N");
		long deno = fraction.get("D");
		long gcd = gcd(num, deno); // GCD of num and Deno
		fraction.put("N", num / gcd);
		fraction.put("D", deno / gcd);
		return fraction;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int t = Integer.valueOf(input[0]);
		int n = 0;
		String output = "";
		for (int index = 1; index <= t; index++) {
			n = Integer.valueOf(input[index]);
			double area = 0d;
			for (int i = 1; i <= n; i++) {
				if (i % 2 == 0) {
					area = area / 2;
				} else {
					area = ((1 - area) / 2) + area;
				}
				HashMap<String, Long> fraction = new HashMap<String, Long>();
				fraction = getFractionFromDouble(area);
				fraction = getIrreductionFractionFromFraction(fraction);
				if (i == n) {
					output += fraction.get("N") + " " + fraction.get("D") + " ";
				}
			}
		}
		System.out.print(output.trim());
	}
}
