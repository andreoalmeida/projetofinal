package br.com.andrecorp.projetofinal.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

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

	private Date dataAgendamento;

	@Column(name = "hora_agendamento")

	@Temporal(TemporalType.TIME)

	private Date horaAgendamento;

	@Column(name="observacao", length=255)

	private String observacoes;
}
