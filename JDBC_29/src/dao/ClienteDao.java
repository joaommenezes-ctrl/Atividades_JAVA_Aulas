package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Cliente;
import persistence.Connectionfactory;

public class ClienteDao {

	private Connection connection;

	public ClienteDao() {
		this.connection = new Connectionfactory().getConnection();
	}

	public void inserir(Cliente cliente) {
		String sql = "insert into cliente(nome,telefone,email)	 values(?,?,?)";

		try {
			PreparedStatement stmt = connection.prepareStatement(sql);

			stmt.setString(1, cliente.getNome());
			stmt.setString(2, cliente.getTelefone());
			stmt.setString(3, cliente.getEmail());
			stmt.execute();
			stmt.close();

			connection.close();
		} catch (SQLException e) {
			System.err.println("Erro ao gravar registro de cliente");
		}
	}

	public void atualizar(Cliente cliente) {
		String sql = "update cliente set nome=?,telefone=?,email=? where codigo=?";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);

			stmt.setString(1, cliente.getNome());
			stmt.setString(2, cliente.getTelefone());
			stmt.setString(3, cliente.getEmail());
			stmt.setInt(4, cliente.getCodigo());
			stmt.execute();
			stmt.close();

			connection.close();
		} catch (SQLException e) {
			System.err.println("Erro ao gravar!");
		}
	}

	public void remover(int codigo) {
		String sql = "delete from cliente where codigo=?";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);

			stmt.setInt(1, codigo);
			stmt.execute();
			stmt.close();
			connection.close();
		} catch (SQLException e) {
			System.err.println("Erro ao remover!");
		}
	}

	public List<Cliente> listar() {
		String sql = "select * from cliente";

		List<Cliente> clientes = new ArrayList<>();

		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Cliente cliente = 
						new Cliente(rs.getInt("codigo"), 
						            rs.getString("nome"), 
						            rs.getString("telefone"),
						            rs.getString("email"));
				clientes.add(cliente);
			}

			stmt.close();
			rs.close();
			connection.close();
		} catch (SQLException e) {
			System.out.println("Erro!");
			e.printStackTrace();
		}
		return clientes;
	}

}
