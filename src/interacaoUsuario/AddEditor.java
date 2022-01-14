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
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import pessoa.Editores;
public class AddEditor extends JFrame {

	private JPanel contentPane;
	private Editores editor = new Editores();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddEditor frame = new AddEditor();
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
	public AddEditor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 734, 404);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 720, 367);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 10, 72, 17);
		panel.add(lblNewLabel);
		
		JTextArea nome = new JTextArea();
		nome.setBounds(117, 10, 150, 22);
		panel.add(nome);
		
		JLabel lblMatricula = new JLabel("Matricula:");
		lblMatricula.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMatricula.setBounds(10, 42, 61, 17);
		panel.add(lblMatricula);
		
		JTextArea matricula = new JTextArea();
		matricula.setBounds(117, 40, 150, 22);
		panel.add(matricula);
		
		JLabel lblRg = new JLabel("Rg:");
		lblRg.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblRg.setBounds(10, 69, 45, 17);
		panel.add(lblRg);
		
		JTextArea rg = new JTextArea();
		rg.setBounds(117, 69, 150, 22);
		panel.add(rg);
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSexo.setBounds(10, 96, 45, 17);
		panel.add(lblSexo);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"MASCULINO ", "FEMININO"}));
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 13));
		comboBox.setBounds(117, 96, 170, 21);
		panel.add(comboBox);
		
		JLabel sl = new JLabel("Salario:");
		sl.setFont(new Font("Tahoma", Font.PLAIN, 14));
		sl.setBounds(10, 131, 139, 17);
		panel.add(sl);
		
		JTextArea salario = new JTextArea();
		salario.setBounds(117, 129, 150, 22);
		panel.add(salario);
		
		JLabel lblDataDeIngresso = new JLabel("Data:");
		lblDataDeIngresso.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDataDeIngresso.setBounds(10, 166, 139, 17);
		panel.add(lblDataDeIngresso);
		
		JTextArea data = new JTextArea();
		data.setBounds(117, 166, 150, 22);
		panel.add(data);
		
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
				if (data.getText().length() < 1) {
					new Msg_error().setVisible(true);
					dispose();
			}else {
				editor.setNome(nome.getText());
				editor.setMatricula(Integer.parseInt(matricula.getText()));
				editor.setRg(Integer.parseInt(rg.getText()));
				editor.setSalario(Integer.parseInt(salario.getText()));
				editor.setDataIngresso(data.getText());
			}
			new Msg_sucess().setVisible(true);
			dispose();
		}}
		);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(10, 336, 131, 21);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Voltar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new FuncionarioAbrir().setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1.setBounds(625, 336, 85, 21);
		panel.add(btnNewButton_1);
	}

}
