package lbenvenutoc.com.builder;

public class FiatBuilder extends AutoBuilder {

	@Override
	public void buildMotor() {
		Motor motor = new Motor();
		motor.setNumero(1111);
		motor.setPotencia("23 HP");
		auto.setMotor(motor);
	}

	@Override
	public void buildModelo() {
		auto.setModelo("Palio");

	}

	@Override
	public void buildMarca() {
		auto.setMarca("Fiat");

	}

	@Override
	public void buildPuertas() {
		auto.setCantidadDePuertas(2);

	}

}
