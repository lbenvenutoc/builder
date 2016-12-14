package lbenvenutoc.com.builder;

/**
 * Hello world!
 *
 */
public class Principal {
	public static void main(String[] args) {

		AutoDirector autoDirector = new AutoDirector();
		autoDirector.setAutoBuilder(new FiatBuilder());
		autoDirector.construirAuto();
		Auto auto = autoDirector.getAuto();
		
		System.out.println(auto.getMarca());
		System.out.println(auto.getModelo());

	}
}
