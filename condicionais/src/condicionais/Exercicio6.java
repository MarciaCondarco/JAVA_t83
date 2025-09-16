package condicionais;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String colaborador;
		int codigo;
		float salario;
		
		System.out.println("==========================");
		System.out.println("COD    CARGO    PERCENTUAL");
		System.out.println("1     gerente    	10%	  ");
		System.out.println("2     Vendedor    	 7%	  ");
		System.out.println("3     Supervisor   	 9%	  ");
		System.out.println("4     Motorista    	 6%	  ");
		System.out.println("5     Estoquista     5%	  ");
		System.out.println("6     Técnico de ti  8%	  ");
		System.out.println("==========================");
		
		System.out.println("qual o nome do colaborador?");
		colaborador = leia.next();
		
		System.out.println("qual codigo do cargo que deseja");
		codigo = leia.nextInt();
		
		System.out.println("Qual o seu salario");
		salario=leia.nextFloat();
		
		
		
		switch(codigo) {
		case 1:
			System.out.println("nome do colaborador: " + colaborador);
			System.out.println("cargo: gerente");
			System.out.println("salario: " + salario + (0.10 * salario));
			break;
		case 2:
			System.out.println("nome do colaborador: " + colaborador);
			System.out.println("cargo: vendedor");
			System.out.println("salario: " + salario + (0.07 * salario));
			break;
		case 3:
			System.out.println("nome do colaborador: " + colaborador);
			System.out.println("cargo: supervisor");
			System.out.println("salario: " + salario + (0.09 * salario));
			break;
		case 4:
			System.out.println("nome do colaborador: " + colaborador);
			System.out.println("cargo: motorista");
			System.out.println("salario: " + salario + (0.06 * salario));
			break;
		case 5:
			System.out.println("nome do colaborador: " + colaborador);
			System.out.println("cargo: estoquista");
			System.out.println("salario: " + salario + (0.05 * salario));
			break;
		case 6:
			System.out.println("nome do colaborador: " + colaborador);
			System.out.println("cargo: tecnico de ti");
			System.out.println("salario: " + salario + (0.08 * salario));
			break;
		}
		
	}

}
