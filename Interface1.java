package asdfg;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;

import java.awt.SystemColor;
import java.util.ArrayList;


public class Interface1 extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldSalary;
	String salary;
	String cc;
	String geartype;
	String seat;
	String door;
	String airbag;
	static ArrayList<car> array1;
	static Interface1 frame;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new Interface1();
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
	public Interface1() {
		setBackground(Color.LIGHT_GRAY);
		setTitle("CAR RECOMMENDER SYSTEM");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 606, 630);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(100, 149, 237));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setBounds(0, 0, 590, 109);
		label.setIcon(new ImageIcon("C:\\Users\\Faiz\\Pictures\\Banner2.png"));
		contentPane.add(label);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(5, 109, 580, 444);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel labelSalary = new JLabel("Salary: RM");
		labelSalary.setFont(new Font("Tahoma", Font.BOLD, 11));
		labelSalary.setBounds(209, 50, 72, 25);
		panel.add(labelSalary);
		
		textFieldSalary = new JTextField();
		textFieldSalary.setBounds(285, 50, 72, 25);
		panel.add(textFieldSalary);
		textFieldSalary.setColumns(10);
		
		JButton button1 = new JButton("");
		button1.setToolTipText("Add Car Feature");
		button1.setIcon(new ImageIcon("C:\\Users\\Faiz\\Pictures\\plus3.png"));
		button1.setBounds(129, 109, 25, 25);
		panel.add(button1);
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JComboBox comboBox1 = new JComboBox();
				comboBox1.setModel(new DefaultComboBoxModel(new String[] {"Please Choose", "CC", "Gear Type", "Seat", "Door", "Air Bag"}));
				comboBox1.setBounds(183, 109, 105, 25);
				panel.add(comboBox1);
				
				comboBox1.setSelectedItem(null);
				comboBox1.addItemListener(new ItemListener() {
					public void itemStateChanged(ItemEvent arg0) {
						Object item = comboBox1.getSelectedItem();
		                JComboBox comboFeatureBox1 = new JComboBox();
		                comboFeatureBox1.setBounds(323, 109, 105, 25);
	            		panel.add(comboFeatureBox1);
	            		
	            		JButton button2 = new JButton("");
		        		button2.setToolTipText("Add Car Feature");
		        		button2.setIcon(new ImageIcon("C:\\Users\\Faiz\\Pictures\\plus3.png"));
		        		button2.setBounds(129, 159, 25, 25);
		        		panel.add(button2);
	            		
		                comboFeatureBox1.setVisible(false);
		                if ("CC".equals(item)){
		                	cc = "1.0";
		            		comboFeatureBox1.setModel(new DefaultComboBoxModel(new String[] {"1.0", "1.1", "1.3", "1.4", "1.5", "1.6", "1.8", "2.0", "2.2", "2.4", "2.5", "2.7", "3.0", "3.2", "3.5", "3.7", "3.8", "4.0", "4.4", "5.2", "5.5"}));
		            		comboFeatureBox1.addItemListener(new ItemListener() {
		    					public void itemStateChanged(ItemEvent arg0) {
		    						cc = comboFeatureBox1.getSelectedItem().toString();	
		    						System.out.println("Combo cc:"+cc);
		    					}
		            		});
		            		System.out.println("Combo cc:"+cc);
		            		comboFeatureBox1.setVisible(true);   
		                }
		                else if ("Gear Type".equals(item)){
		                	geartype="Automatic";
		                	comboFeatureBox1.setModel(new DefaultComboBoxModel(new String[] {"Automatic", "Manual", "CVT", "DSG"}));
		            		comboFeatureBox1.addItemListener(new ItemListener() {
		    					public void itemStateChanged(ItemEvent arg0) {
		    						geartype = comboFeatureBox1.getSelectedItem().toString();
		    						System.out.println("Combo gear type:"+geartype);
		    					}
		            		});
		            		System.out.println("Combo gear type:"+geartype);
		                    comboFeatureBox1.setVisible(true);
		                    
		                }
		                else if ("Seat".equals(item)){
		                	seat="2";
		            		comboFeatureBox1.setModel(new DefaultComboBoxModel(new String[] {"2", "4", "5", "7", "8", "11"}));
		            		comboFeatureBox1.addItemListener(new ItemListener() {
		    					public void itemStateChanged(ItemEvent arg0) {
		    						seat = comboFeatureBox1.getSelectedItem().toString();
		    						System.out.println("Combo seat:"+seat);
		    					}
		            		});
		            		System.out.println("Combo seat:"+seat);
		            		comboFeatureBox1.setVisible(true);
		                }
		                else if ("Door".equals(item)){
		                	door="4";
		            		comboFeatureBox1.setModel(new DefaultComboBoxModel(new String[] {"4", "2", "3", "5"}));
		            		comboFeatureBox1.addItemListener(new ItemListener() {
		    					public void itemStateChanged(ItemEvent arg0) {
		    						door = comboFeatureBox1.getSelectedItem().toString();
		    						System.out.println("Combo seat:"+door);
		    					}
		            		});
		            		System.out.println("Combo door:"+door);
		            		comboFeatureBox1.setVisible(true);
		                }
		                else if ("Air Bag".equals(item)){
		                	airbag="2";
		            		comboFeatureBox1.setModel(new DefaultComboBoxModel(new String[] {"2", "1", "3", "4", "6", "7", "8", "10", "11"}));
		            		comboFeatureBox1.addItemListener(new ItemListener() {
		    					public void itemStateChanged(ItemEvent arg0) {
		    						airbag = comboFeatureBox1.getSelectedItem().toString();
		    						System.out.println("Combo airbag:"+airbag);
		    					}
		            		});
		            		System.out.println("Combo airbag:"+airbag);
		            		comboFeatureBox1.setVisible(true);
		                }
		                
		        		button2.addActionListener(new ActionListener() {
		        			public void actionPerformed(ActionEvent arg0) {
		        				JComboBox comboBox2 = new JComboBox();
		        				comboBox2.setModel(new DefaultComboBoxModel(new String[] {"Please Choose", "CC", "Gear Type", "Seat", "Door", "Air Bag"}));
		        				comboBox2.setBounds(183, 159, 105, 25);
		        				panel.add(comboBox2);
		        				
		        				comboBox2.setSelectedItem(null);
		        				comboBox2.addItemListener(new ItemListener() {
		        					public void itemStateChanged(ItemEvent arg0) {
		        						Object item = comboBox2.getSelectedItem();
		        		                JComboBox comboFeatureBox2 = new JComboBox();
		        		                comboFeatureBox2.setBounds(323, 159, 105, 25);
		        	    				panel.add(comboFeatureBox2);
		        	    				
		        	    				JButton button3 = new JButton("");
		        		        		button3.setToolTipText("Add Car Feature");
		        		        		button3.setIcon(new ImageIcon("C:\\Users\\Faiz\\Pictures\\plus3.png"));
		        		        		button3.setBounds(129, 209, 25, 25);
		        		        		panel.add(button3);
		        	    				
		        		                comboFeatureBox2.setVisible(false);
		        		                if ("CC".equals(item)){
		        		                	cc = "1.0";
		        		            		comboFeatureBox2.setModel(new DefaultComboBoxModel(new String[] {"1.0", "1.1", "1.3", "1.4", "1.5", "1.6", "1.8", "2.0", "2.2", "2.4", "2.5", "2.7", "3.0", "3.2", "3.5", "3.7", "3.8", "4.0", "4.4", "5.2", "5.5"}));
		        		            		comboFeatureBox2.addItemListener(new ItemListener() {
		        		    					public void itemStateChanged(ItemEvent arg0) {
		        		    						cc = comboFeatureBox2.getSelectedItem().toString();	
		        		    						System.out.println("Combo cc:"+cc);
		        		    					}
		        		            		});
		        		            		System.out.println("Combo cc:"+cc);
		        		            		comboFeatureBox2.setVisible(true);   
		        		                }
		        		                else if ("Gear Type".equals(item)){
		        		                	geartype="Automatic";
		        		                	comboFeatureBox2.setModel(new DefaultComboBoxModel(new String[] {"Automatic", "Manual", "CVT", "DSG"}));
		        		            		comboFeatureBox2.addItemListener(new ItemListener() {
		        		    					public void itemStateChanged(ItemEvent arg0) {
		        		    						geartype = comboFeatureBox2.getSelectedItem().toString();
		        		    						System.out.println("Combo gear type:"+geartype);
		        		    					}
		        		            		});
		        		            		System.out.println("Combo gear type:"+geartype);
		        		                    comboFeatureBox2.setVisible(true);
		        		                    
		        		                }
		        		                else if ("Seat".equals(item)){
		        		                	seat="2";
		        		            		comboFeatureBox2.setModel(new DefaultComboBoxModel(new String[] {"2", "4", "5", "7", "8", "11"}));
		        		            		comboFeatureBox2.addItemListener(new ItemListener() {
		        		    					public void itemStateChanged(ItemEvent arg0) {
		        		    						seat = comboFeatureBox2.getSelectedItem().toString();
		        		    						System.out.println("Combo seat:"+seat);
		        		    					}
		        		            		});
		        		            		System.out.println("Combo seat:"+seat);
		        		            		comboFeatureBox2.setVisible(true);
		        		                }
		        		                else if ("Door".equals(item)){
		        		                	door="4";
		        		            		comboFeatureBox2.setModel(new DefaultComboBoxModel(new String[] {"4", "2", "3", "5"}));
		        		            		comboFeatureBox2.addItemListener(new ItemListener() {
		        		    					public void itemStateChanged(ItemEvent arg0) {
		        		    						door = comboFeatureBox2.getSelectedItem().toString();
		        		    						System.out.println("Combo seat:"+door);
		        		    					}
		        		            		});
		        		            		System.out.println("Combo door:"+door);
		        		            		comboFeatureBox2.setVisible(true);
		        		                }
		        		                else if ("Air Bag".equals(item)){
		        		                	airbag="2";
		        		            		comboFeatureBox2.setModel(new DefaultComboBoxModel(new String[] {"2", "1", "3", "4", "6", "7", "8", "10", "11"}));
		        		            		comboFeatureBox2.addItemListener(new ItemListener() {
		        		    					public void itemStateChanged(ItemEvent arg0) {
		        		    						airbag = comboFeatureBox2.getSelectedItem().toString();
		        		    						System.out.println("Combo airbag:"+airbag);
		        		    					}
		        		            		});
		        		            		System.out.println("Combo airbag:"+airbag);
		        		            		comboFeatureBox2.setVisible(true);
		        		                }
		        		                
		        		        		button3.addActionListener(new ActionListener() {
		        		        			public void actionPerformed(ActionEvent arg0) {
		        		        				JComboBox comboBox3 = new JComboBox();
		        		        				comboBox3.setModel(new DefaultComboBoxModel(new String[] {"Please Choose", "CC", "Gear Type", "Seat", "Door", "Air Bag"}));
		        		        				comboBox3.setBounds(183, 209, 105, 25);
		        		        				panel.add(comboBox3);
		        		        				
		        		        				comboBox3.setSelectedItem(null);
		        		        				comboBox3.addItemListener(new ItemListener() {
		        		        					public void itemStateChanged(ItemEvent arg0) {
		        		        						Object item = comboBox3.getSelectedItem();
		        		        		                JComboBox comboFeatureBox3 = new JComboBox();
		        		        		                comboFeatureBox3.setBounds(323, 209, 105, 25);
		        		        	            		panel.add(comboFeatureBox3);
		        		        	            		
		        		        	            		JButton button4 = new JButton("");
		        		        		        		button4.setToolTipText("Add Car Feature");
		        		        		        		button4.setIcon(new ImageIcon("C:\\Users\\Faiz\\Pictures\\plus3.png"));
		        		        		        		button4.setBounds(129, 259, 25, 25);
		        		        		        		panel.add(button4);
		        		        	            		
		        		        		                comboFeatureBox3.setVisible(false);
		        		        		                if ("CC".equals(item)){
		        		        		                	cc = "1.0";
		        		        		            		comboFeatureBox3.setModel(new DefaultComboBoxModel(new String[] {"1.0", "1.1", "1.3", "1.4", "1.5", "1.6", "1.8", "2.0", "2.2", "2.4", "2.5", "2.7", "3.0", "3.2", "3.5", "3.7", "3.8", "4.0", "4.4", "5.2", "5.5"}));
		        		        		            		comboFeatureBox3.addItemListener(new ItemListener() {
		        		        		    					public void itemStateChanged(ItemEvent arg0) {
		        		        		    						cc = comboFeatureBox3.getSelectedItem().toString();	
		        		        		    						System.out.println("Combo cc:"+cc);
		        		        		    					}
		        		        		            		});
		        		        		            		System.out.println("Combo cc:"+cc);
		        		        		            		comboFeatureBox3.setVisible(true);   
		        		        		                }
		        		        		                else if ("Gear Type".equals(item)){
		        		        		                	geartype="Automatic";
		        		        		                	comboFeatureBox3.setModel(new DefaultComboBoxModel(new String[] {"Automatic", "Manual", "CVT", "DSG"}));
		        		        		            		comboFeatureBox3.addItemListener(new ItemListener() {
		        		        		    					public void itemStateChanged(ItemEvent arg0) {
		        		        		    						geartype = comboFeatureBox3.getSelectedItem().toString();
		        		        		    						System.out.println("Combo gear type:"+geartype);
		        		        		    					}
		        		        		            		});
		        		        		            		System.out.println("Combo gear type:"+geartype);
		        		        		                    comboFeatureBox3.setVisible(true);
		        		        		                    
		        		        		                }
		        		        		                else if ("Seat".equals(item)){
		        		        		                	seat="2";
		        		        		            		comboFeatureBox3.setModel(new DefaultComboBoxModel(new String[] {"2", "4", "5", "7", "8", "11"}));
		        		        		            		comboFeatureBox3.addItemListener(new ItemListener() {
		        		        		    					public void itemStateChanged(ItemEvent arg0) {
		        		        		    						seat = comboFeatureBox3.getSelectedItem().toString();
		        		        		    						System.out.println("Combo seat:"+seat);
		        		        		    					}
		        		        		            		});
		        		        		            		System.out.println("Combo seat:"+seat);
		        		        		            		comboFeatureBox3.setVisible(true);
		        		        		                }
		        		        		                else if ("Door".equals(item)){
		        		        		                	door="4";
		        		        		            		comboFeatureBox3.setModel(new DefaultComboBoxModel(new String[] {"4", "2", "3", "5"}));
		        		        		            		comboFeatureBox3.addItemListener(new ItemListener() {
		        		        		    					public void itemStateChanged(ItemEvent arg0) {
		        		        		    						door = comboFeatureBox3.getSelectedItem().toString();
		        		        		    						System.out.println("Combo seat:"+door);
		        		        		    					}
		        		        		            		});
		        		        		            		System.out.println("Combo door:"+door);
		        		        		            		comboFeatureBox3.setVisible(true);
		        		        		                }
		        		        		                else if ("Air Bag".equals(item)){
		        		        		                	airbag="2";
		        		        		            		comboFeatureBox3.setModel(new DefaultComboBoxModel(new String[] {"2", "1", "3", "4", "6", "7", "8", "10", "11"}));
		        		        		            		comboFeatureBox3.addItemListener(new ItemListener() {
		        		        		    					public void itemStateChanged(ItemEvent arg0) {
		        		        		    						airbag = comboFeatureBox3.getSelectedItem().toString();
		        		        		    						System.out.println("Combo airbag:"+airbag);
		        		        		    					}
		        		        		            		});
		        		        		            		System.out.println("Combo airbag:"+airbag);
		        		        		            		comboFeatureBox3.setVisible(true);
		        		        		                }
		        		        		                
		        		        		        		button4.addActionListener(new ActionListener() {
		        		        		        			public void actionPerformed(ActionEvent arg0) {
		        		        		        				JComboBox comboBox4 = new JComboBox();
		        		        		        				comboBox4.setModel(new DefaultComboBoxModel(new String[] {"Please Choose", "CC", "Gear Type", "Seat", "Door", "Air Bag"}));
		        		        		        				comboBox4.setBounds(183, 259, 105, 25);
		        		        		        				panel.add(comboBox4);
		        		        		        				
		        		        		        				comboBox4.setSelectedItem(null);
		        		        		        				comboBox4.addItemListener(new ItemListener() {
		        		        		        					public void itemStateChanged(ItemEvent arg0) {
		        		        		        						Object item = comboBox4.getSelectedItem();
		        		        		        		                JComboBox comboFeatureBox4 = new JComboBox();
		        		        		        		                comboFeatureBox4.setBounds(323, 259, 105, 25);
		        		        		        	            		panel.add(comboFeatureBox4);
		        		        		        	            		
		        		        		        	            		JButton button5 = new JButton("");
		        		        		        	            		button5.setToolTipText("Add Car Feature");
		        		        		        	            		button5.setIcon(new ImageIcon("C:\\Users\\Faiz\\Pictures\\plus3.png"));
		        		        		        	            		button5.setBounds(129, 309, 25, 25);
		        		        		        	            		panel.add(button5);
		        		        		        	            		
		        		        		        		                comboFeatureBox4.setVisible(false);
		        		        		        		                if ("CC".equals(item)){
		        		        		        		                	cc = "1.0";
		        		        		        		            		comboFeatureBox4.setModel(new DefaultComboBoxModel(new String[] {"1.0", "1.1", "1.3", "1.4", "1.5", "1.6", "1.8", "2.0", "2.2", "2.4", "2.5", "2.7", "3.0", "3.2", "3.5", "3.7", "3.8", "4.0", "4.4", "5.2", "5.5"}));
		        		        		        		            		comboFeatureBox4.addItemListener(new ItemListener() {
		        		        		        		    					public void itemStateChanged(ItemEvent arg0) {
		        		        		        		    						cc = comboFeatureBox4.getSelectedItem().toString();	
		        		        		        		    						System.out.println("Combo cc:"+cc);
		        		        		        		    					}
		        		        		        		            		});
		        		        		        		            		System.out.println("Combo cc:"+cc);
		        		        		        		            		comboFeatureBox4.setVisible(true);   
		        		        		        		                }
		        		        		        		                else if ("Gear Type".equals(item)){
		        		        		        		                	geartype="Automatic";
		        		        		        		                	comboFeatureBox4.setModel(new DefaultComboBoxModel(new String[] {"Automatic", "Manual", "CVT", "DSG"}));
		        		        		        		            		comboFeatureBox4.addItemListener(new ItemListener() {
		        		        		        		    					public void itemStateChanged(ItemEvent arg0) {
		        		        		        		    						geartype = comboFeatureBox4.getSelectedItem().toString();
		        		        		        		    						System.out.println("Combo gear type:"+geartype);
		        		        		        		    					}
		        		        		        		            		});
		        		        		        		            		System.out.println("Combo gear type:"+geartype);
		        		        		        		                    comboFeatureBox4.setVisible(true);
		        		        		        		                    
		        		        		        		                }
		        		        		        		                else if ("Seat".equals(item)){
		        		        		        		                	seat="2";
		        		        		        		            		comboFeatureBox4.setModel(new DefaultComboBoxModel(new String[] {"2", "4", "5", "7", "8", "11"}));
		        		        		        		            		comboFeatureBox4.addItemListener(new ItemListener() {
		        		        		        		    					public void itemStateChanged(ItemEvent arg0) {
		        		        		        		    						seat = comboFeatureBox4.getSelectedItem().toString();
		        		        		        		    						System.out.println("Combo seat:"+seat);
		        		        		        		    					}
		        		        		        		            		});
		        		        		        		            		System.out.println("Combo seat:"+seat);
		        		        		        		            		comboFeatureBox4.setVisible(true);
		        		        		        		                }
		        		        		        		                else if ("Door".equals(item)){
		        		        		        		                	door="4";
		        		        		        		            		comboFeatureBox4.setModel(new DefaultComboBoxModel(new String[] {"4", "2", "3", "5"}));
		        		        		        		            		comboFeatureBox4.addItemListener(new ItemListener() {
		        		        		        		    					public void itemStateChanged(ItemEvent arg0) {
		        		        		        		    						door = comboFeatureBox4.getSelectedItem().toString();
		        		        		        		    						System.out.println("Combo seat:"+door);
		        		        		        		    					}
		        		        		        		            		});
		        		        		        		            		System.out.println("Combo door:"+door);
		        		        		        		            		comboFeatureBox4.setVisible(true);
		        		        		        		                }
		        		        		        		                else if ("Air Bag".equals(item)){
		        		        		        		                	airbag="2";
		        		        		        		            		comboFeatureBox4.setModel(new DefaultComboBoxModel(new String[] {"2", "1", "3", "4", "6", "7", "8", "10", "11"}));
		        		        		        		            		comboFeatureBox4.addItemListener(new ItemListener() {
		        		        		        		    					public void itemStateChanged(ItemEvent arg0) {
		        		        		        		    						airbag = comboFeatureBox4.getSelectedItem().toString();
		        		        		        		    						System.out.println("Combo airbag:"+airbag);
		        		        		        		    					}
		        		        		        		            		});
		        		        		        		            		System.out.println("Combo airbag:"+airbag);
		        		        		        		            		comboFeatureBox4.setVisible(true);
		        		        		        		                }
		        		        		        		                button5.setVisible(true);
		        		        		        		        		button5.addActionListener(new ActionListener() {
		        		        		        		        			public void actionPerformed(ActionEvent arg0) {
		        		        		        		        				JComboBox comboBox5 = new JComboBox();
		        		        		        		        				comboBox5.setModel(new DefaultComboBoxModel(new String[] {"Please Choose", "CC", "Gear Type", "Seat", "Door", "Air Bag"}));
		        		        		        		        				comboBox5.setBounds(183, 309, 105, 25);
		        		        		        		        				panel.add(comboBox5);
		        		        		        		        				
		        		        		        		        				comboBox5.setSelectedItem(null);
		        		        		        		        				comboBox5.addItemListener(new ItemListener() {
		        		        		        		        					public void itemStateChanged(ItemEvent arg0) {
		        		        		        		        						Object item = comboBox5.getSelectedItem();
		        		        		        		        		                JComboBox comboFeatureBox5 = new JComboBox();
		        		        		        		        		                comboFeatureBox5.setBounds(323, 309, 105, 25);
		        		        		        		        	            		panel.add(comboFeatureBox5);
		        		        		        		        		                comboFeatureBox5.setVisible(false);
		        		        		        		        		                if ("CC".equals(item)){
		        		        		        		        		                	cc = "1.0";
		        		        		        		        		            		comboFeatureBox5.setModel(new DefaultComboBoxModel(new String[] {"1.0", "1.1", "1.3", "1.4", "1.5", "1.6", "1.8", "2.0", "2.2", "2.4", "2.5", "2.7", "3.0", "3.2", "3.5", "3.7", "3.8", "4.0", "4.4", "5.2", "5.5"}));
		        		        		        		        		            		comboFeatureBox5.addItemListener(new ItemListener() {
		        		        		        		        		    					public void itemStateChanged(ItemEvent arg0) {
		        		        		        		        		    						cc = comboFeatureBox5.getSelectedItem().toString();	
		        		        		        		        		    						System.out.println("Combo cc:"+cc);
		        		        		        		        		    					}
		        		        		        		        		            		});
		        		        		        		        		            		System.out.println("Combo cc:"+cc);
		        		        		        		        		            		comboFeatureBox5.setVisible(true);   
		        		        		        		        		                }
		        		        		        		        		                else if ("Gear Type".equals(item)){
		        		        		        		        		                	geartype="Automatic";
		        		        		        		        		                	comboFeatureBox5.setModel(new DefaultComboBoxModel(new String[] {"Automatic", "Manual", "CVT", "DSG"}));
		        		        		        		        		            		comboFeatureBox5.addItemListener(new ItemListener() {
		        		        		        		        		    					public void itemStateChanged(ItemEvent arg0) {
		        		        		        		        		    						geartype = comboFeatureBox5.getSelectedItem().toString();
		        		        		        		        		    						System.out.println("Combo gear type:"+geartype);
		        		        		        		        		    					}
		        		        		        		        		            		});
		        		        		        		        		            		System.out.println("Combo gear type:"+geartype);
		        		        		        		        		                    comboFeatureBox5.setVisible(true);
		        		        		        		        		                    
		        		        		        		        		                }
		        		        		        		        		                else if ("Seat".equals(item)){
		        		        		        		        		                	seat="2";
		        		        		        		        		            		comboFeatureBox5.setModel(new DefaultComboBoxModel(new String[] {"2", "4", "5", "7", "8", "11"}));
		        		        		        		        		            		comboFeatureBox5.addItemListener(new ItemListener() {
		        		        		        		        		    					public void itemStateChanged(ItemEvent arg0) {
		        		        		        		        		    						seat = comboFeatureBox5.getSelectedItem().toString();
		        		        		        		        		    						System.out.println("Combo seat:"+seat);
		        		        		        		        		    					}
		        		        		        		        		            		});
		        		        		        		        		            		System.out.println("Combo seat:"+seat);
		        		        		        		        		            		comboFeatureBox5.setVisible(true);
		        		        		        		        		                }
		        		        		        		        		                else if ("Door".equals(item)){
		        		        		        		        		                	door="4";
		        		        		        		        		            		comboFeatureBox5.setModel(new DefaultComboBoxModel(new String[] {"4", "2", "3", "5"}));
		        		        		        		        		            		comboFeatureBox5.addItemListener(new ItemListener() {
		        		        		        		        		    					public void itemStateChanged(ItemEvent arg0) {
		        		        		        		        		    						door = comboFeatureBox5.getSelectedItem().toString();
		        		        		        		        		    						System.out.println("Combo seat:"+door);
		        		        		        		        		    					}
		        		        		        		        		            		});
		        		        		        		        		            		System.out.println("Combo door:"+door);
		        		        		        		        		            		comboFeatureBox5.setVisible(true);
		        		        		        		        		                }
		        		        		        		        		                else if ("Air Bag".equals(item)){
		        		        		        		        		                	airbag="2";
		        		        		        		        		            		comboFeatureBox5.setModel(new DefaultComboBoxModel(new String[] {"2", "1", "3", "4", "6", "7", "8", "10", "11"}));
		        		        		        		        		            		comboFeatureBox5.addItemListener(new ItemListener() {
		        		        		        		        		    					public void itemStateChanged(ItemEvent arg0) {
		        		        		        		        		    						airbag = comboFeatureBox5.getSelectedItem().toString();
		        		        		        		        		    						System.out.println("Combo airbag:"+airbag);
		        		        		        		        		    					}
		        		        		        		        		            		});
		        		        		        		        		            		System.out.println("Combo airbag:"+airbag);
		        		        		        		        		            		comboFeatureBox5.setVisible(true);
		        		        		        		        		                }
		        		        		        		        		                
		        		        		        		        					}
		        		        		        		        				});
		        		        		        		        			}
		        		        		        		        		});
		        		        		        					}
		        		        		        				});
		        		        		        			}
		        		        		        		});

		        		        					}
		        		        				});
		        		        			}
		        		        		});
		        					}
		        				});
		        			}
		        		});
					}
				});
			}
		});
		
		JButton btnNext = new JButton("Next");
		btnNext.setBounds(489, 557, 63, 23);
		contentPane.add(btnNext);
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				salary = textFieldSalary.getText();
				
				/*System.out.println("before euclidean");
				System.out.println(salary);
				System.out.println(cc);
				System.out.println(geartype);
				System.out.println(seat);
				System.out.println(door);
				System.out.println(airbag);*/
				
				Euclidean cond = new Euclidean();
				array1 = cond.calc(salary, cc, geartype, seat, door, airbag);
				/*System.out.println(array1.size());
				for(int j = 0;j<array1.size();j++){
					System.out.println(j+")"+array1.get(j));
				}*/
				
				/*System.out.println("after euclidean");
				System.out.println(salary);
				System.out.println(cc);
				System.out.println(geartype);
				System.out.println(seat);
				System.out.println(door);
				System.out.println(airbag);*/
				
				Interface2 page2 = new Interface2(array1);
				page2.setVisible(true);
				frame.dispose();
				
			}
		});
		
		
		
	}
}
