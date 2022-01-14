package interacaoUsuario;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Component;
import javax.swing.JTextArea;
import projetoFinal.Receitas;
import javax.swing.JTable;
import java.io.*;

public class AddReceita extends JFrame {

	private JPanel contentPane;
	private Receitas receitas = new Receitas();
	private JTable table;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddReceita frame = new AddReceita();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AddReceita() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1110, 552);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
			
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setBounds(10, 10, 113, 13);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Categoria:");
		lblNewLabel_1.setBounds(10, 33, 113, 13);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Ingredientes: ");
		lblNewLabel_2.setBounds(10, 66, 113, 13);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Preparo: ");
		lblNewLabel_3.setBounds(10, 166, 113, 13);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Nota:");
		lblNewLabel_4.setBounds(10, 389, 113, 13);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Chef");
		lblNewLabel_5.setBounds(10, 366, 113, 13);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Data: ");
		lblNewLabel_6.setBounds(10, 429, 85, 13);
		panel.add(lblNewLabel_6);
		
		JButton btnNewButton_3 = new JButton("Voltar");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new FuncionarioAbrir().setVisible(true);
				dispose();
			}
		});
		btnNewButton_3.setBounds(991, 474, 85, 21);
		panel.add(btnNewButton_3);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.setBounds(0, 474, 572, 21);
		panel.add(btnNewButton);
		
		JTextArea preparo = new JTextArea();
		preparo.setBounds(109, 176, 887, 164);
		panel.add(preparo);
		
		JTextArea ingre = new JTextArea();
		ingre.setBounds(109, 66, 887, 90);
		panel.add(ingre);
		
		JTextArea nome = new JTextArea();
		nome.setBounds(109, 4, 121, 21);
		
		panel.add(nome);
		
		JTextArea categoria = new JTextArea();
		categoria.setBounds(109, 35, 121, 21);
		panel.add(categoria);
		
		JTextArea chef = new JTextArea();
		chef.setBounds(109, 360, 314, 21);
		panel.add(chef);
		
		JTextArea nota = new JTextArea();
		nota.setBounds(109, 389, 121, 21);
		panel.add(nota);
		
		JTextArea data = new JTextArea();
		data.setBounds(109, 423, 121, 21);
		panel.add(data);
		
		table = new JTable();
		table.setBounds(410, 456, -104, -43);
		panel.add(table);
		
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			/*validando campos
			 *salvando receitas
			 *enviando para a pasta 'Receitas' 	
			 */
				if (preparo.getText().length() < 1) {
					new Msg_error().setVisible(true);
					dispose();
			}else
				if (ingre.getText().length() < 1) {
					new Msg_error().setVisible(true);
					dispose();
			}else
				if (nome.getText().length() < 1) {
					new Msg_error().setVisible(true);
					dispose();
			}else
				if (categoria.getText().length() < 1) {
					new Msg_error().setVisible(true);
					dispose();
			}else
				if (chef.getText().length() < 1) {
					new Msg_error().setVisible(true);
					dispose();
			}else  
				if (nota.getText().length() < 1) {
					new Msg_error().setVisible(true);
					dispose();
			}else
				if (data.getText().length() < 1) {
					new Msg_error().setVisible(true);
					dispose();
			}else {
				receitas.setNome(nome.getText());
				receitas.setCategoria(categoria.getText());
				receitas.setChef(chef.getText());
				receitas.setData(data.getText());
				receitas.setIngredientes(ingre.getText());
				receitas.setPreparo(preparo.getText());
				receitas.setNota(Integer.parseInt(nota.getText()));
				
				try {
					FileWriter receita = new FileWriter("Receitas/"+nome.getText()+".txt", true);
					PrintWriter pw = new PrintWriter(receita);
					pw.println(receitas.getNome());
					pw.println(receitas.getCategoria());
					pw.println(receitas.getIngredientes());
					pw.println(receitas.getPreparo());
					pw.println(receitas.getChef());
					pw.println(receitas.getNota());
					pw.println(receitas.getData());
					pw.flush();
					pw.close();
					receita.close();
					
					
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
				new Msg_sucess().setVisible(true);
				dispose();
			}
			});
	}
}
