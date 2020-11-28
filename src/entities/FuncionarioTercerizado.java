package entities;

public class FuncionarioTercerizado extends Funcionario {
	
	private double adicional;
	
	public FuncionarioTercerizado() {
		
	}

	public FuncionarioTercerizado(String nome, double horasTrabalhadas, double valorHomemHora, double adicional) {
		super(nome, horasTrabalhadas, valorHomemHora);
		this.adicional = adicional;
	}

	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}
	
	@Override
	public double pagamento() {
		
		return super.pagamento() + adicional * 1.1; 
	}

	
}
