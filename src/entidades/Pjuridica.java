package entidades;

public class Pjuridica extends Pessoa {
	
	private Integer nFuncionarios;
	
	public Pjuridica() {
		super();
	}
	
	public Pjuridica(String nome, Double rendaAnual, Integer nFuncionarios) {
		super(nome, rendaAnual);
		this.nFuncionarios = nFuncionarios;
	}

	public Integer getnFuncionarios() {
		return nFuncionarios;
	}

	public void setnFuncionarios(Integer nFuncionarios) {
		this.nFuncionarios = nFuncionarios;
	}

	@Override
	public Double imposto() {
		if (nFuncionarios > 10) {
			return rendaAnual *= 0.14;
		}
		else {
			return rendaAnual *= 0.16;
		}
	}

}
