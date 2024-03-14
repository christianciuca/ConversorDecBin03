package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class VentanaConversorDecBin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField numBin;

	/**
	 * Create the frame.
	 */
	public VentanaConversorDecBin() {
		setTitle("ConversorDecBin03Grupo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{1.0, 1.0, 1.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel DecimalLabel = new JLabel("Decimal");
		DecimalLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_DecimalLabel = new GridBagConstraints();
		gbc_DecimalLabel.insets = new Insets(0, 0, 5, 5);
		gbc_DecimalLabel.gridx = 1;
		gbc_DecimalLabel.gridy = 1;
		contentPane.add(DecimalLabel, gbc_DecimalLabel);
		
		JTextArea NumDec = new JTextArea();
		GridBagConstraints gbc_NumDec = new GridBagConstraints();
		gbc_NumDec.insets = new Insets(0, 0, 5, 5);
		gbc_NumDec.fill = GridBagConstraints.BOTH;
		gbc_NumDec.gridx = 1;
		gbc_NumDec.gridy = 2;
		contentPane.add(NumDec, gbc_NumDec);
		
		JLabel calcularLabel = new JLabel("Binario");
		calcularLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_calcularLabel = new GridBagConstraints();
		gbc_calcularLabel.insets = new Insets(0, 0, 5, 5);
		gbc_calcularLabel.gridx = 1;
		gbc_calcularLabel.gridy = 3;
		contentPane.add(calcularLabel, gbc_calcularLabel);
		
		numBin = new JTextField();
		GridBagConstraints gbc_numBin = new GridBagConstraints();
		gbc_numBin.insets = new Insets(0, 0, 5, 5);
		gbc_numBin.fill = GridBagConstraints.HORIZONTAL;
		gbc_numBin.gridx = 1;
		gbc_numBin.gridy = 4;
		contentPane.add(numBin, gbc_numBin);
		numBin.setColumns(10);
		
		JButton calcularButton = new JButton("calcular");
		calcularButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		calcularButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_calcularButton = new GridBagConstraints();
		gbc_calcularButton.insets = new Insets(0, 0, 0, 5);
		gbc_calcularButton.gridx = 1;
		gbc_calcularButton.gridy = 5;
		contentPane.add(calcularButton, gbc_calcularButton);
	}

}
