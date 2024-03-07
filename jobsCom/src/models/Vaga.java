package models;

public class Vaga {

	private int candidatos;
	private String descricao;
	private String requisitos;
	private String horario;
	private String modelo; //6x1, remoto, 7x0, presencial
	private double salario;
	
	
	public int getCandidatos() {
		return candidatos;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public String getRequisitos() {
		return requisitos;
	}


	public void setRequisitos(String requisitos) {
		this.requisitos = requisitos;
	}


	public String getHorario() {
		return horario;
	}


	public void setHorario(String horario) {
		this.horario = horario;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}


	public void setCandidatos(int candidatos) {
		this.candidatos = candidatos;
	}


	public Vaga(int candidatos, String descricao, String requisitos, String horario, String modelo, double salario) {
		super();
		this.candidatos = candidatos;
		this.descricao = descricao;
		this.requisitos = requisitos;
		this.horario = horario;
		this.modelo = modelo;
		this.salario = salario;
	}


	
	
	
	
	
}
