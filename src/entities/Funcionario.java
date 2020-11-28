package entities;

public class Funcionario {
	
	private String nome;
	private double horasTrabalhadas;
	private double valorHomemHora;
	
	public Funcionario() {
		
	}

	public Funcionario(String nome, double horasTrabalhadas, double valorHomemHora) {
		this.nome = nome;
		this.horasTrabalhadas = horasTrabalhadas;
		this.valorHomemHora = valorHomemHora;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(double horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public double getValorHomemHora() {
		return valorHomemHora;
	}

	public void setValorHomemHora(double valorHomemHora) {
		this.valorHomemHora = valorHomemHora;
	}
	
	public double pagamento() {
		
		return horasTrabalhadas * valorHomemHora; 
	}
		
}
