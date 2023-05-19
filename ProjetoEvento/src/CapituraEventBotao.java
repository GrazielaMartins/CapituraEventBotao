import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CapituraEventBotao implements ActionListener {
    JButton botao;
    public void janela() {

        JFrame frame = new JFrame();
        botao = new JButton();


        botao.addActionListener(this::actionPerformed);
        frame.getContentPane().add(botao);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 100);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        botao.setText("Botao foi clicado!");

        botao.setFont(new Font("SansSerif" , Font.BOLD,20));


    }

    public static void main(String[] args) {
        CapituraEventBotao captura = new CapituraEventBotao();
        captura.janela();
    }
}
