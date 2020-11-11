package br.com.java;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class JanelaPoupancaGrid extends JFrame{
	
	private JTextField campoJuros, campoAnos, campoDeposito;
    private JLabel lbJuros, lbAnos, lbDeposito, lbTotal, lbResultado;
    private JButton ok;
    private JMenuBar jmb;
    private JMenu menuAjuda;
    private JMenuItem menuItemSobre;
    
    public JanelaPoupancaGrid()
    {
        // "Settings" da janela
        super("Poupex");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setBounds(50,100,360,160);
        this.setResizable(false);
        
        // Cria o container e o associa à janela
        JPanel painel = new JPanel();
        this.setContentPane(painel);
        
        // Troca o layout do container para Grid
        painel.setLayout(new GridLayout(5,2));
       
        // Instancia os componentes e coloca no container 
        lbJuros = new JLabel("Juros ao mês %:");
        campoJuros = new JTextField(15);
        painel.add(lbJuros);
        painel.add(campoJuros);
        lbAnos = new JLabel("Num. de anos:");
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
        painel.add(new JPanel());
        painel.add(ok);
        
        // Instancia os menus...
        jmb = new JMenuBar();
        menuAjuda = new JMenu("Ajuda");
        menuItemSobre = new JMenuItem("Sobre poupex");
        //...e faz as associacoes
        menuAjuda.add(menuItemSobre);
        jmb.add(menuAjuda);
        this.setJMenuBar(jmb);
    }  

}
