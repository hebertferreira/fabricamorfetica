package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;
import entities.FuncionarioTercerizado;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o numero de funcionarios: ");
		int n = sc.nextInt();
		
		List<Funcionario> listFunc = new ArrayList<>();
		
		for(int i = 1; i <= n; i++) {
			System.out.printf("Funcionario #%d\n", i);
			System.out.print("Terciarizado? (S/N)");
			char ch = sc.next().charAt(0);
			System.out.print("Nome:");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Horas trabalhadas:");
			int horasTrabalhadas = sc.nextInt();
			System.out.print("Valor homem hora:");
			double valorHomemHora = sc.nextDouble();
			
			if(ch == 'S' || ch == 's') {
				System.out.print("Informe o valor adicional: ");
				double adicional = sc.nextDouble();
				Funcionario func = new FuncionarioTercerizado(nome, horasTrabalhadas, valorHomemHora, adicional);
				listFunc.add(func);
			}else {
				listFunc.add(new Funcionario(nome, horasTrabalhadas, valorHomemHora));
			}
			
			System.out.println();
			System.out.println("==== PAGAMENTOS ====");
			for(Funcionario func : listFunc) {
				System.out.println(func.getNome() + " - " + String.format("%.2f.",func.pagamento()));
			}
		}
		sc.close();
	}

}
