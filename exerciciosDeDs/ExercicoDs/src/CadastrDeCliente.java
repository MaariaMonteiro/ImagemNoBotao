/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dti
 */
import javax.swing.*;
import java.awt.*;
public class CadastrDeCliente extends JFrame {
    
     /* CRIAÇÃO DE VARIÁVEIS DE INSTANCIA */
    // JLABEL - USADO PARA CRIAR ESPAÇO DE JANELA
    JLabel rotulo1, rotulo2, rotulo3, rotulo4, rotulo5, rotulo6, rotulo7;
   
    // JTEXTFIELD - CAIXA DE TEXTO
    JTextField texto1, texto2, texto3, texto4, texto5, texto6, texto7;
    
    JButton botao1, botao2;
    
    // Criando metodo construtor
    public CadastrDeCliente(){
         
        // Titutlo da página
        super("Cadatro_Pagina");
        
        // CRIAÇÃO DO CONTAINER PARA RECEBER OBJETOS
        Container tela = getContentPane();
        
        // é para autorizar o uso do setBounds e dos objetos- (tem que estar null)
        setLayout(null);
        
        
        JLabel titleLabel = new JLabel("Cadastro de Cliente", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Serif", Font.BOLD, 21));
        titleLabel.setForeground(Color.MAGENTA);
        titleLabel.setBounds(0, 0, 400, 60);
        tela.add(titleLabel);
        
        
        /* criando os objetos */
      
        rotulo1 = new JLabel ("Nome:");
        rotulo2 = new JLabel ("Cpf:");
        rotulo3 = new JLabel ("RG:");
        rotulo4 = new JLabel ("Endereço:");
        rotulo5 = new JLabel("Cidade");
        rotulo6 = new JLabel("Estado");
        rotulo7 = new JLabel("Cep");
        
        
        // VARIÁVEL = novo objeto JTextField ( CARACTERES QUE SUPORTA)
        texto1 = new JTextField (50);
        texto2 = new JTextField (4);
        texto3 = new JTextField (4);
        texto4 = new JTextField (50);
        texto5 = new JTextField (40);
        texto6 = new JTextField (30);
        texto7 = new JTextField (20);
        
        
       ImageIcon enviar =  new ImageIcon ("abrir.png");
       ImageIcon delet  =  new ImageIcon("delet.png");
       
       
        botao1 = new JButton ("Ok", enviar);
        botao2 = new JButton ("Cancelar", delet);
        botao1.setForeground(Color.MAGENTA);
        botao2.setForeground(Color.MAGENTA);
        
        
        
        // utilizando os objetos
       rotulo1.setBounds(50,50,80,20);
        rotulo2.setBounds(50,90,80,20);
        rotulo3.setBounds(50,130,80,20);
        rotulo4.setBounds(50,170,80,20);
        rotulo5.setBounds(50,210,80,20);
        rotulo6.setBounds(50,250,80,20);
        rotulo7.setBounds(50,290,80,20);
        texto1.setBounds(50,70,240,20);
        texto2.setBounds(50,110,140,20);
        texto3.setBounds(50,150,120,20);
        texto4.setBounds(50,190,220,20);
        texto5.setBounds(50,230,190,20);
        texto6.setBounds(50,270,70,20);
        texto7.setBounds(50,310,110,20);
        botao1.setBounds(70,345,110,20);
        botao2.setBounds(230,345,110,20);
        
        
        //com o objeto "TELA" que foi criado no container, adicionamos os objetos Na tela
        tela.add(rotulo1);
        tela.add(rotulo2);
        tela.add(rotulo3);
        tela.add(rotulo4);
        tela.add(rotulo5);
        tela.add(rotulo6);
        tela.add(rotulo7);
        
        
        tela.add(texto1);
        tela.add(texto2);
        tela.add(texto3);
        tela.add(texto4);
        tela.add(texto5);
        tela.add(texto6);
        tela.add(texto7);
        
        
        tela.add(botao1);
        tela.add(botao2);
        
       
        
        
        
        setSize(420,430);
        setVisible(true);
        setLocationRelativeTo(null);
    }
}

    

