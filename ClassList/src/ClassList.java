import java.util.Map;

public class ClassList {

	public static void main(String[] args) {
		Map<String, String> classlist = HashMap<String,String>();
		public ClassGrades() {
			classlist.put("Bob","A");
			classlist.compute("Mary","C");
			classlist.compute("Sarah","B");
			classlist.compute("Philip","A");
			classlist.compute("Greg","F");
		}
public void printClassList() {

	Iterator<Entry<String,String>> entries = classList.entrySet().iterator();

while(entries.hasNext()) {
	Entry<String,String> entry = entries.next();
	System.out.println("Key = "+entry.getKey()+", Value = "+entry.getValue());
}
}
public void printClassList2() {
	for(Map.Entry<String, String> entry : classList.entrySet()) {
		System.out.println("Key = "+entry.getKey()+", Value = "+entry.getValue());
	}
	
	for(String key : classList.keySet()) {
		System.out.println("Key = "+key);
	}
	for (String key : classList.values()) {
		System.out.println("Value = "+value);
	}
}
public static void main(String[] args) {
	ClassGrades myClassList = new ClassGrades();
	myClassList.printClassList();
}
	}

}
