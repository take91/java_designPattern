import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		String x = "KAKAO";
		solution(x);
	}

	static int[] solution(String msg) {
		Map<String, Integer> dic = new HashMap<>();

		int x = 65;
		for (int i = 0; i < 26; i++) {
			dic.put(((char) x++) + "", i + 1);
		}

		char[] ch = msg.toCharArray();

		System.out.println(dic);
		System.out.println(Arrays.toString(ch));

		for (int i = 0; i < ch.length; i++) {
			String w = String.valueOf(ch[i]);
			String c = "";
			
			if (i < ch.length - 1) {
				c = String.valueOf(ch[i + 1]);
			}
			if (dic.containsKey(w)) {
				System.out.println(dic.get(w));
			}
			if (!dic.containsKey(w + c)) {
				Object[] dicSize = dic.values().toArray();
				Arrays.sort(dicSize);
				
				dic.put(w+c, (Integer) dicSize[dicSize.length-1]+1);
			}
		}

		System.out.println(dic);

		
		
		int[] answer = {};
		return answer;
	}

}
