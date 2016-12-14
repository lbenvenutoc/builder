package lbenvenutoc.com.builder;

public class AutoDirector {

	private AutoBuilder autoBuilder;

	public void construirAuto() {
		autoBuilder.crearAuto();
		autoBuilder.buildMarca();
		autoBuilder.buildModelo();
		autoBuilder.buildMotor();
		autoBuilder.buildPuertas();
	}

	public void setAutoBuilder(AutoBuilder autoBuilder) {
		this.autoBuilder = autoBuilder;
	}

	public Auto getAuto() {
		return autoBuilder.getAuto();
	}

}
