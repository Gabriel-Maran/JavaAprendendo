package aprendendoExcecoes.runtime.teste;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RunTimeExceptionTeste04 {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        }catch (ArrayIndexOutOfBoundsException e) {//mais objetivo no começo
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        }catch(IndexOutOfBoundsException e) {
            System.out.println("Dentro do IndexOutOfBoundsException");
        }catch(IllegalArgumentException e) {
            System.out.println("Dentro do IllegalArgumentException");
        }catch(ArithmeticException e) {
            System.out.println("Dentro do ArithmeticException");
        }catch(RuntimeException e){
            System.out.println("Dentro do RuntimeException");
        }//mais generico no final


        try {
            talvezLanceException();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void talvezLanceException() throws SQLException, FileNotFoundException {}

}
