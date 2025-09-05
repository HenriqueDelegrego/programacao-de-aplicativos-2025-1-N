import java.util.ArrayList;
import java.util.List;

public class Ex1 {
	
	public static void main(String[] args) {
		
		List<String> listaNomes = new ArrayList<String>();
		
		listaNomes.add("Henrique");
		listaNomes.add("João");
		listaNomes.add("Lucas");
		listaNomes.add("Pedro");
		listaNomes.add("Ana");
		
		listaNomes.sort(null);
		
		System.out.println(listaNomes);

		
	}

}
