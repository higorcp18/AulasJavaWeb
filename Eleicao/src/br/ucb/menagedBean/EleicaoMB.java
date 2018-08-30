package br.ucb.menagedBean;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.ucb.modelo.Eleicao;

@ManagedBean(name="eleicaoMB")
@SessionScoped
public class EleicaoMB implements Serializable{
	private static final long serialVersionUID = 1L;
	
	Eleicao eleicao;
	private int vote = 0;

	private float percentJuir = 0;
	private float percentGerardo = 0;
	private float percentLuiz = 0;
	private String ganhador;

	public String votar() {
		switch (vote) {
		case 12:
			this.eleicao.votarJuir();
			break;
		case 51:
			this.eleicao.votarGerardo();
			break;
		case 69:
			this.eleicao.votarLuiz();
			break;
		default:
			System.out.println("Voto nulo!");
			break;
		}
		vote = 0;
		return "index";
	}
	
	private void calculaPercent() {
		int totalVotos = this.eleicao.getVotosGerardo() + this.eleicao.getVotosJuir() + this.eleicao.getVotosLuiz();
		
		if( this.eleicao.getVotosJuir() != 0 ) {
			this.percentJuir = this.eleicao.getVotosJuir() * 100 / totalVotos;
		}
		if( this.eleicao.getVotosGerardo() != 0 ) {
			this.percentGerardo = this.eleicao.getVotosGerardo() * 100 / totalVotos;
		}
		if( this.eleicao.getVotosLuiz() != 0) {
			this.percentLuiz = this.eleicao.getVotosLuiz() * 100 / totalVotos;
		}
	}
	
	private void defineVencedor() {
		int ganhador = this.eleicao.getVotosJuir();
		this.ganhador = "Juir Bolsanato";
		
		if(ganhador < this.eleicao.getVotosLuiz()) {
			ganhador = this.eleicao.getVotosLuiz();
			this.ganhador = "Luiz Quinegócio Molusco da Selva";
		}else if( ganhador < this.eleicao.getVotosGerardo() ) {
			ganhador = this.eleicao.getVotosGerardo();
			this.ganhador = "Gerardo Aiquimedo";
		}	
	}
	
	public String resultado() {
		calculaPercent();
		defineVencedor();
		return "resultado";
	}
	
	public float getPercentJuir() {
		return percentJuir;
	}


	public float getPercentGerardo() {
		return percentGerardo;
	}

	public float getPercentLuiz() {
		return percentLuiz;
	}

	public EleicaoMB() {
		this.eleicao = new Eleicao();
	}
	
	
	public Eleicao getEleicao() {
		return eleicao;
	}

	public int getVote() {
		return vote;
	}
	
	public void setVote(int vote) {
		this.vote = vote;
	}
	
	public String getGanhador() {
		return ganhador;
	}
}
