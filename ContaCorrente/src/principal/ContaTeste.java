package principal;

import java.util.Scanner;

public class ContaTeste {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);

		ContaBanco p1 = new ContaBanco();

		System.out.println("Teste Integração GitHub Eclipse");
		System.out.print("Entre com o número da conta: ");
		p1.numConta = ent.nextInt();

		System.out.print("Tipo de conta:");
		p1.setTipo("CC");

		System.out.print("Entre com o nome do dono:");
		p1.setDono(ent.next());

		// p1.setNumConta(1111);
		// p1.setDono("Jubileu");
		
		String nome;
		nome=p1.tipo.toString();
		
		System.out.println("Valor de nome:"+nome);
		
		p1.abrirConta(nome);
		//p1.estadoAtual();

		/*
		 * p1.depositar(100); p1.sacar(50); p1.fecharConta(); p1.estadoAtual();
		 */

		ContaBanco p2 = new ContaBanco();

		/*
		 * p2.setNumConta(2222); p2.setDono("Creuza"); p2.abrirConta("CP");
		 */

		System.out.print("Entre com o número da conta: ");
		p2.numConta = ent.nextInt();

		System.out.print("Tipo de conta:");
		p2.tipo = ent.next();

		System.out.print("Entre com o nome do dono:");
		p2.setDono(ent.next());

		p2.abrirConta("CP");
		/*
		 * p2.depositar(500); p2.sacar(100); // p1.fecharConta();
		 * 
		 * 
		 * 
		 */

		p1.estadoAtual();
		p2.estadoAtual();
		ent.close();
	}

}
