import java.util.ArrayList;

public class arraylist {
	static ArrayList<String> listName = new ArrayList<String>();

	public static void main(String[] args) {
		listName.add("Mohammed");
		listName.add("Hossain");
		listName.add("Jamal");
		listName.add("John");
		listName.add("James");
		listName.add("Nyinjey");
		//System.out.println(listName);
	arraylist list1= new arraylist();
	list1.displayList(listName);
	} 
	void displayList(ArrayList<String> names) {
		for (String name: names ) {
			System.out.println(name);
		}
	}

}
