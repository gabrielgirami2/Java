package classeAbstrata;

public class TelaGasolina extends Tela {
    
    /* Atributo que guarda o valor da gasolina do veiculo */

    double gas = 100;


    
    /**
	 * Construtor que inicializa o titulo da tela
	 */

    public TelaGasolina(){
        super.setTitulo("Gasolina restante");
    }

    /**
	 * Implementa o método abstrato obterInformacao da classe Tela
	 * Nesse método buscaremos a gasolina restante do veículo
	 */

    @Override
	public String obterInformacao() {
		gas -= 0.4;
		return String.valueOf(gas) + "%";
		
	}
}