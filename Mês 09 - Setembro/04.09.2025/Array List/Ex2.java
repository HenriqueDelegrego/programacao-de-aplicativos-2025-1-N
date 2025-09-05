import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex2 {

	public static void main(String[] args) {

		List<String> listaNomes = new ArrayList<String>();

		listaNomes.add("Henrique");
		listaNomes.add("João");
		listaNomes.add("Lucas");
		listaNomes.add("Pedro");
		listaNomes.add("Ana");
		
		Collections.reverse(listaNomes);
		
		System.out.println(listaNomes);
		
	}

}
