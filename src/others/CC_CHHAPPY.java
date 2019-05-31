package others;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CC_CHHAPPY {

	private static String solve(BufferedReader br) throws Exception {
		int n = Integer.valueOf(br.readLine());
		String[] s = br.readLine().split(" ");
		Map<String, Set<Integer>> map = new HashMap<String, Set<Integer>>();
		Set<Integer> temp;
		for (int i = 0; i < n; i++) {
			temp = map.containsKey(s[i]) ? map.get(s[i]) : new HashSet<Integer>();
			temp.add(i);
			map.put(s[i], temp);
		}
		
		boolean isChefHappy = false;
		Iterator<Map.Entry<String, Set<Integer>>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<String, Set<Integer>> entry = iterator.next();
			
			int count = 0;
			Iterator<Integer> setItr = entry.getValue().iterator();
			while (setItr.hasNext()) {
				if(map.containsKey(String.valueOf(1 + setItr.next()))) {
					count++;
				}
				if(count == 2) {
					isChefHappy = true;
					break;
				}
			}
			if(isChefHappy) {
				break;
			}
		}
		
		if(isChefHappy){
			return "Truly Happy";
		} else {
			return "Poor Chef";
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.valueOf(br.readLine());
		while (t > 0) {
			String ans = solve(br);
			System.out.println(ans);
			t--;
		}
	}
}
