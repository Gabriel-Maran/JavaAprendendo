package aprendendoConcorrencia.teste;


import aprendendoConcorrencia.dominio.Membros;
import aprendendoConcorrencia.service.EmailDeliveryService;

import javax.swing.*;

public class EmailsDeliveryTeste01 {
    public static void main(String[] args) {
        Membros membro = new Membros();
        Thread Thread1 = new Thread(new EmailDeliveryService(membro), "Thread1");
        Thread Thread2 = new Thread(new EmailDeliveryService(membro), "Thread2");
        Thread1.start();
        Thread2.start();
        while (true) {
            String email = JOptionPane.showInputDialog("Entre com seu email");
            if (email == null || email.isEmpty()) {
                membro.close();
                break;
            }
            membro.addMemberEmail(email);
        }
    }
}
