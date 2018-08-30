package br.ucb.modelo;

import java.io.Serializable;

public class Eleicao implements Serializable{
	private static final long serialVersionUID = 1L;
	
	public static final int JUIR_BOLSONATO = 12;
	public static final int GERARDO_AIQUIMEDO = 51;
	public static final int LUIZ_MOLUSCO = 69;
	
	private int votosJuir = 0;
	private int votosGerardo = 0;
	private int votosLuiz = 0;
	
	
	public void votarJuir() {
		this.votosJuir += 1;
	}
	
	public void votarGerardo() {
		this.votosGerardo += 1;
	}
	
	public void votarLuiz() {
		this.votosLuiz += 1;
	}
	
	public int getVotosJuir() {
		return votosJuir;
	}

	public int getVotosGerardo() {
		return votosGerardo;
	}

	public int getVotosLuiz() {
		return votosLuiz;
	}
}
