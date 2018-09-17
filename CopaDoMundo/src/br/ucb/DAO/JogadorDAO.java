package br.ucb.DAO;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.ucb.modelo.Jogador;
import br.ucb.util.FabricaConexao;

public class JogadorDAO implements Serializable{

	private static final long serialVersionUID = 1L;

	public void salvar(Jogador jogador) {
		Connection conexao = FabricaConexao.getConexao();
		try {
			PreparedStatement ps = conexao.prepareCall("INSERT INTO `copadomundo`.`jogador`(`nome`,`idade`,`selecao`,`situacao`,`posicao`)VALUES(?,?,?,?,?)");
			ps.setString(1, jogador.getNome());
			ps.setInt(2, jogador.getIdade());
			ps.setString(3, jogador.getSelecao());
			ps.setString(4, jogador.getSituacao());
			ps.setString(5, "Goleiro");
			ps.execute();
			FabricaConexao.fecharConexao();
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	}
	
	
}
