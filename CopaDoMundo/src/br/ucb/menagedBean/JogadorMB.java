package br.ucb.menagedBean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import br.ucb.DAO.JogadorDAO;
import br.ucb.modelo.Jogador;

@ManagedBean(name="JogadorMB")
@RequestScoped
public class JogadorMB implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Jogador jogador = new Jogador();
	
	public String adicionar() {
		new JogadorDAO().salvar(jogador);
		return "index";
	}
	
	public Jogador getJogador() {
		return jogador;
	}

	public void setJogador(Jogador jogador) {
		this.jogador = jogador;
	}
	
}