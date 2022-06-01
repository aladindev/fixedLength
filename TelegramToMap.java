import java.util.HashMap;
import java.util.Map;

public class TelegramToMap {
	
	public String key;
	public String value;
	public Map<String, String> map;
	
	public TelegramToMap(String key, String value) {
		this.key = key;
		this.value = value;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Map<String, String> getMap() {
		
		String key = getKey();
		String value = getValue();
		Map<String, String> resultMap = new HashMap<>();
		
		resultMap.put(key, value);
		
		return resultMap;
	}
}
