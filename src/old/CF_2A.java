import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class CF_2A {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			try {
				CF_2A main = new CF_2A();
				int t = Integer.parseInt(br.readLine());
				String output = main.handleTestCase(br, t);
				System.out.println(output);
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

		// Rank maps first player to score x or greater than x
		Map<Integer, String> rank = new HashMap<Integer, String>();
		// Score maps player to its overall score
		Map<String, Integer> scores = new HashMap<String, Integer>();

		for (int i = 0; i < t; i++) {
			String[] x = br.readLine().split(" ");
			String name = x[0];
			int roundScore = Integer.parseInt(x[1]);
			int oldScore = scores.containsKey(name) ? scores.get(name) : 0;
			scores = setPlayerScore(name, roundScore , scores);
			int newScore = scores.get(name);
			if(newScore > 0) { // As at the end , atleast one players scores positive.
				rank = updateRank(rank , name , oldScore , newScore);
			}
		}
		int max = -10000000;
		int temp = 0;
		for(Map.Entry<String, Integer> e : scores.entrySet()) {
			temp = e.getValue();
			if(max < temp) {
				max = temp;
			}
		}
		
		String bestPlayer = rank.get(max);
		return bestPlayer;
	}

	private Map<String, Integer> setPlayerScore(String name, int roundScore, Map<String, Integer> scores) {
		if(scores.containsKey(name)) {
			scores.put(name, roundScore + scores.get(name));
		} else {
			scores.put(name, roundScore);
		}
		return scores;
	}

	private Map<Integer, String> updateRank(Map<Integer, String> rank, String name, int oldScore, int newScore) {
		int startIndex = (oldScore <= newScore) ? oldScore : newScore;
		int endIndex = (oldScore <= newScore) ? newScore : oldScore;
		for (int i = startIndex; i <= endIndex; i++) {
			if (!rank.containsKey(i)) {
				rank.put(i, name);
			}
		}

		return rank;
	}
}
