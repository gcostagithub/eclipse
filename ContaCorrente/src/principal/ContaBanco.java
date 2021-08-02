package principal;

public class ContaBanco {
	public int numConta;
	public String tipo;
	private String dono;
	private double saldo;
	private boolean status;

	public ContaBanco() {
		this.saldo = 0;
		this.status = false;
	}

	public void estadoAtual() {
		System.out.println("-------------------------------");
		System.out.println("Contas: " + this.getNumConta());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Dono: " + this.getDono());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Status: " + this.getStatus());
	}

	public void abrirConta(String tipo) {

		this.setTipo(tipo);
		this.setStatus(true);
		System.out.println("Conta aberta com sucesso");

		/*
		 * 
		 * Scanner ent = new Scanner(System.in);
		 * 
		 * System.out.print("Entre com o número da conta: "); this.numConta =
		 * ent.nextInt();
		 * 
		 * System.out.print("Tipo de conta:"); tipo = ent.next();
		 */
		if (this.getTipo() == "CC") {
			this.setSaldo(50);
		}
		if (this.tipo == "CP") {
			this.saldo = 150;
		}
	}
	/*
	 * System.out.print("Entre com o nome do dono:"); this.dono = ent.next();
	 * 
	 * System.out.println("Saldo:" + saldo);
	 * 
	 * System.out.print("Status:" + status); ent.close();
	 * 
	 * }
	 */

	public void fecharConta() {
		if (this.getSaldo() > 0) {
			System.out.println("Conta não pode ser fechada porque ainda tem saldo positivo");

		} else if (this.getSaldo() < 0) {
			System.out.println("Conta não pode ser fechada pois tem débito");
		} else {
			this.setStatus(false);
			System.out.println("Conta fechada com sucesso");
		}
	}

	public void depositar(double v) {

		if (this.getStatus()) {
			this.setSaldo(this.getSaldo() + v);
			System.out.println("Depósito realizado na conta de " + this.getDono());
		} else {
			System.out.println("Não foi possível depositar. Conta fechada!!");
		}

	}

	public void sacar(float v) {
		if (this.getStatus()) {
			if (this.getSaldo() >= v) {
				this.setSaldo(this.getSaldo() - v);
				System.out.println("Saque de " + v + " realizado na conta de " + this.dono);
			} else {
				System.out.println("Saldo insuficiente para saque");
			}
		} else {
			System.out.println("Impossível fechar de uma conta fechada");
		}
	}

	public void pagarMensal() {

		int v = 0;
		if (this.getTipo() == "CC") {
			v = 12;
		} else if (this.getTipo() == "CP") {
			v = 20;
		}
		if (this.getStatus()) {
			this.setSaldo(this.getSaldo() - v);
			System.out.println("Mensalidade paga com sucesso por " + this.getDono());
		} else {
			System.out.println("Impossível pagar uma conta fechada!");
		}

	}

	public int getNumConta() {
		return this.numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDono() {
		return this.dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean getStatus() {
		return this.status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

}
