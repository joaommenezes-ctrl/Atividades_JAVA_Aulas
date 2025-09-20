package Funcionario;

public class FuncionarioPublico {
    private String nome;
    private double salario;
    private final int anoConcurso; 

  
    public FuncionarioPublico(String nome, double salario, int anoConcurso) {
        this.nome = nome;
        this.salario = salario;
        this.anoConcurso = anoConcurso;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getAnoConcurso() {
        return anoConcurso;
    }

   
    @Override
    public String toString() {
        return "FuncionarioPublico {" +
               "nome='" + nome + '\'' +
               ", salario=" + salario +
               ", anoConcurso=" + anoConcurso +
               '}';
    }

    public static void main(String[] args) {
        FuncionarioPublico f1 = new FuncionarioPublico("Maria", 4500.00, 2010);
        FuncionarioPublico f2 = new FuncionarioPublico("João", 5200.00, 2015);
        FuncionarioPublico f3 = new FuncionarioPublico("Ana", 6100.00, 2018);

        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
    }
}