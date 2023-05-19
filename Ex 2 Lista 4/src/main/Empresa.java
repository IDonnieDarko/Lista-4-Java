
package main;


import java.util.Scanner;

class Empresa {
    private String nome;
    private String endereco;
    private String cidade;
    private String estado;
    private String cep;
    private String fone;

    public Empresa() {
        // Construtor sem argumentos
    }

    public Empresa(String nome, String endereco, String cidade, String estado, String cep, String fone) {
        this.nome = nome;
        this.endereco = endereco;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.fone = fone;
    }

    public void Insert() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nome: ");
        nome = scanner.nextLine();
        System.out.print("Endereço: ");
        endereco = scanner.nextLine();
        System.out.print("Cidade: ");
        cidade = scanner.nextLine();
        System.out.print("Estado: ");
        estado = scanner.nextLine();
        System.out.print("CEP: ");
        cep = scanner.nextLine();
        System.out.print("Telefone: ");
        fone = scanner.nextLine();
    }

    public void Print() {
        System.out.println("Dados da Empresa:");
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Cidade: " + cidade);
        System.out.println("Estado: " + estado);
        System.out.println("CEP: " + cep);
        System.out.println("Telefone: " + fone);
    }
}

class Restaurante extends Empresa {
    private String tipoComida;
    private double precoMedioPrato;

    public Restaurante() {
        // Construtor sem argumentos
    }

    public Restaurante(String nome, String endereco, String cidade, String estado, String cep, String fone,
                       String tipoComida, double precoMedioPrato) {
        super(nome, endereco, cidade, estado, cep, fone);
        this.tipoComida = tipoComida;
        this.precoMedioPrato = precoMedioPrato;
    }

    public void Insert() {
        super.Insert();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tipo de Comida: ");
        tipoComida = scanner.nextLine();
        System.out.print("Preço Médio de um Prato: ");
        precoMedioPrato = scanner.nextDouble();
    }

    public void Print() {
        super.Print();
        System.out.println("Tipo de Comida: " + tipoComida);
        System.out.println("Preço Médio de um Prato: " + precoMedioPrato);
    }
}
