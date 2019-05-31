package others;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class CF_1029B {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			try {
				CF_1029B main = new CF_1029B();
//				int t = Integer.parseInt(br.readLine());
				int t = 1;
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
		int n = Integer.parseInt(br.readLine());
		String[] x = br.readLine().split(" ");
		Map<Integer , Integer> map = new HashMap<Integer, Integer>();
		HashSet<Integer> h = new HashSet<Integer>();
		for(int i = n-1 ; i >=0  ; i--){
//			map.put(i, getCount(i , h));
		} 
		
//		return 1+ max;
		return null;
	}

//	private Integer getCount(int i, HashSet<Integer> h) {
//		int count = 0;
//		for(Integer k : h) {
//			if(k < ) 
//		}
//		return null;
//	}

	private int getMax(String[] x, int i) {
		for (int j = i; j < x.length ; j++) {
			
		}
		return 1;
	}
}
