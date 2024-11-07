import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numero id");
        int id = scanner.nextInt();
        System.out.println("Digite a descrição");
        String descricao = scanner.nextLine();
        System.out.println("Digite o status");
        String status = scanner.nextLine();
        scanner.close();

        Genero genero1 = new Genero(id, descricao, status);
        genero1.inserir();
    }
}
