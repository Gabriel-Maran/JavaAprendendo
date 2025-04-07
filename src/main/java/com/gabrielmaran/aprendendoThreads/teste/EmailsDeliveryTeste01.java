package com.gabrielmaran.aprendendoThreads.teste;

import com.gabrielmaran.aprendendoThreads.dominio.Membros;
import com.gabrielmaran.aprendendoThreads.service.EmailDeliveryService;

import javax.swing.*;

public class EmailsDeliveryTeste01 {
    public static void main(String[] args) {
        Membros memb = new Membros();
        Thread threadAbc = new Thread(new EmailDeliveryService(memb), "Abc");
        Thread threadcba = new Thread(new EmailDeliveryService(memb), "Cba");
        threadAbc.start();
        threadcba.start();
        while (true) {
            String email = JOptionPane.showInputDialog("Entre com seu email");
            if (email == null || email.isEmpty()) {
                memb.close();
                break;
            }
            memb.addMemberEmail(email);
        }
    }
}
