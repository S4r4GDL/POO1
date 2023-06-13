import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.TextArea;

import javax.swing.Box;
import javax.swing.BoxLayout;

public class MinhaAgenda {
    //Main
    public static void main(String[] args) {
        
        Tela agenda = new Tela();
    }
    
    //A classe Tela herda de JFrame e monta a tela da agenda
    static class Tela extends JFrame {

        public static final int LARGURA = 1024;
        public static final int ALTURA = 500;

        JPanel JPCentral;
        JPanel JPAreaDados;
        JPanel JPAreaAnotacoes;
        JPanel JPAreaBotoes;


        JPanel JPCodigo;
        JPanel JPNome;
        JPanel JPEndereco;
        JPanel JPTelefone;
        JPanel JPAnotacoes;
        JPanel JPDados;

        JLabel JLCodigo;
        JLabel JLNome;
        JLabel JLEndereco;
        JLabel JLTelefone;
        JLabel JLAnotacoes;

        JTextField JTFCodigo;
        JTextField JTFNome;
        JTextField JTFEndereco;
        JTextField JTFTelefone;

        JTextArea JTAAnotacoes;

        JButton JBAnterior;
        JButton JBProximo;
        JButton JBFim;
        JButton JBInserir;
        JButton JBConsultar; 
        JButton JBAlterar;
        JButton JBExcluir;
        JButton JBLimpar;

        JScrollPane jspTabela;

        JTable JTTabela;
        DefaultTableModel modeloTabela;

        
        //construtor da tela da agenda
        public Tela (){

            setSize(Tela.LARGURA, Tela.ALTURA);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            getContentPane().setLayout(new BorderLayout());
            montarTela();
            
            setVisible(true);
        }
        
        private void montarTela(){
            //Para a imagem
            JLabel JLRotulo = new JLabel(new ImageIcon("./Agenda.png"));
            getContentPane().add("North", JLRotulo);

            //Para colocar anotações
            //Para montar a tabela
            //Para colocar os dados do contato
            
            JPCentral = new JPanel();
            JPCentral.setLayout(new BorderLayout());
            JPCentral.setBackground(Color.yellow); 


            JPAreaDados = new JPanel();
            JPAreaDados.setLayout(new BorderLayout());
            JPAreaDados.add(Box.createVerticalStrut(500));

            JPAreaAnotacoes = new JPanel();
            JPAreaAnotacoes.setLayout(new BorderLayout());
            
            /*CÓDIGO
            NOME
            ENDEREÇO
            TELRFONE
            ANOTAÇÕES
            TABELA */


            //CÓDIGO
            JLCodigo = new JLabel("CÓDIGO:");
            JPCodigo = new JPanel();
            JTFCodigo = new JTextField(10);
            JPCodigo.add(JLCodigo);
            JPCodigo.add(JTFCodigo);
            JPCodigo.setLayout(new FlowLayout());


            //NOME
            JLNome = new JLabel("NOME:");
            JPNome = new JPanel();
            JTFNome = new JTextField(10);
            JPNome.add(JLNome);
            JPNome.add(JTFNome);
            JPNome.setLayout(new FlowLayout());


            //ENDEREÇO
            JLEndereco = new JLabel("ENDEREÇO:");
            JPEndereco = new JPanel();
            JTFEndereco = new JTextField(10);
            JPEndereco.add(JLEndereco);
            JPEndereco.add(JTFEndereco);
            JPEndereco.setLayout(new FlowLayout());


            //TELEFONE
            JLTelefone = new JLabel("TELEFONE:");
            JPTelefone = new JPanel();
            JTFTelefone = new JTextField(10);
            JPTelefone.add(JLTelefone);
            JPTelefone.add(JTFTelefone);
            JPTelefone.setLayout(new FlowLayout());


            //CAMPOS DE TEXTFIELD
            JPDados = new JPanel();
            JPDados.setLayout(new BorderLayout());
            JPDados.setLayout(new BoxLayout(JPDados, BoxLayout.Y_AXIS)); 

            JPDados.add("Center", JPCodigo);
            JPDados.add("Center", JPNome);
            JPDados.add("Center", JPEndereco);
            JPDados.add("Center", JPTelefone);


            //ANOTAÇÕES

            JPAnotacoes = new JPanel();
            JPAnotacoes.setLayout(new BoxLayout(JPAnotacoes, BoxLayout.Y_AXIS));

            JLAnotacoes = new JLabel("Anotações");
            JTAAnotacoes = new JTextArea(50, 20);
            JTAAnotacoes.setLineWrap(true);
            JTAAnotacoes.setWrapStyleWord(true);
            JLAnotacoes.setAlignmentX(JLabel.CENTER_ALIGNMENT); 

            JPAnotacoes.add(JLAnotacoes);
            JPAnotacoes.add(JTAAnotacoes);
            
            JPAnotacoes.add(new JScrollPane(JTAAnotacoes));

            JPAreaAnotacoes.add("West", JPAnotacoes);
                        

            //BOTÕES
            JPAreaBotoes = new JPanel();
            JPAreaBotoes.setLayout(new BorderLayout());
            JPAreaBotoes.setLayout(new ());

            JBAnterior = new JButton("ANTERIOR");
            JBProximo = new JButton("PRÓXIMO");
            JBFim = new JButton("FIM NAVEGAÇÃO");
            
            JPDados.add("South", JBAnterior);
            JPDados.add("South", JBAnterior);
            JPDados.add("South", JBProximo);
            JPDados.add("South", JBFim);

            JBInserir = new JButton("INSERIR");
            JBConsultar = new JButton("CONSULTAR"); 
            JBAlterar = new JButton("ALTERAR");
            JBExcluir = new JButton("EXCLUIR");
            JBLimpar = new JButton("LIMPAR");

            JPAreaBotoes.add("South", JBInserir);
            JPAreaBotoes.add("South", JBConsultar);
            JPAreaBotoes.add("South", JBAlterar);
            JPAreaBotoes.add("South", JBExcluir);
            JPAreaBotoes.add("South", JBLimpar);

            //TABELA
            modeloTabela =  new DefaultTableModel();
            modeloTabela.addColumn("CÓDIGO");
            modeloTabela.addColumn("NOME");
            modeloTabela.addColumn("ENDEREÇO");
            modeloTabela.addColumn("TELOFONE");
            Object[] linha = {12345, "coluna1", 993615452, "coluna3"};
            modeloTabela.addRow(linha);
            modeloTabela.addRow(linha);
            modeloTabela.addRow(linha);
            JTTabela = new JTable(modeloTabela);

            jspTabela = new JScrollPane(JTTabela);


            JPCentral.add("Center", jspTabela);

            //ENCAIXE GERAL DOS JPanels
            JPAreaDados.add("East", JPAreaAnotacoes);
            JPAreaDados.add("West", JPDados);
            JPAreaDados.add("South", JPAreaBotoes);

            //Colocando tudo
            JPCentral.add("Center", JTTabela);
            JPCentral.add("West", JPAreaDados);
            getContentPane().add("Center", JPCentral);
        }
    }
}
 