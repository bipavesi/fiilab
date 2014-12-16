package teamsoftware;

public class Log {

	private String nome;
	private String cognome;
	private String compito;
	private String ore;
	
	public Log(String nome, String cognome, String compito, String ore) {
		super();
		this.setNome(nome);
		this.setCognome(cognome);
		this.setCompito(compito);
		this.setOre(ore);
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCompito(String compito) {
		this.compito = compito;
	}

	public String getCompito() {
		return compito;
	}

	public void setOre(String ore) {
		this.ore = ore;
	}

	public String getOre() {
		return ore;
	}
	
	
}
