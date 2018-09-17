package br.ucb.modelo;

import java.io.Serializable;

import br.ucb.enums.PosicaoJogador;

public class Jogador implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String nome;
	private int idade;
	private String selecao;
	private String situacao;
	private PosicaoJogador posicao;
	
	public Jogador() {
		// TODO Auto-generated constructor stub
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getSelecao() {
		return selecao;
	}
	public void setSelecao(String selecao) {
		this.selecao = selecao;
	}
	public PosicaoJogador getPosicao() {
		return posicao;
	}
	public void setPosicao(PosicaoJogador posicao) {
		this.posicao = posicao;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
}
