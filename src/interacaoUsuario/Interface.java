package interacaoUsuario;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class Interface extends JFrame {
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 * @return 
	 */
	public void rodar() {
	EventQueue.invokeLater(new Runnable() {
		public void run() {
			try {
				Interface frame = new Interface();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	});}
	public static void main(String[] args) {
		
	}

	/**
	 * Create the frame.
	 */
	public Interface() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 847, 462);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 823, 425);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("ABRIR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new InterfaceAbrir().setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(357, 87, 132, 40);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Livro De Receitas");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(347, 29, 156, 48);
		panel.add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("Funcionarios ");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new FuncionarioAbrir().setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1.setBounds(10, 359, 146, 56);
		panel.add(btnNewButton_1);
	}
}
