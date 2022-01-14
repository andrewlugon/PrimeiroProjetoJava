package interacaoUsuario;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.awt.Choice;
import javax.swing.JFileChooser;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;

public class NomesReceitas extends JFrame {

	private JPanel contentPane;
	private JButton btnNewButton;
	private JTextField textField;
	private JButton btnNewButton_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NomesReceitas frame = new NomesReceitas();
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
	public NomesReceitas() {
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 426, 263);
		getContentPane().add(panel);
		
		JButton button = new JButton("New button");
		panel.add(button);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1151, 513);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(127, 35, 314, 41);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("receitas");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		btnNewButton_1.setBounds(465, 35, 100, 41);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("confirmar");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					new Receita(textField.getText()).setVisible(true);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				dispose();
			}
		});
		btnNewButton_2.setBounds(849, 430, 121, 36);
		contentPane.add(btnNewButton_2);
		
		
		btnNewButton_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	btnNewButtonActionPerformed(evt);
            }
		});}
		private void btnNewButtonActionPerformed(java.awt.event.ActionEvent evt) {
            JFileChooser receitas = new JFileChooser();
            receitas.setDialogTitle("Procurar Receitas");
            receitas.setFileSelectionMode(JFileChooser.FILES_ONLY);
            FileNameExtensionFilter filter = new FileNameExtensionFilter("Receitas", "txt");
            receitas.setAcceptAllFileFilterUsed(false);
            receitas.setFileFilter(filter);
            
            
            int retorno = receitas.showOpenDialog(this);

            if(retorno == JFileChooser.APPROVE_OPTION){
            		
                File file = receitas.getSelectedFile();
                textField.setText(file.getPath());
            }
            

	}
}
