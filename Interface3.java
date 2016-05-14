package asdfg;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

import javax.swing.JScrollPane;

import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class Interface3 extends JFrame {

	private JPanel contentPane;
	int m;
	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface3 frame = new Interface3();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 */
	public Interface3(ArrayList<car> array1, int key) {
		setTitle("CAR RECOMMENDER SYSTEM");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 606, 630);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(100, 149, 237));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(5, 11, 580, 296);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblimg = new JLabel("");
		lblimg.setBounds(23, 27, 200, 114);
		panel.add(lblimg);
		
		JLabel lblBrand = new JLabel("");
		lblBrand.setBounds(233, 27, 195, 25);
		lblBrand.setText(array1.get(key).branddata + " "+ array1.get(key).modeldata +" "+ array1.get(key).extramodel);
		panel.add(lblBrand);
		lblBrand.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel labelOtr = new JLabel("OTR Price:");
		labelOtr.setBounds(233, 63, 69, 25);
		panel.add(labelOtr);
		
		JLabel labelRm1 = new JLabel("RM");
		labelRm1.setBounds(421, 63, 32, 25);
		panel.add(labelRm1);
		
		JLabel lblOtr = new JLabel("");
		lblOtr.setBounds(452, 63, 65, 25);
		lblOtr.setText(""+ array1.get(key).otrcsv);
		panel.add(lblOtr);
		
		JLabel labelMIns = new JLabel("Estimated Monthly Installment:");
		labelMIns.setBounds(233, 93, 178, 25);
		panel.add(labelMIns);
		
		JLabel labelRm2 = new JLabel("RM");
		labelRm2.setBounds(421, 93, 32, 25);
		panel.add(labelRm2);
		
		JLabel lblMIns = new JLabel("");
		lblMIns.setBounds(452, 93, 65, 25);
		lblMIns.setText(""+ array1.get(key).mInscsv);
		panel.add(lblMIns);
		
		JLabel lblmonthlyInstallmentIs = new JLabel("*Monthly Installment is estimated for 9 years");
		lblmonthlyInstallmentIs.setBounds(233, 116, 276, 25);
		panel.add(lblmonthlyInstallmentIs);
		
		JLabel labelcc = new JLabel("CC:");
		labelcc.setBounds(71, 152, 46, 25);
		panel.add(labelcc);
		
		JLabel lblcc = new JLabel("");
		lblcc.setBounds(183, 152, 46, 25);
		lblcc.setText(""+ array1.get(key).cccsv);
		panel.add(lblcc);
		
		JLabel labelGearType = new JLabel("Gear type:");
		labelGearType.setBounds(71, 182, 69, 25);
		panel.add(labelGearType);
		
		JLabel lblGearType = new JLabel("");
		lblGearType.setBounds(183, 182, 106, 25);
		lblGearType.setText(array1.get(key).geartype);
		panel.add(lblGearType);
		
		JLabel labelGearNo = new JLabel("Gear number:");
		labelGearNo.setBounds(71, 212, 84, 25);
		panel.add(labelGearNo);
		
		JLabel lblGearNo = new JLabel("");
		lblGearNo.setBounds(183, 212, 46, 25);
		lblGearNo.setText(""+ array1.get(key).gearno);
		panel.add(lblGearNo);
		
		JLabel labelDoor = new JLabel("Door:");
		labelDoor.setBounds(318, 152, 46, 25);
		panel.add(labelDoor);
		
		JLabel lblDoor = new JLabel("");
		lblDoor.setBounds(407, 152, 46, 25);
		lblDoor.setText(""+ array1.get(key).doorcsv);
		panel.add(lblDoor);
		
		JLabel labelSeat = new JLabel("Seat:");
		labelSeat.setBounds(318, 182, 46, 25);
		panel.add(labelSeat);
		
		JLabel lblSeat = new JLabel("");
		lblSeat.setBounds(407, 182, 46, 25);
		lblSeat.setText(""+ array1.get(key).seatcsv);
		panel.add(lblSeat);
		
		JLabel labelAirBag = new JLabel("Air bag:");
		labelAirBag.setBounds(318, 212, 61, 25);
		panel.add(labelAirBag);
		
		JLabel lblAirBag = new JLabel("");
		lblAirBag.setBounds(407, 212, 46, 25);
		lblAirBag.setText(""+ array1.get(key).airbagcsv);
		panel.add(lblAirBag);
		
		JLabel labelSegment = new JLabel("Segment:");
		labelSegment.setBounds(71, 242, 69, 25);
		panel.add(labelSegment);
		
		JLabel lblSegment = new JLabel("");
		lblSegment.setBounds(183, 242, 46, 25);
		lblSegment.setText(array1.get(key).segment);
		panel.add(lblSegment);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Interface2 frame = new Interface2(array1);
				frame.setVisible(true);
			}
		});
		btnBack.setBounds(33, 557, 89, 23);
		contentPane.add(btnBack);
		
		JButton btnHomepage = new JButton("Homepage");
		btnHomepage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Interface1 frame = new Interface1();
				frame.setVisible(true);
			}
		});
		btnHomepage.setBounds(460, 557, 96, 23);
		contentPane.add(btnHomepage);
		
		JLabel lblOtherUserAlso = new JLabel("Other user also look:");
		lblOtherUserAlso.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblOtherUserAlso.setBounds(210, 318, 186, 17);
		contentPane.add(lblOtherUserAlso);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(5, 340, 580, 210);
		contentPane.add(scrollPane);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane.setViewportView(scrollPane_1);
		
		JPanel panel_PC = new JPanel();
		scrollPane_1.setViewportView(panel_PC);
		panel_PC.setLayout(new GridLayout(1, 0, 10, 10));
		
		int n;
		if(array1.size() > 10)
			n = 10;
		else
			n = array1.size();
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent arg0) {
				
				while(m<n){
					JPanel panel2 = new JPanel();
					panel2.setBackground(Color.WHITE);
					panel2.setPreferredSize(new Dimension(162, 189));
					panel_PC.add(panel2);
					panel2.setLayout(null);
					
					//variable gmbr
					JLabel lblimg2 = new JLabel("");
					lblimg2.setBounds(0, 0, 162, 88);
					panel2.add(lblimg2);
					
					JLabel lblkey2 = new JLabel("");
					lblkey2.setBounds(0, 0, 0, 0);
					lblkey2.setText(""+m);
					panel2.add(lblkey2);
					
					//variable brand
					JLabel lblBrand2 = new JLabel("");
					lblBrand2.setBounds(2, 97, 160, 22);
					lblBrand2.setText(array1.get(m).branddata +" "+ array1.get(m).modeldata +" "+ array1.get(m).extramodel);
					panel2.add(lblBrand2);
					
					JLabel labelOtr2 = new JLabel("OTR Price:");
					labelOtr2.setFont(new Font("Tahoma", Font.BOLD, 11));
					labelOtr2.setBounds(5, 120, 68, 22);
					panel2.add(labelOtr2);
					
					JLabel labelRM2 = new JLabel("RM");
					labelRM2.setBounds(70, 120, 24, 22);
					panel2.add(labelRM2);
					
					//variable otr price
					JLabel lblOtr2 = new JLabel("");
					lblOtr2.setBounds(94, 120, 68, 22);
					lblOtr2.setText(""+array1.get(m).otrcsv);
					panel2.add(lblOtr2);
					
					JLabel labelMIns2 = new JLabel("Monthly Instalment");
					labelMIns2.setFont(new Font("Tahoma", Font.BOLD, 11));
					labelMIns2.setBounds(5, 142, 126, 22);
					panel2.add(labelMIns2);
					
					JLabel lblRm2 = new JLabel("RM");
					lblRm2.setBounds(5, 164, 24, 22);
					panel2.add(lblRm2);
					
					//variable monthly installment
					JLabel lblMIns2 = new JLabel("");
					lblMIns2.setBounds(27, 164, 57, 22);
					lblMIns2.setText(""+array1.get(m).mInscsv);
					panel2.add(lblMIns2);
					
					panel2.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent arg0) {
							String ke = lblkey2.getText();
							int key = Integer.parseInt(ke);
							System.out.println(key);
							Interface3 frame = new Interface3(array1, key);
							frame.setVisible(true);
						}
					});
					m++;
				}
				
			}
		});
		
	}
}
