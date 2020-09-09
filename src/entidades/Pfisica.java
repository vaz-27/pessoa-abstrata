package entidades;

public class Pfisica extends Pessoa {
	
	private Double gastoSaude;
	
	public Pfisica() {
		super(); 
	}


	public Pfisica(String nome, Double rendaAnual, Double gastoSaude) {
		super(nome, rendaAnual);
		this.gastoSaude = gastoSaude;
	}


	public Double getGastoSaude() {
		return gastoSaude;
	}

	public void setGastoSaude(Double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}

	@Override
	public Double imposto() {
		if (rendaAnual<20000) {
			rendaAnual *= 0.15;
		}
		else {
			rendaAnual *= 0.25;
		}
		if(gastoSaude!=0) {
			rendaAnual -= (gastoSaude*0.5);
		}
		
		return rendaAnual;

	}

}
