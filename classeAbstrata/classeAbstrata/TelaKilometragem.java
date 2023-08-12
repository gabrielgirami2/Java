package classeAbstrata;

public class TelaKilometragem extends Tela{

	/* Atributo que guarda o valor da km do veiculo */  
	int km = 0;
	
	/**
	 * Construtor que inicializa o titulo da tela
	 */
	
	public TelaKilometragem() {
		super.setTitulo("kM atual");
	}
	

	/**
	 * Implementa o método abstrato obterInformacao da classe Tela
	 * Nesse método buscaremos a km atual do veículo
	 */
	
	@Override
	public String obterInformacao() {
		km += 10;
		return String.valueOf(km) + "km";
		
	}

	
	
	
}
