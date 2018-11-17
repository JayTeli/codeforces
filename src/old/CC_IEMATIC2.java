import java.math.BigInteger;

public class CC_IEMATIC2 {

	private static BigInteger zero = BigInteger.ZERO;
	private static BigInteger two = new BigInteger("2");
	private static BigInteger ten = new BigInteger("10");
	private static BigInteger hundred = new BigInteger("100");
	private static BigInteger hundred_and_ten = new BigInteger("110");

	public static void main(String[] args) {
		BigInteger n = new BigInteger("199999999999");
		while (true) {
			BigInteger sum = getSumOfDigits(n);
			if (sum.equals(hundred)) {
				BigInteger doubleNum = n.multiply(two);
				BigInteger sum2 = getSumOfDigits(doubleNum);
				if (sum.equals(hundred_and_ten)) {
					System.out.println("n=" + n + " is Expert. SOD_of_n = " + sum + " SOD_of_2n " + n.multiply(two) + " = " + sum2);
					break;
				} else {
					System.out.println("n=" + n + " is Pro. SOD_of_n = " + sum + " SOD_of_2n " + n.multiply(two) + " = " + sum2);
				}
			} else {
				System.out.println("n=" + n + " is noob. SOD = " + sum);
			}
			n = getNextGreaterNumberUsingSameDigits(n);
		}
	}

	private static BigInteger getSumOfDigits(BigInteger i) {
		BigInteger sum = zero;
		while (!i.equals(zero)) {
			sum = sum.add(i.mod(ten));
			i = i.divide(ten);
		}
		return sum;
	}

	/**
	 * Input a number with digits sorted in "ASCENDING ORDER"
	 */
	private static BigInteger getNextGreaterNumberUsingSameDigits(BigInteger n) {

		String digits = n.toString();
		int previousDigit = -1;
		BigInteger ans = zero;
		int power = 0;
		BigInteger previouslyAddedValue = zero;
		BigInteger temp = zero;
		boolean isSwapped = false;
		for (int i = digits.length() - 1; i >= 0; i--) {
			int digit = (int) (digits.charAt(i) - '0');
			
			if (!isSwapped) {
				if (previousDigit == -1 || digit == previousDigit) {
					previousDigit = digit;
					temp = BigInteger.valueOf((long) Math.pow(10, power)).multiply(BigInteger.valueOf(digit));
					ans = ans.add(temp);
					previouslyAddedValue = temp;
				} else {
					ans = ans.mod(previouslyAddedValue);
					previouslyAddedValue = previouslyAddedValue.multiply(ten);
					ans = ans.add(previouslyAddedValue);
					temp = BigInteger.valueOf((long) Math.pow(10, power - 1)).multiply(BigInteger.valueOf(digit));
					ans = ans.add(temp);
				}
			} else {
				temp = BigInteger.valueOf((long) Math.pow(10, power)).multiply(BigInteger.valueOf(digit));
				ans = ans.add(temp);
			}

			power++;
		}

		return ans;
	}
}
