package br.com.java;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class JanelaPoupanca extends JFrame{
	
	private JTextField campoJuros;
	private JTextField campoAnos;
	private JTextField campoDeposito;
	private JLabel lbJuros;
	private JLabel lbAnos;
	private JLabel lbDeposito;
	private JLabel lbTotal;
	private JLabel lbResultado;
	private JButton ok;
	
	public JanelaPoupanca() {
		
		super("Poupex");
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.setBounds(500, 100, 350, 150);
		
		JPanel painel = new JPanel();
		this.setContentPane(painel);
		
		lbJuros = new JLabel ("Juros ao mês %:");
		campoJuros = new JTextField(15);
		painel.add(lbJuros);
		
		painel.add(campoJuros);
		lbAnos = new JLabel("Numero de anos:");
		campoAnos = new JTextField(15);
		painel.add(lbAnos);
		
		painel.add(campoAnos);
		lbDeposito = new JLabel("Depósito mensal R$:");
		campoDeposito = new JTextField(15);
		
		painel.add(lbDeposito);
		painel.add(campoDeposito);
		
		lbTotal = new JLabel("Total poupado R$:");
		painel.add(lbTotal);
		
		lbResultado = new JLabel("");
		painel.add(lbResultado);
		
		ok = new JButton("OK");
		painel.add(ok);
	}

}
