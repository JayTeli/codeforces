package others;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://www.hackerrank.com/challenges/java-datatypes/problem
 */
public class HR_DatatypeRanges {
	
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			try {
				HR_DatatypeRanges main = new HR_DatatypeRanges();
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
		long n = 0;
		try {
			n = Long.parseLong(x[0]);
		} catch (Exception e) {
			return x[0] + " can't be fitted anywhere.";
		}
		
		String output = "";
		output += isByte(n);
		output += isShort(n);
		output += isInt(n);
		output += isLong(n);
		
		if(output.isEmpty()) {
			return n + " can't be fitted anywhere.";
		} else {
			String ans =  n + " can be fitted in:\n";
			output = output.substring(0, output.length()-1); // remove trailing new line
			return ans + output;
		}
	}

	/**
	 * Byte = 8 bits
	 */
	private String isByte(long n) {
		boolean isInRange = ( n >= -Math.pow(2, 7)) && ( n <= (Math.pow(2, 7) - 1)) ? true : false;  
		return isInRange ? "* byte\n" : "";
	}
	/**
	 * Short = 16 bits
	 */
	private String isShort(long n) {
		boolean isInRange = ( n >= -Math.pow(2, 15)) && ( n <= (Math.pow(2, 15) - 1)) ? true : false;  
		return isInRange ? "* short\n" : "";
	}
	/**
	 * Int = 32 bits
	 */
	private String isInt(long n) {
		boolean isInRange = ( n >= -Math.pow(2, 31)) && ( n <= (Math.pow(2, 31) - 1)) ? true : false;  
		return isInRange ? "* int\n" : "";
	}
	/**
	 * Long = 64 bits
	 */
	private String isLong(long n) {
		boolean isInRange = ( n >= -Math.pow(2, 63)) && ( n <= (Math.pow(2, 63) - 1)) ? true : false;  
		return isInRange ? "* long\n" : "";
	}
}






