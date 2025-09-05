import java.util.ArrayList;
import java.util.List;

public class ExemploArrayList {

	public static void main(String[] args) {

		List<Integer> listaIdades = new ArrayList<>();

		listaIdades.add(23);
		listaIdades.add(25);
		listaIdades.add(12);
		listaIdades.add(45);
		listaIdades.add(27);
		listaIdades.add(15);
		listaIdades.remove(0);

		System.out.println(listaIdades);

	}

}
