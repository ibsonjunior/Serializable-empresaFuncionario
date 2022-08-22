import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Programa {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();

        Funcionario f1 = new Funcionario("João", "Silva", "233434023", 5000.00);
        Funcionario f2 = new Funcionario("Márcia", "Oliveira", "542322344", 12000.00);
        Funcionario f3 = new Funcionario("Gilese", "Braga", "3421323322", 2500.00);
        Funcionario f4 = new Funcionario("Carlos", "Motta", "8322312324", 8000.00);

        funcionarios.add(f1);
        funcionarios.add(f2);
        funcionarios.add(f3);
        funcionarios.add(f4);

        FileOutputStream fo = null;

        try {
            fo = new FileOutputStream("listaFuncionarios.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fo);
            oos.writeObject(funcionarios);
        }
        catch (FileNotFoundException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        // Recuperar a coleção de um arquivo .txt
        List<Funcionario> recuperaFuncionarios = null;

        FileInputStream fi = null;

        try{
            fi = new FileInputStream("listaFuncionarios.txt");
            ObjectInputStream ois = new ObjectInputStream(fi);
            recuperaFuncionarios = (ArrayList)ois.readObject();

        }catch (FileNotFoundException e){
            System.out.println("ERROR: " + e.getMessage());
        }catch (Exception e){
            System.out.println("ERROR: " + e.getMessage());
        }

        for (Funcionario func :  recuperaFuncionarios){
            System.out.println(
                    func.getNome() +  " ; " +
                            func.getSobrenome() + " ; " +
                            func.getCpf() + " ; " +
                            func.getEmpresa() + " ; " +
                            func.getCnpjEmpresa() + " ; " +
                            func.getSalario());
        }

    }
}
