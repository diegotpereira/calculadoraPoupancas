package br.com.java;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class JanelaPoupanca extends JFrame implements ActionListener{
	
	private JTextField campo_juros, campo_anos, campo_deposito;
    private JLabel lb_juros, lb_anos, lb_deposito, lb_total, lb_resultado;
    private JButton ok;
    private Poupanca minhaPoupanca;
    private JMenuBar menu;
    private JMenu menuAjuda;
    private JMenuItem menuSobre;
    
    public JanelaPoupanca() {
        super("Poupex");
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        JPanel painel = new JPanel();
        painel.setLayout(new GridLayout(5,2));
        this.getContentPane().add(painel);
        lb_juros = new JLabel("Juros ao mês %:");
        campo_juros = new JTextField(15);
        painel.add(lb_juros);
        painel.add(campo_juros);
        lb_anos = new JLabel("Num. de anos:");
        campo_anos = new JTextField(15);
        painel.add(lb_anos);
        painel.add(campo_anos);
        lb_deposito = new JLabel("Depósito mensal R$:");
        campo_deposito = new JTextField(15);
        painel.add(lb_deposito);
        painel.add(campo_deposito);
        lb_total = new JLabel("Total poupado R$:");
        painel.add(lb_total);
        lb_resultado = new JLabel("");
        painel.add(lb_resultado);
        painel.add(new JLabel());
        ok = new JButton("OK");
        ok.addActionListener(this);
        painel.add(ok);
        menu = new JMenuBar();
        menuAjuda = new JMenu("Ajuda");
        menuAjuda.setMnemonic('u');
        menuSobre = new JMenuItem("Sobre Poupex");
        menuSobre.setMnemonic('P');
        menuSobre.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null,
                "Poupex - Calculador de investimentos\nVersão: 1.0\nAutor: Júlio Pereira Machado\nData: 26-10-2003",
                "Sobre Poupex", JOptionPane.PLAIN_MESSAGE);
            }
        });
        menuAjuda.add(menuSobre);
        menu.add(menuAjuda);
        this.setJMenuBar(menu);
    }
    
    public void actionPerformed(ActionEvent evt) {
        if (evt.getSource() == ok) {
            double juros = Double.parseDouble(campo_juros.getText());
            int anos = Integer.parseInt(campo_anos.getText());
            double deposito = Double.parseDouble(campo_deposito.getText());
            Poupanca poup = new Poupanca(anos,juros,deposito);
            double resultado = poup.calculaTotal();
            DecimalFormat formatador = new DecimalFormat();
            formatador.setMaximumFractionDigits(2);
            lb_resultado.setText(formatador.format(resultado));
        }
    }
    
    public static void main(String args[]) {
    	JanelaPoupanca janela = new JanelaPoupanca();
        janela.pack();
        janela.setVisible(true);
    }


}
