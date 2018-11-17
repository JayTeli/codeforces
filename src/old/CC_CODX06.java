import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class CC_CODX06 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long t = Long.parseLong(br.readLine());
		while (t > 0) {
			BigDecimal n = new BigDecimal(br.readLine());
			String[] in = br.readLine().split(" ");
			BigDecimal s = new BigDecimal(in[0]);
			BigDecimal k = new BigDecimal(in[1]);
			String[] arr = br.readLine().split(" ");
			BigDecimal sum = BigDecimal.ZERO;
			for (BigDecimal i = BigDecimal.ZERO; i.compareTo(n) == -1 ; i = i.add(BigDecimal.ONE)) {
				sum = sum.add(new BigDecimal(arr[i.intValue()]));
				if (sum.compareTo(s) != -1) {
					break;
				}
			}
			BigDecimal ans = BigDecimal.ZERO;
			if (sum.compareTo(s) == -1) {
				ans = s.subtract(sum).divide(k);
			}
			ans = ans.setScale(0, RoundingMode.CEILING);
			System.out.println(ans);
			t--;
		}
	}
}
