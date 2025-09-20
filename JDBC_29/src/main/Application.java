package main;

import java.util.Scanner;
import dao.ClienteDao;
import model.Cliente;

public class Application {

	public static void main(String[] args) {
		inserirCliente();
		atualizarCliente();
		removerCliente();
		listarClientes();
	}

	public static void inserirCliente() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Nome:");
		String nome = sc.next();

		System.out.print("Telefone:");
		String telefone = sc.next();

		System.out.print("Email:");
		String email = sc.next();

		Cliente cliente = new Cliente(null, nome, telefone, email);

		ClienteDao dao = new ClienteDao();
		dao.inserir(cliente);
	}

	public static void atualizarCliente() {
		Cliente cliente = new Cliente(7, "Adriano", "22223445", "a@gmail.com");
		ClienteDao dao = new ClienteDao();
		dao.atualizar(cliente);
	}

	public static void removerCliente() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o código:");
		int codigo = sc.nextInt();
		ClienteDao dao = new ClienteDao();
		dao.remover(codigo);
	}

	public static void listarClientes() {
		ClienteDao dao = new ClienteDao();

		for (Cliente cliente : dao.listar()) {
			System.out.println(cliente.imprimirDados());
		}
	}
}
