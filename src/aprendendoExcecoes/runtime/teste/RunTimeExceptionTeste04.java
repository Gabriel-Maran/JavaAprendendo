package aprendendoExcecoes.runtime.teste;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RunTimeExceptionTeste04 {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        }catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e) {//mais objetivo no começo
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        }catch(RuntimeException e){
            System.out.println("Dentro do RuntimeException");
        }//mais generico no final


        try {
            talvezLanceException();
        } catch (SQLException | FileNotFoundException e) { // "|" representa o "ou", não se pode usar se estão na mesma linha de herança
            e.printStackTrace();
        }
    }

    private static void talvezLanceException() throws SQLException, FileNotFoundException {}

}
