import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.security.PublicKey;
import java.awt.event.ActionEvent;

public class ConvertMyZone extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	public JComboBox comboBox;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConvertMyZone frame = new ConvertMyZone();
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
	
	
	public ConvertMyZone() {
		getContentPane().setBackground(new Color(255, 228, 181));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 760, 390);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(220, 20, 60));
		panel.setBounds(33, 24, 678, 47);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome To Time Conversion System");
		lblNewLabel.setBounds(146, 11, 400, 25);
		panel.add(lblNewLabel);
		lblNewLabel.setForeground(new Color(255, 228, 181));
		lblNewLabel.setFont(new Font("Segoe UI Light", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(240, 230, 140));
		panel_1.setBounds(39, 105, 302, 225);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblDTH = new JLabel("Default Time Details");
		lblDTH.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDTH.setHorizontalAlignment(SwingConstants.CENTER);
		lblDTH.setBounds(80, 11, 130, 14);
		panel_1.add(lblDTH);
		
		JLabel lblDTimeZone = new JLabel("Time Zone");
		lblDTimeZone.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDTimeZone.setBounds(31, 102, 69, 14);
		panel_1.add(lblDTimeZone);
		
		JLabel lblDefaultTimeZone = new JLabel("Default Time Zone ID");
		lblDefaultTimeZone.setHorizontalAlignment(SwingConstants.CENTER);
		lblDefaultTimeZone.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDefaultTimeZone.setBounds(21, 46, 130, 14);
		panel_1.add(lblDefaultTimeZone);
		
		JLabel lblDTimeZoneName = new JLabel("Time Zone Name");
		lblDTimeZoneName.setHorizontalAlignment(SwingConstants.LEFT);
		lblDTimeZoneName.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDTimeZoneName.setBounds(31, 158, 130, 14);
		panel_1.add(lblDTimeZoneName);
		
		textField = new JTextField();
		textField.setBounds(21, 71, 258, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(21, 127, 258, 20);
		panel_1.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(21, 183, 258, 20);
		panel_1.add(textField_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(240, 230, 140));
		panel_2.setBounds(395, 105, 302, 225);
		getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblTime_2 = new JLabel("Time");
		lblTime_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblTime_2.setBounds(23, 11, 130, 14);
		panel_2.add(lblTime_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(23, 36, 246, 20);
		panel_2.add(textField_3);
		
		JLabel lblTimeZone = new JLabel("Time Zone");
		lblTimeZone.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblTimeZone.setBounds(23, 67, 69, 14);
		panel_2.add(lblTimeZone);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(23, 92, 246, 20);
		panel_2.add(textField_4);
		
		JLabel lblTimeZoneName = new JLabel("Time Zone Name");
		lblTimeZoneName.setHorizontalAlignment(SwingConstants.LEFT);
		lblTimeZoneName.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblTimeZoneName.setBounds(23, 123, 130, 14);
		panel_2.add(lblTimeZoneName);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(23, 148, 246, 20);
		panel_2.add(textField_5);
		
		 comboBox = new JComboBox();

		String[] ids=TimeZone.getAvailableIDs();
		for(String id:ids)
		{
		comboBox.addItem(id);
		}
		comboBox.setBounds(24, 192, 173, 22);
		panel_2.add(comboBox);
		
		JButton btnCnvt = new JButton("Convert");
		btnCnvt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ConvertedTimeZone();
			}
		});
		btnCnvt.setBounds(203, 192, 89, 23);
		panel_2.add(btnCnvt);
		btnCnvt.setBackground(new Color(50, 205, 50));
		
		JLabel lblNewLabel_1 = new JLabel("* Please Select The Time Zone");
		lblNewLabel_1.setBounds(394, 80, 246, 14);
		getContentPane().add(lblNewLabel_1);
		
		defaulttimezone();
		
		
	}
	

	void defaulttimezone()
	{
		
		String formatString="dd-MM-yyyy hh:mm:ss a";
		SimpleDateFormat dateFormat=new SimpleDateFormat(formatString);
        Date date=new Date();
		
		String defaultTZ=TimeZone.getDefault().getID();
		
		Calendar calendar=new GregorianCalendar();
		calendar.setTime(date);
	
		JLabel lbldtime = new JLabel(dateFormat.format(calendar.getTime()));
		lbldtime.setBounds(43, 80, 210, 14);
		getContentPane().add(lbldtime);
		
		textField.setText(TimeZone.getDefault().getID());
		textField_1.setText(calendar.getTimeZone().getID());
		textField_2.setText(calendar.getTimeZone().getDisplayName());
		
	}
	
	
	void ConvertedTimeZone()
	{
		
		String formatString="dd-MM-yyyy hh:mm:ss a";
		Date date=new Date();
		Calendar calendar=new GregorianCalendar();
		calendar.setTime(date);

		 String newtimezoneid=comboBox.getSelectedItem().toString();
		TimeZone newTimeZone=TimeZone.getTimeZone(newtimezoneid);
	
		SimpleDateFormat dateFormat2=new SimpleDateFormat(formatString);
		dateFormat2.setTimeZone(newTimeZone);
		
		calendar.setTimeZone(newTimeZone);
		
		textField_3.setText(dateFormat2.format(calendar.getTime()));
		textField_4.setText(calendar.getTimeZone().getID());
		textField_5.setText(calendar.getTimeZone().getDisplayName());
		
		
	}
	
}
