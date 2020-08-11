package br.com.andrecorp.projetofinal.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "itmn032_agendamento")
public class Agendamento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "num_seq")
	private int num_seq;

	@Column(name = "nome_cli", length = 100)
	private String nome_cli;

	@Column(name = "email_cli", length = 100)
	private String email_cli;

	@Column(name = "celular_cli", length = 20)
	private String celuar_cli;

	@Column(name = "data_agendamento")

	@Temporal(TemporalType.DATE)
	@JsonFormat(pattern="dd/MM/yyyy", shape=JsonFormat.Shape.STRING)

	private Date dataAgendamento;

	@Column(name = "hora_agendamento")

	@Temporal(TemporalType.TIME)
	@JsonFormat(pattern="HH:mm", shape=JsonFormat.Shape.STRING, timezone ="America/Sao_Paulo")

	private Date horaAgendamento;

	@Column(name = "observacao", length = 255)

	private String observacoes;

	@ManyToOne
	@JoinColumn(name = "id_agencia")
	@JsonIgnoreProperties("listaAgendamentos")
	private Agencia agencia;

	public int getNum_seq() {
		return num_seq;
	}

	public void setNum_seq(int num_seq) {
		this.num_seq = num_seq;
	}

	public String getNome_cli() {
		return nome_cli;
	}

	public void setNome_cli(String nome_cli) {
		this.nome_cli = nome_cli;
	}

	public String getEmail_cli() {
		return email_cli;
	}

	public void setEmail_cli(String email_cli) {
		this.email_cli = email_cli;
	}

	public String getCeluar_cli() {
		return celuar_cli;
	}

	public void setCeluar_cli(String celuar_cli) {
		this.celuar_cli = celuar_cli;
	}

	public Date getDataAgendamento() {
		return dataAgendamento;
	}

	public void setDataAgendamento(Date dataAgendamento) {
		this.dataAgendamento = dataAgendamento;
	}

	public Date getHoraAgendamento() {
		return horaAgendamento;
	}

	public void setHoraAgendamento(Date horaAgendamento) {
		this.horaAgendamento = horaAgendamento;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public Agencia getAgencia() {
		return agencia;
	}

	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}
}
