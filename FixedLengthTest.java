import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FixedLengthTest {
	
	/*
	 * fixed Length
	 */    
    static final int uniqueIdLeng = 12;
    static final int nameLeng     = 15;
    static final int phoneNumLeng = 15;
    static final int[] fixedLength = { uniqueIdLeng, nameLeng, phoneNumLeng };
    static final String[] key = { "uniqueId", "name", "phoneNum" };
    
    static String testTelegram ="202205280001ALADIN         01611112222    ";
    
    public static ArrayList<Map<String, String>> parseToMap(String telegram) {
    	
    	int pos = 0;
    	ArrayList<Map<String, String>> resultArray = new ArrayList<>();
    	
    	for(int i = 0 ; i < key.length ; i++) {
    		Map<String, String> map = new HashMap<>();
    		
    		String value = telegram.substring(pos, fixedLength[i]+pos);
    		map.put(key[i], value);
    	
    		resultArray.add(map);
    		
    		pos = fixedLength[i]+1;
    	}
    	
    	return resultArray;
    	
    }
    
	public static void main(String[] args) {

		ArrayList<Map<String, String>> result = parseToMap(testTelegram);

		StringBuilder sb = new StringBuilder();
		
		for(int i = 0 ; i < result.size() ; i++) {
			sb.append("key : " + key[i] + " value : " + result.get(i).get(key[i]) + "\n");
		}
		
		System.out.println(sb.toString());
	}
}
