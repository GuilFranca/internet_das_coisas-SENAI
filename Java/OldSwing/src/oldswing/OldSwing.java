package oldswing;

import javax.swing.*;

public class OldSwing {

    public static void main(String[] args) {

        JFrame janela =new JFrame("Minha Primeira Janela");
        janela.setSize(300, 200);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLayout(null);
        
        JButton botao = new JButton("Clique aqui!");
        botao.setBounds(80, 70, 130, 30);
        
        botao.addActionListener(e -> {
            JOptionPane.showMessageDialog(null, "Olá, mundo Swing!");
        });
        
        janela.add(botao);
        
        janela.setVisible(true);
        
    }
    
}
