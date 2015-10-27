package br.edu.nassau.modelo;

public class Atividade {

	private int id;
	private String tipo;
	private String descricao;
	private String responsavel;
	private String datainicial;
	private String datafinal;
	private double status;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}

	public String getDatainicial() {
		return datainicial;
	}

	public void setDatainicial(String datainicial) {
		this.datainicial = datainicial;
	}

	public String getDatafinal() {
		return datafinal;
	}

	public void setDatafinal(String datafinal) {
		this.datafinal = datafinal;
	}

	public double getStatus() {
		return status;
	}

	public void setStatus(double status) {
		this.status = status;
	}

}
