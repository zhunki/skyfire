package generation;

import java.util.Comparator;
import java.util.Map;

public class ValueComparator implements Comparator<Map.Entry<String, Double>> {

	public int compare(Map.Entry<String, Double> mp1, Map.Entry<String, Double> mp2) {
		return mp1.getValue().compareTo(mp2.getValue());
	}
}
