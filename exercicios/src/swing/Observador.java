package swing;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Observador {

	public static void main(String[] args) {


		JFrame janela = new JFrame("Observador");
		
		
		//fechamento da janela quanod clicado no botão de fechar 
		janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		janela.setSize(600, 200);
		//melhorando o layout
		janela.setLayout(new FlowLayout());
		//centralização relativa a tela do computador 
		janela.setLocationRelativeTo(null);
		
		
		JButton botao = new JButton("Clicar!");
		janela.add(botao);
		
		
		//sempre uqe o botão for clicado a expressão lambda será chamdo 
		botao.addActionListener(evento -> {
			System.out.println("Evento ocorreu!!!");
		});
		
		
		janela.setVisible(true);
		

	}

}
