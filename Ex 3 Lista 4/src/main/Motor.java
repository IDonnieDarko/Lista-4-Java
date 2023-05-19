
package main;


public class Motor {
    int NumCilindro;
    int Potenci;

    public Motor() {
        this.NumCilindro = 0;
        this.Potenci = 0;
    }

    public Motor(int NumCilindro, int Potenci) {
        this.NumCilindro = NumCilindro;
        this.Potenci = Potenci;
    }

    public void InsertData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número de cilindros: ");
        this.NumCilindro = scanner.nextInt();
        System.out.print("Digite a potência: ");
        this.Potenci = scanner.nextInt();
    }

    public void Print() {
        System.out.println("Número de cilindros: " + this.NumCilindro);
        System.out.println("Potência: " + this.Potenci);
    }
}

class Veiculo extends Motor {
    int Peso;
    int VelocMax;
    float Preco;

    public Veiculo() {
        this.Peso = 0;
        this.VelocMax = 0;
        this.Preco = 0.0f;
    }

    public Veiculo(int NumCilindro, int Potenci, int Peso, int VelocMax, float Preco) {
        super(NumCilindro, Potenci);
        this.Peso = Peso;
        this.VelocMax = VelocMax;
        this.Preco = Preco;
    }

    public void InsertData() {
        super.InsertData();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o peso do veículo em quilos: ");
        this.Peso = scanner.nextInt();
        System.out.print("Digite a velocidade máxima do veículo em Km/h: ");
        this.VelocMax = scanner.nextInt();
        System.out.print("Digite o preço do veículo em R$: ");
        this.Preco = scanner.nextFloat();
    }

    public void Print() {
        super.Print();
        System.out.println("Peso do veículo: " + this.Peso + " kg");
        System.out.println("Velocidade máxima do veículo: " + this.VelocMax + " Km/h");
        System.out.println("Preço do veículo: R$ " + this.Preco);
    }
}

