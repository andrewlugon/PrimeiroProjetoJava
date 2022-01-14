package interacaoUsuario;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.*;
import java.awt.Font;
import javax.swing.SwingConstants;
public class Receita extends JFrame {

	private JPanel contentPane;
	private static String[] campos = new String[7];
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	/**
	 * Create the frame.
	 * @throws IOException 
	 */

	public Receita(String receita) throws IOException {
		try {
			FileReader ler;
			ler = new FileReader(receita);
			BufferedReader lerLinha =new BufferedReader(ler);
			for (int i = 0; i<7; i++) {
			campos[i] = lerLinha.readLine();
			System.out.println(campos[i]);
			}
			lerLinha.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 998, 514);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 974, 467);
		contentPane.add(panel);
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
				new InterfaceAbrir().setVisible(true);
				dispose();
			}
			
			
		});
		btnNewButton_3.setBounds(862, 429, 102, 28);
		panel.add(btnNewButton_3);
		
		JLabel nome = new JLabel("");
		nome.setFont(new Font("Tahoma", Font.PLAIN, 13));
		nome.setBounds(109, 10, 121, 21);
		nome.setText(campos[0]);
		panel.add(nome);
		
		JLabel categoria = new JLabel((String) null);
		categoria.setFont(new Font("Tahoma", Font.PLAIN, 13));
		categoria.setBounds(109, 33, 167, 21);
		categoria.setText(campos[1]);
		panel.add(categoria);
		
		JLabel ingredientes = new JLabel((String) null);
		ingredientes.setVerticalAlignment(SwingConstants.TOP);
		ingredientes.setFont(new Font("Tahoma", Font.PLAIN, 13));
		ingredientes.setBounds(109, 66, 855, 101);
		ingredientes.setText(campos[2]);
		panel.add(ingredientes);
		
		JLabel preparo = new JLabel((String) null);
		preparo.setVerticalAlignment(SwingConstants.TOP);
		preparo.setFont(new Font("Tahoma", Font.PLAIN, 13));
		preparo.setBounds(109, 166, 855, 184);
		preparo.setText(campos[3]);
		panel.add(preparo);
		
		JLabel chef = new JLabel((String) null);
		chef.setFont(new Font("Tahoma", Font.PLAIN, 13));
		chef.setBounds(109, 360, 121, 21);
		chef.setText(campos[4]);
		panel.add(chef);
		
		JLabel nota = new JLabel((String) null);
		nota.setFont(new Font("Tahoma", Font.PLAIN, 13));
		nota.setBounds(109, 392, 121, 21);
		nota.setText(campos[5]);
		panel.add(nota);
		
		JLabel data = new JLabel((String) null);
		data.setFont(new Font("Tahoma", Font.PLAIN, 13));
		data.setBounds(105, 429, 121, 21);
		data.setText(campos[6]);
		panel.add(data);
		
	}
	
}
