import java.io.BufferedWriter;
import java.io.FileWriter;

public class Genero {
    public int id;
    public String descricao;
    public String status;

    public Genero(int id, String descricao, String status) {
        this.id = id;
        this.descricao = descricao;
        this.status = status;
    }

    public boolean inserir() {
        FileWriter fw = new FileWriter("genero.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write(this.id + ";" + this.descricao + ";" + this.status + ";");
        bw.close();

        return true;
    }
}