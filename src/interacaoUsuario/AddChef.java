package interacaoUsuario;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Date;
import java.awt.event.ActionEvent;
import pessoa.Cozinheiros;

public class AddChef extends JFrame {

	private JPanel contentPane;
	private Cozinheiros cheff = new Cozinheiros();
	 
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddChef frame = new AddChef();
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
	public AddChef() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 681, 328);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 667, 291);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 10, 72, 17);
		panel.add(lblNewLabel);
		
		JLabel lblMatricula = new JLabel("Matricula:");
		lblMatricula.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMatricula.setBounds(10, 42, 61, 17);
		panel.add(lblMatricula);
		
		JLabel lblRg = new JLabel("Rg:");
		lblRg.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblRg.setBounds(10, 69, 45, 17);
		panel.add(lblRg);
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSexo.setBounds(10, 96, 45, 17);
		panel.add(lblSexo);
		
		JLabel lblSalario = new JLabel("Salario:");
		lblSalario.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSalario.setBounds(10, 131, 139, 17);
		panel.add(lblSalario);
		
		JLabel lblDataDeIngresso = new JLabel("Data:");
		lblDataDeIngresso.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDataDeIngresso.setBounds(10, 209, 139, 17);
		panel.add(lblDataDeIngresso);
		
		JTextArea nome = new JTextArea();
		nome.setBounds(117, 10, 150, 22);
		panel.add(nome);
		
		
		JTextArea matricula = new JTextArea();
		matricula.setBounds(117, 40, 150, 22);
		panel.add(matricula);
		
		JTextArea rg = new JTextArea();
		rg.setBounds(117, 69, 150, 22);
		panel.add(rg);
		
		JComboBox sexo = new JComboBox();
		sexo.setFont(new Font("Tahoma", Font.PLAIN, 13));
		sexo.setModel(new DefaultComboBoxModel(new String[] {"MASCULINO ", "FEMININO"}));
		sexo.setBounds(117, 96, 194, 21);
		panel.add(sexo);
		
		JTextArea salario = new JTextArea();
		salario.setBounds(117, 129, 150, 22);
		panel.add(salario);
		
		JTextArea data = new JTextArea();
		data.setBounds(117, 207, 150, 22);
		panel.add(data);
		
		
		
		JButton btnNewButton_1 = new JButton("Voltar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new FuncionarioAbrir().setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1.setBounds(551, 260, 85, 21);
		panel.add(btnNewButton_1);
		
		JLabel lblOndeTrabalhou = new JLabel("Onde trabalhou:");
		lblOndeTrabalhou.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblOndeTrabalhou.setBounds(10, 163, 139, 17);
		panel.add(lblOndeTrabalhou);
		
		JTextArea ondeTrabalhou = new JTextArea();
		ondeTrabalhou.setBounds(117, 161, 150, 22);
		panel.add(ondeTrabalhou);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (nome.getText().length() < 1) {
					new Msg_error().setVisible(true);
					dispose();
			}else
				if (matricula.getText().length() < 1) {
					new Msg_error().setVisible(true);
					dispose();
			}else
				if (rg.getText().length() < 1) {
					new Msg_error().setVisible(true);
					dispose();
			}else
				if (salario.getText().length() < 1) {
					new Msg_error().setVisible(true);
					dispose();
			}else
				if (ondeTrabalhou.getText().length() < 1) {
					new Msg_error().setVisible(true);
					dispose();
			}else  
				if (data.getText().length() < 1) {
					new Msg_error().setVisible(true);
					dispose();
			}else
				if (data.getText().length() < 1) {
					new Msg_error().setVisible(true);
					dispose();
			}else {
				cheff.setNome(nome.getText());
				cheff.setMatricula(Integer.parseInt(matricula.getText()));
				cheff.setRg(Integer.parseInt(rg.getText()));
				cheff.setSalario(Integer.parseInt(salario.getText()));
				cheff.setOndeTrabalhou(ondeTrabalhou.getText());
				cheff.setDataIngresso(data.getText());
				
			}
				new Msg_sucess().setVisible(true);
				dispose();	
		}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(10, 255, 131, 21);
		panel.add(btnNewButton);
	}
}
