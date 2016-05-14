package asdfg;
import java.util.ArrayList;
import java.util.Arrays;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.border.LineBorder;

import java.awt.Color;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;

import javax.swing.SwingConstants;

import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.awt.SystemColor;


public class Interface2 extends JFrame {

	private JPanel contentPane;

	int i = 0;

	/*private String branddata;
	private String modeldata;
	private String extramodel;
	private String geartype;
	private double cccsv;
	private int gearno;
	private double otrcsv;
	private double mInscsv;
	private String segment;
	private int airbagcsv;
	private int seatcsv;
	private int doorcs;
	private double distance;*/
	car cr[] = new car[0];
	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface2 frame = new Interface2();
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
	public Interface2(ArrayList<car> array1) {
		setTitle("CAR RECOMMENDER SYSTEM");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 606, 630);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(100, 149, 237));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(5, 35, 580, 515);
		contentPane.add(scrollPane);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane.setViewportView(scrollPane_1);
		
		JLabel label = new JLabel("List of car");
		label.setBounds(265, 11, 67, 17);
		contentPane.add(label);
		label.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(240, 240, 240));
		scrollPane_1.setViewportView(panel);

		int size,j;
		double z;
		if(array1.size() > 45){
			panel.setLayout(new GridLayout(15, 3, 10, 10));
			size = 45;
		}
		else{
			size = array1.size();
			z = size % 3;
			if(z == 0)
				j = size / 3;
			else
				j = size / 3 + 1;
			panel.setLayout(new GridLayout(j, 3, 10, 10));
			System.out.println("Grid size:"+j);
		}
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent arg0) {
				//carResult cr = new carResult();
				
			//Euclidean3 eu = new Euclidean3();
			
			//System.out.println("Length array: " + eu.cr.length);
				//Arrays.sort(array1);
				System.out.println(array1.size());
				for(int j = 0;j<array1.size();j++){
					System.out.println(j+")"+array1.get(j));
				}	
				
					
		while(i<size){
			JPanel panel1 = new JPanel();
			panel1.setBackground(Color.WHITE);
			panel1.setPreferredSize(new Dimension(162, 189));
			panel.add(panel1);
			panel1.setLayout(null);
			
			//variable gmbr
			JLabel lblimg1 = new JLabel("");
			lblimg1.setBounds(0, 0, 162, 88);
			panel1.add(lblimg1);
			
			JLabel lblkey = new JLabel("");
			lblkey.setBounds(0, 0, 0, 0);
			lblkey.setText(""+i);
			panel1.add(lblkey);
			
			//variable brand
			JLabel lblBrand1 = new JLabel("");
			lblBrand1.setBounds(2, 97, 160, 22);
			lblBrand1.setText(array1.get(i).branddata +" "+ array1.get(i).modeldata +" "+ array1.get(i).extramodel);
			panel1.add(lblBrand1);
			
			//variable model
			/*JLabel lblModel1 = new JLabel("");
			lblModel1.setBounds(84, 97, 53, 22);
			lblModel1.setText(array1.get(i).modeldata +" "+ array1.get(i).extramodel);
			panel1.add(lblModel1);*/
			
			//variable extra model
			/*JLabel lblXModel = new JLabel("");
			lblXModel.setBounds(138, 97, 24, 22);
			lblXModel.setText(array1.get(i).extramodel);
			panel1.add(lblXModel);*/
			
			JLabel labelOtr1 = new JLabel("OTR Price:");
			labelOtr1.setFont(new Font("Tahoma", Font.BOLD, 11));
			labelOtr1.setBounds(5, 120, 68, 22);
			panel1.add(labelOtr1);
			
			JLabel labelRM1 = new JLabel("RM");
			labelRM1.setBounds(70, 120, 24, 22);
			panel1.add(labelRM1);
			
			//variable otr price
			JLabel lblOtr1 = new JLabel("");
			lblOtr1.setBounds(94, 120, 68, 22);
			lblOtr1.setText(""+array1.get(i).otrcsv);
			panel1.add(lblOtr1);
			
			JLabel labelMIns1 = new JLabel("Monthly Instalment");
			labelMIns1.setFont(new Font("Tahoma", Font.BOLD, 11));
			labelMIns1.setBounds(5, 142, 126, 22);
			panel1.add(labelMIns1);
			
			JLabel lblRm1 = new JLabel("RM");
			lblRm1.setBounds(5, 164, 24, 22);
			panel1.add(lblRm1);
			
			//variable monthly installment
			JLabel lblMIns1 = new JLabel("");
			lblMIns1.setBounds(27, 164, 57, 22);
			lblMIns1.setText(""+array1.get(i).mInscsv);
			panel1.add(lblMIns1);
			
			panel1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					String ke = lblkey.getText();
					int key = Integer.parseInt(ke);
					//String model = lblModel1.getText();
					//String xmodel = lblXModel.getText();
					//car index = array1.get(i);
					System.out.println(key);
					Interface3 frame = new Interface3(array1, key);
					frame.setVisible(true);
				}
			});
			
			i++;
		}
				
			}
		});
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(39, 557, 67, 23);
		contentPane.add(btnBack);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Interface1 frame = new Interface1();
				frame.setVisible(true);
			}
		});
	}
	
	/*public Interface2(String branddata, String modeldata, String extramodel, double cccsv, String geartype, int gearno, double otrcsv, double mInscsv, String segment, int airbagcsv, int seatcsv, int doorcsv, double distance){
		this.branddata = branddata;
		this.modeldata = modeldata;
		this.extramodel = extramodel;
		this.cccsv = cccsv;
		this.geartype = geartype;
		this.gearno = gearno;
		this.otrcsv = otrcsv;
		this.mInscsv = mInscsv;
		this.segment = segment;
		this.airbagcsv = airbagcsv;
		this.seatcsv = seatcsv;
		this.doorcsv = doorcsv;
		this.distance = distance;
	}
	
	public void setBranddata(String branddata){ this.branddata = branddata; }
	public void setModeldata(String modeldata){ this.modeldata = modeldata; }
	public void setExtramodel(String extramodel){ this.extramodel = extramodel; }
	public void setCccsv(double cccsv){ this.cccsv = cccsv; }	
	public void setGeartype(String geartype){ this.geartype = geartype; }
	public void setGearno(int gearno){ this.gearno = gearno; }
	public void setOtrcsv(double otrcsv){ this.otrcsv = otrcsv; }
	public void setMInscsv(double mInscsv){ this.mInscsv = mInscsv; }
	public void setSegment(String segment){ this.segment = segment; }
	public void setAirbagcsv(int airbagcsv){ this.airbagcsv = airbagcsv; }
	public void setSeatcsv(int seatcsv){ this.seatcsv = seatcsv; }
	public void setDoorcsv(int doorcsv){ this.doorcsv = doorcsv; }
	public void setDistance(double distance){ this.distance = distance; }
	
	public String getBranddata() { return branddata; }
	public String getModeldata() { return modeldata; }
	public String getExtramodel() { return extramodel; }
	public double getCccsv() { return cccsv; }
	public String getGeartype() { return geartype; }
	public int getGearno() { return gearno; }
	public double getOtrcsv() { return otrcsv; }
	public double getMInscsv() { return mInscsv; }
	public String getSegment() { return segment; }
	public int getAirbagcsv() { return airbagcsv; }
	public int getSeatcsv() { return seatcsv; }
	public int getDoorcsv() { return doorcsv; }
	public double getDistance() { return distance; }*/
	
}
