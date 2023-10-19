package AwtandSwing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class HomePage {
	HomePage()	
	{
		JFrame F=new JFrame("Online Shopping");
		F.setTitle("Online Shopping");
		
		JLabel l=new JLabel("Welcome To DiyaMart");
		l.setBounds(300, 50, 300, 25);
		l.setFont(new Font("TimesNewRoman", Font.BOLD, 25));
		F.add(l);
		
		JLabel l1=new JLabel("DiyaMart offers stylish, high-quality products across Womenswear, Menswear, Kidswear and fashion accessories ");
		l1.setBounds(50, 100, 1000, 30);
	    l1.setFont(new Font("TimesNewRoman", Font.PLAIN, 16));
	    F.add(l1);
		
	    JLabel l2=new JLabel("through a diversified portfolio of own brands, national and international brands.");
		l2.setBounds(20, 130, 1000, 30);
	    l2.setFont(new Font("TimesNewRoman", Font.PLAIN, 16));
	    F.add(l2);
		 
	    JLabel l3=new JLabel("The uniqueness of the store is the core, which delivers \'fashion at great value' ");
		l3.setBounds(50, 170, 1000, 30);
	    l3.setFont(new Font("TimesNewRoman", Font.PLAIN, 16));
	    F.add(l3);
	    
	    JLabel l4=new JLabel("DiyaMart customer can access a large collection of fashionable, high quality products at great value delivered at their");
		l4.setBounds(50, 210, 1000, 30);
	    l4.setFont(new Font("TimesNewRoman", Font.PLAIN, 16));
	    F.add(l4);
	    
	    JLabel l5=new JLabel("door steps. To place your orders please click the buttons bellow.");
		l5.setBounds(20, 250, 1000, 30);
	    l5.setFont(new Font("TimesNewRoman", Font.PLAIN, 16));
	    F.add(l5);
	    
	    JLabel l6=new JLabel("If you are a new user, click the button and register for further details");
		l6.setBounds(50, 300, 1000, 30);
	    l6.setFont(new Font("TimesNewRoman", Font.PLAIN, 16));
	    F.add(l6);
	    
	    JLabel l9=new JLabel(new ImageIcon("C:/Users/hp/eclipse-workspace/OnlineDressOrdering/src/First.jpg"));
		l9.setBounds(550, 250, 290, 290);
	    l9.setFont(new Font("TimesNewRoman", Font.PLAIN, 16));
	    F.add(l9);
	    
	    Button b1= new Button("Register Here");
	    b1.setBounds(70, 350, 100, 40);
	    F.add(b1);
	    
	    b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			JFrame f=new JFrame("Registration Page");
			
			JLabel l=new JLabel("Registration Page");
			l.setBounds(300, 50, 250, 30);
			l.setFont(new Font("TimesNewRoman", Font.PLAIN, 20));
			f.add(l);
			
			JLabel l1=new JLabel("User Name:");
			l1.setBounds(50, 150, 100, 30);
		    l1.setFont(new Font("TimesNewRoman", Font.PLAIN, 16));
		    f.add(l1);
		    
		    JTextField tf1=new JTextField("");
			tf1.setBounds(160, 150, 160, 20);
		    tf1.setFont(new Font("TimesNewRoman", Font.PLAIN, 16));
		    f.add(tf1);
		    
		    
		    JLabel l2=new JLabel("D.O.B:");
			l2.setBounds(50, 200, 100, 30);
		    l2.setFont(new Font("TimesNewRoman", Font.PLAIN, 16));
		    f.add(l2);
		    
		    JTextField tf2=new JTextField("");
			tf2.setBounds(160, 200, 160, 20);
		    tf2.setFont(new Font("TimesNewRoman", Font.PLAIN, 16));
		    f.add(tf2);
			 
		    JLabel l3=new JLabel("Mobile No:");
			l3.setBounds(50, 250, 100, 30);
		    l3.setFont(new Font("TimesNewRoman", Font.PLAIN, 16));
		    f.add(l3);
		    
		    JTextField tf3=new JTextField("");
			tf3.setBounds(160, 250, 160, 20);
		    tf3.setFont(new Font("TimesNewRoman", Font.PLAIN, 16));
		    f.add(tf3);
		    
		    JLabel l4=new JLabel("Gender:");
			l4.setBounds(50, 300, 100, 30);
		    l4.setFont(new Font("TimesNewRoman", Font.PLAIN, 16));
		    f.add(l4);
		    
		    JRadioButton rb1=new JRadioButton("Male"); 
		    rb1.setBounds(160, 300, 100, 30);
		    rb1.setFont(new Font("TimesNewRoman", Font.PLAIN, 16));
		    JRadioButton rb2=new JRadioButton("Female"); 
			rb2.setBounds(290, 300, 100, 30);
		    rb2.setFont(new Font("TimesNewRoman", Font.PLAIN, 16));
		    JRadioButton rb3=new JRadioButton("Others"); 
			rb3.setBounds(420, 300, 100, 30);
		    rb3.setFont(new Font("TimesNewRoman", Font.PLAIN, 16));
		    ButtonGroup bp=new ButtonGroup();    
		    bp.add(rb1);bp.add(rb2);bp.add(rb3);    
		    f.add(rb1);f.add(rb2);f.add(rb3);   
		    
		    JLabel l5=new JLabel("E-Mail Id:");
			l5.setBounds(50, 350, 100, 30);
		    l5.setFont(new Font("TimesNewRoman", Font.PLAIN, 16));
		    f.add(l5);
		    
		    JTextField tf4=new JTextField("");
			tf4.setBounds(160, 350, 160, 20);
		    tf4.setFont(new Font("TimesNewRoman", Font.PLAIN, 16));
		    f.add(tf4);
		    
		    JPasswordField value  = new JPasswordField();   
		    JLabel l6=new JLabel("Password:");   
		    l6.setBounds(50, 400, 100, 30);
		    l6.setFont(new Font("TimesNewRoman", Font.PLAIN, 16));
		    f.add(l6);
		    
		    JTextField tf5=new JTextField("");
			tf5.setBounds(160, 400, 160, 20);
			tf5.setFont(new Font("TimesNewRoman", Font.PLAIN, 16));
		    f.add(tf5);
		    
		    JLabel l7=new JLabel(new ImageIcon("C:/Users/hp/eclipse-workspace/OnlineDressOrdering/src/chudi5.jpg"));
			l7.setBounds(550, 200, 200, 295);
		    l7.setFont(new Font("TimesNewRoman", Font.PLAIN, 16));
		    f.add(l7);
		    
		    JButton bt1= new JButton("Cancel");
		    bt1.setBounds(70, 500, 100, 40);
		    f.add(bt1);
		    bt1.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
				f.dispose();	
					}
	                    }
		                      );
		    
		    JButton bt2= new JButton("Register");
		    bt2.setBounds(200, 500, 100, 40);
		    f.add(bt2);
		    bt2.addActionListener(new ActionListener() {
	            @Override
				public void actionPerformed(ActionEvent e) {
					JFrame fr=new JFrame("Welcome");
					
				    JLabel l1=new JLabel("Welcome, " +tf1.getText());
				    l1.setBounds(40, 100, 300, 30);
				    
                    JLabel l3=new JLabel("Your Registration is successful!");
				    l3.setBounds(40, 130, 300, 30);
				    
				    JButton B= new JButton("OK");
				    B.setBounds(70, 200, 100, 40);
				    fr.add(B);
				    B.addActionListener(new ActionListener() {
	                @Override
				    public void actionPerformed(ActionEvent e) {
				    fr.dispose();	
				    f.dispose();	
						}
				           }
				                 );
				   
				    fr.add(l1);
					fr.add(l3);
					fr.add(B);
					
					fr.setSize(300, 300);
					fr.setLayout(null);
					fr.setVisible(true);
					
					fr.setLayout(new BorderLayout());
					JLabel bg = new JLabel(new ImageIcon("C:/Users/hp/eclipse-workspace/OnlineDressOrdering/src/img3.jpg"));
					fr.add(bg);
					fr.setSize(299, 299);       
	            }    
	        }); 
					
		   		
		    f.setSize(900, 700);
			f.setLayout(null);
			f.setVisible(true);
			
			f.setLayout(new BorderLayout());
			JLabel bg = new JLabel(new ImageIcon("C:/Users/hp/eclipse-workspace/OnlineDressOrdering/src/img2.jpg"));
			f.add(bg);
			f.setSize(899, 699);
			
			f.addWindowListener (new WindowAdapter() {
				public void windowClosing (WindowEvent e) { 
					f.dispose();
				}
			});
			  
		}
	    	
	    }
	    		);
	    
	    
	    JLabel l7=new JLabel("If you already registered, please Login");
		l7.setBounds(50, 400, 1000, 30);
	    l7.setFont(new Font("TimesNewRoman", Font.PLAIN, 16));
	    F.add(l7);
	    
	    JButton b2= new JButton("LogIn Here");
	    b2.setBounds(70, 450, 100, 40);
	    F.add(b2);
	    
	    b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			JFrame Fm=new JFrame("LogIn Page");
			JLabel l=new JLabel("LogIn Page");
			l.setBounds(300, 50, 250, 30);
			l.setFont(new Font("TimesNewRoman", Font.PLAIN, 20));
			Fm.add(l);
			
			JLabel l1=new JLabel("User Name:");
			l1.setBounds(50, 150, 100, 30);
		    l1.setFont(new Font("TimesNewRoman", Font.PLAIN, 16));
		    Fm.add(l1);
		    
		    JTextField t1=new JTextField("");
			t1.setBounds(160, 150, 160, 20);
		    t1.setFont(new Font("TimesNewRoman", Font.PLAIN, 16));
		    Fm.add(t1);
			
		    JLabel l2=new JLabel("E-Mail Id:");
			l2.setBounds(50, 200, 100, 30);
		    l2.setFont(new Font("TimesNewRoman", Font.PLAIN, 16));
		    Fm.add(l2);
		    
		    JTextField t2=new JTextField("");
			t2.setBounds(160, 200, 160, 20);
		    t2.setFont(new Font("TimesNewRoman", Font.PLAIN, 16));
		    Fm.add(t2);
		       
		    JPasswordField value  = new JPasswordField();   
		    JLabel l3=new JLabel("Password:");   
		    l3.setBounds(50, 250, 100, 30);
		    l3.setFont(new Font("TimesNewRoman", Font.PLAIN, 16));
		    Fm.add(l3);
		    
		    JTextField t3=new JTextField("");
			t3.setBounds(160, 250, 160, 20);
		    t3.setFont(new Font("TimesNewRoman", Font.PLAIN, 16));
		    Fm.add(t3);
		    
		    JTextField t4=new JTextField("");
			t4.setBounds(160, 250, 160, 20);
		    t4.setFont(new Font("TimesNewRoman", Font.PLAIN, 16));
		    Fm.add(t4);
		    
		    
		    JLabel l4=new JLabel(new ImageIcon("C:/Users/hp/eclipse-workspace/OnlineDressOrdering/src/chudi5.jpg"));
			l4.setBounds(400, 150, 200, 295);
		    l4.setFont(new Font("TimesNewRoman", Font.PLAIN, 16));
		    Fm.add(l4);
		  
		    JButton bt1= new JButton("Cancel");
		    bt1.setBounds(70, 350, 100, 40);
		    Fm.add(bt1);
		    bt1.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
				Fm.dispose();	
					
				}
		    	
		    }
		    );
		    
		    
		    JButton bt2= new JButton("Login");
		    bt2.setBounds(200, 350, 100, 40);
		    Fm.add(bt2);
		    
		    bt2.addActionListener(new ActionListener() {
	            @Override
				public void actionPerformed(ActionEvent e) {
	            	     	        
					JFrame FE=new JFrame("Welcome");
				    JLabel l1=new JLabel("Welcome," +t1.getText());
				    l1.setBounds(40, 100, 300, 30);
				    FE.add(l1);
				    JLabel l2=new JLabel();
			        l2.setBounds(100, 100, 300, 30);
			        FE.add(l2);
			        JLabel l3=new JLabel("Your Login is successful!");
				    l3.setBounds(40, 130, 300, 30);
				    FE.add(l3);
				    
				    JButton jb= new JButton("OK");
				    jb.setBounds(70, 200, 100, 40);
				    FE.add(jb);
				   
				    jb.addActionListener(new ActionListener() {
                        @Override
						public void actionPerformed(ActionEvent e) {
							JFrame JF=new JFrame("Dress");
							
							JButton BT1= new JButton("Men's Wear");
							BT1.setBounds(100, 20, 100, 30);
						    JF.add(BT1);
						  
						    BT1.addActionListener(new ActionListener() {
								@Override
								public void actionPerformed(ActionEvent e) {
									JFrame Jf=new JFrame("Mens Wear");
									
									JLabel l1=new JLabel(new ImageIcon("C:/Users/hp/eclipse-workspace/OnlineDressOrdering/src/shirt1.jpg"));
									l1.setBounds(50, 100, 200, 200);
								    l1.setFont(new Font("TimesNewRoman", Font.PLAIN, 16));
								    Jf.add(l1);
								    
								    JLabel l2=new JLabel("Rate: Rs.399");
									l2.setBounds(300, 200, 100, 30);
								    l2.setFont(new Font("TimesNewRoman", Font.PLAIN, 16));
								    Jf.add(l2);
								    
								    JLabel l3=new JLabel("Add Quantity:");
									l3.setBounds(300, 250, 100, 30);
								    l3.setFont(new Font("TimesNewRoman", Font.PLAIN, 16));
								    Jf.add(l3);
								    
								    JTextField t1=new JTextField("");
									t1.setBounds(400, 260, 160, 20);
								    t1.setFont(new Font("TimesNewRoman", Font.PLAIN, 16));
								    Jf.add(t1);
								    
								    JLabel l4=new JLabel(new ImageIcon("C:/Users/hp/eclipse-workspace/OnlineDressOrdering/src/shirt8.jpg"));
									l4.setBounds(50, 350, 200, 200);
								    l4.setFont(new Font("TimesNewRoman", Font.PLAIN, 16));
								    Jf.add(l4);
								    
								    JLabel l5=new JLabel("Rate: Rs.499");
									l5.setBounds(300, 400, 100, 30);
								    l5.setFont(new Font("TimesNewRoman", Font.PLAIN, 16));
								    Jf.add(l5);
								    
								    JLabel l6=new JLabel("Add Quantity:");
									l6.setBounds(300, 450, 100, 30);
								    l6.setFont(new Font("TimesNewRoman", Font.PLAIN, 16));
								    Jf.add(l6);
								    
								    JTextField t2=new JTextField("");
									t2.setBounds(400, 460, 160, 20);
								    t2.setFont(new Font("TimesNewRoman", Font.PLAIN, 16));
								    Jf.add(t2);
								    
								    JButton B1= new JButton("Purchase");
									B1.setBounds(300, 600, 100, 30);
								    Jf.add(B1);
								   
								   B1.addActionListener(new ActionListener() {
										@Override
										public void actionPerformed(ActionEvent e) {
										JFrame JFR=new JFrame("Billing Page");
										int a1 = Integer.parseInt(t1.getText())	;
										int a2 = Integer.parseInt(t2.getText())	;
										int A1= a1*399;
										int A2= a2*499;
										int A=A1+A2;
										t3.setText(String.valueOf(A));
										
										JLabel l1=new JLabel("Your Billing Ammount Is:" +" " +A);
									    l1.setBounds(40, 100, 300, 30);
									    JFR.add(l1);
									    
									    JTextField t3=new JTextField("");
									    t3.setFont(new Font("TimesNewRoman", Font.PLAIN, 16));
									    JFR.add(t3);
									   
								        JLabel l2=new JLabel("Thankyou For Purchasing!");
									    l2.setBounds(40, 130, 300, 30);
									    JFR.add(l2);
									    
									    JButton Bt1= new JButton("Payment");
									    Bt1.setBounds(70, 200, 100, 40);
									    JFR.add(Bt1);
									    
									   Bt1.addActionListener(new ActionListener() {
										@Override
										public void actionPerformed(ActionEvent e) {
										JFrame jfr= new JFrame("Payment");	
										
										JLabel l1=new JLabel("Enter Your Account Number:");
									    l1.setBounds(50, 100, 300, 30);
									    jfr.add(l1);
									    
									    JTextField t1=new JTextField("");
									    t1.setBounds(230, 100, 300, 30);
									    t1.setFont(new Font("TimesNewRoman", Font.PLAIN, 16));
									    jfr.add(t1);
									   
								        JLabel l2=new JLabel("Enter Your CVV Number:");
									    l2.setBounds(50, 150, 300, 30);
									    jfr.add(l2);
									    
									    JTextField t2=new JTextField();
									    t2.setBounds(230, 150, 300, 30);
									    t2.setFont(new Font("TimesNewRoman", Font.PLAIN, 16));
									    jfr.add(t2);
									    
									    JLabel l3=new JLabel("Your Bill Amount:");
									    l3.setBounds(50, 200, 300, 30);
									    jfr.add(l3);
									    
									    JTextField t3=new JTextField();
									    t3.setBounds(230, 200, 300, 30);
									    t3.setFont(new Font("TimesNewRoman", Font.PLAIN, 16));
									    jfr.add(t3);
									    
									    JButton Bt1= new JButton("Submit");
									    Bt1.setBounds(250, 300, 100, 40);
									    jfr.add(Bt1);
									 
									   Bt1.addActionListener(new ActionListener() {
										@Override
										public void actionPerformed(ActionEvent e) {
											JFrame fra= new JFrame();
											
											JLabel l1=new JLabel("Your Ammount Is Transferd Successfully!");
										    l1.setBounds(50, 100, 300, 30);
										    fra.add(l1);
										    
											JButton BN1= new JButton("OK");
										    BN1.setBounds(130, 150, 100, 40);
										    fra.add(BN1);
										 
										   BN1.addActionListener(new ActionListener() {
											@Override
											public void actionPerformed(ActionEvent e) {
												System.exit(0);
												
											}
											   
										   });
	
										   fra.setSize(400, 400);
										    fra.setLayout(null);
										    fra.setVisible(true);
											
										    fra.setLayout(new BorderLayout());
											JLabel bg = new JLabel(new ImageIcon("C:/Users/hp/eclipse-workspace/OnlineDressOrdering/src/img1.jpg"));
											fra.add(bg);
											fra.setSize(399, 399);
											
											fra.addWindowListener (new WindowAdapter() {    
												 public void windowClosing (WindowEvent e) {    
										             fra.dispose();    
												 } 
											}); 
										    
										}
										   
									   });
									    
									    
									    jfr.setSize(600, 600);
									    jfr.setLayout(null);
									    jfr.setVisible(true);
										
									    jfr.setLayout(new BorderLayout());
										JLabel bg = new JLabel(new ImageIcon("C:/Users/hp/eclipse-workspace/OnlineDressOrdering/src/img1.jpg"));
										jfr.add(bg);
										jfr.setSize(599, 599);
										
										jfr.addWindowListener (new WindowAdapter() {    
											 public void windowClosing (WindowEvent e) {    
									             jfr.dispose();    
											 } 
										}); 
									    
										}
										   
									   });
									    
									    JFR.setSize(400, 400);
										JFR.setLayout(null);
										JFR.setVisible(true);
										
										JFR.setLayout(new BorderLayout());
										JLabel bg = new JLabel(new ImageIcon("C:/Users/hp/eclipse-workspace/OnlineDressOrdering/src/img1.jpg"));
										JFR.add(bg);
										JFR.setSize(399, 399);
										
										JFR.addWindowListener (new WindowAdapter() {    
											 public void windowClosing (WindowEvent e) {    
									             JFR.dispose();    
											 } 
										}); 
									    
										}
								    	
								    });
								     
								    Jf.setSize(900, 700);
								    Jf.setLayout(null);
								    Jf.setVisible(true);
									
								    Jf.setLayout(new BorderLayout());
									JLabel bg = new JLabel(new ImageIcon("C:/Users/hp/eclipse-workspace/OnlineDressOrdering/src/img1.jpg"));
									Jf.add(bg);
									Jf.setSize(899, 699);
									
									Jf.addWindowListener (new WindowAdapter() {    
										 public void windowClosing (WindowEvent e) {    
								             F.dispose();    
										 } 
									}); 
									
								}
						    	
						    });
						    
							JButton BT2= new JButton("Women's Wear");
							BT2.setBounds(200, 20, 120, 30);
						    JF.add(BT2);
						    
						    BT2.addActionListener(new ActionListener() {
								@Override
								public void actionPerformed(ActionEvent e) {
									JFrame Jf=new JFrame("Mens Wear");
									
									JLabel l1=new JLabel(new ImageIcon("C:/Users/hp/eclipse-workspace/OnlineDressOrdering/src/shirt1.jpg"));
									l1.setBounds(50, 100, 200, 200);
								    l1.setFont(new Font("TimesNewRoman", Font.PLAIN, 16));
								    Jf.add(l1);
								    
								    JLabel l2=new JLabel("Rate: Rs.399");
									l2.setBounds(300, 200, 100, 30);
								    l2.setFont(new Font("TimesNewRoman", Font.PLAIN, 16));
								    Jf.add(l2);
								    
								    JLabel l3=new JLabel("Add Quantity:");
									l3.setBounds(300, 250, 100, 30);
								    l3.setFont(new Font("TimesNewRoman", Font.PLAIN, 16));
								    Jf.add(l3);
								    
								    JTextField t1=new JTextField("");
									t1.setBounds(400, 260, 160, 20);
								    t1.setFont(new Font("TimesNewRoman", Font.PLAIN, 16));
								    Jf.add(t1);
								    
								    JLabel l4=new JLabel(new ImageIcon("C:/Users/hp/eclipse-workspace/OnlineDressOrdering/src/shirt8.jpg"));
									l4.setBounds(50, 350, 200, 200);
								    l4.setFont(new Font("TimesNewRoman", Font.PLAIN, 16));
								    Jf.add(l4);
								    
								    JLabel l5=new JLabel("Rate: Rs.499");
									l5.setBounds(300, 400, 100, 30);
								    l5.setFont(new Font("TimesNewRoman", Font.PLAIN, 16));
								    Jf.add(l5);
								    
								    JLabel l6=new JLabel("Add Quantity:");
									l6.setBounds(300, 450, 100, 30);
								    l6.setFont(new Font("TimesNewRoman", Font.PLAIN, 16));
								    Jf.add(l6);
								    
								    JTextField t2=new JTextField("");
									t2.setBounds(400, 460, 160, 20);
								    t2.setFont(new Font("TimesNewRoman", Font.PLAIN, 16));
								    Jf.add(t2);
								    
								    JButton B1= new JButton("Purchase");
									B1.setBounds(300, 600, 100, 30);
								    Jf.add(B1);
								   
								   B1.addActionListener(new ActionListener() {
										@Override
										public void actionPerformed(ActionEvent e) {
										JFrame JFR=new JFrame("Billing Page");
										int a1 = Integer.parseInt(t1.getText())	;
										int a2 = Integer.parseInt(t2.getText())	;
										int A1= a1*399;
										int A2= a2*499;
										int A=A1+A2;
										t3.setText(String.valueOf(A));
										
										JLabel l1=new JLabel("Your Billing Ammount Is:" +" " +A);
									    l1.setBounds(40, 100, 300, 30);
									    JFR.add(l1);
									    
									    JTextField t3=new JTextField("");
									    t3.setFont(new Font("TimesNewRoman", Font.PLAIN, 16));
									    JFR.add(t3);
									   
								        JLabel l2=new JLabel("Thankyou For Purchasing!");
									    l2.setBounds(40, 130, 300, 30);
									    JFR.add(l2);
									    
									    JButton Bt1= new JButton("Payment");
									    Bt1.setBounds(70, 200, 100, 40);
									    JFR.add(Bt1);
									    
									   Bt1.addActionListener(new ActionListener() {
										@Override
										public void actionPerformed(ActionEvent e) {
										JFrame jfr= new JFrame("Payment");	
										
										JLabel l1=new JLabel("Enter Your Account Number:");
									    l1.setBounds(50, 100, 300, 30);
									    jfr.add(l1);
									    
									    JTextField t1=new JTextField("");
									    t1.setBounds(230, 100, 300, 30);
									    t1.setFont(new Font("TimesNewRoman", Font.PLAIN, 16));
									    jfr.add(t1);
									   
								        JLabel l2=new JLabel("Enter Your CVV Number:");
									    l2.setBounds(50, 150, 300, 30);
									    jfr.add(l2);
									    
									    JTextField t2=new JTextField();
									    t2.setBounds(230, 150, 300, 30);
									    t2.setFont(new Font("TimesNewRoman", Font.PLAIN, 16));
									    jfr.add(t2);
									    
									    JLabel l3=new JLabel("Your Bill Amount:");
									    l3.setBounds(50, 200, 300, 30);
									    jfr.add(l3);
									    
									    JTextField t3=new JTextField();
									    t3.setBounds(230, 200, 300, 30);
									    t3.setFont(new Font("TimesNewRoman", Font.PLAIN, 16));
									    jfr.add(t3);
									    
									    JButton Bt1= new JButton("Submit");
									    Bt1.setBounds(250, 300, 100, 40);
									    jfr.add(Bt1);
									 
									   Bt1.addActionListener(new ActionListener() {
										@Override
										public void actionPerformed(ActionEvent e) {
											JFrame fra= new JFrame();
											
											JLabel l1=new JLabel("Your Ammount Is Transferd Successfully!");
										    l1.setBounds(50, 100, 300, 30);
										    fra.add(l1);
										    
											JButton BN1= new JButton("OK");
										    BN1.setBounds(130, 150, 100, 40);
										    fra.add(BN1);
										 
										   BN1.addActionListener(new ActionListener() {
											@Override
											public void actionPerformed(ActionEvent e) {
												System.exit(0);
												
											}
											   
										   });
	
										   fra.setSize(400, 400);
										    fra.setLayout(null);
										    fra.setVisible(true);
											
										    fra.setLayout(new BorderLayout());
											JLabel bg = new JLabel(new ImageIcon("C:/Users/hp/eclipse-workspace/OnlineDressOrdering/src/img1.jpg"));
											fra.add(bg);
											fra.setSize(399, 399);
											
											fra.addWindowListener (new WindowAdapter() {    
												 public void windowClosing (WindowEvent e) {    
										             fra.dispose();    
												 } 
											}); 
										    
										}
										   
									   });
									    
									    
									    jfr.setSize(600, 600);
									    jfr.setLayout(null);
									    jfr.setVisible(true);
										
									    jfr.setLayout(new BorderLayout());
										JLabel bg = new JLabel(new ImageIcon("C:/Users/hp/eclipse-workspace/OnlineDressOrdering/src/img1.jpg"));
										jfr.add(bg);
										jfr.setSize(599, 599);
										
										jfr.addWindowListener (new WindowAdapter() {    
											 public void windowClosing (WindowEvent e) {    
									             jfr.dispose();    
											 } 
										}); 
									    
										}
										   
									   });
									    
									    JFR.setSize(400, 400);
										JFR.setLayout(null);
										JFR.setVisible(true);
										
										JFR.setLayout(new BorderLayout());
										JLabel bg = new JLabel(new ImageIcon("C:/Users/hp/eclipse-workspace/OnlineDressOrdering/src/img1.jpg"));
										JFR.add(bg);
										JFR.setSize(399, 399);
										
										JFR.addWindowListener (new WindowAdapter() {    
											 public void windowClosing (WindowEvent e) {    
									             JFR.dispose();    
											 } 
										}); 
									    
										}
								    	
								    });
								     
								    Jf.setSize(900, 700);
								    Jf.setLayout(null);
								    Jf.setVisible(true);
									
								    Jf.setLayout(new BorderLayout());
									JLabel bg = new JLabel(new ImageIcon("C:/Users/hp/eclipse-workspace/OnlineDressOrdering/src/img1.jpg"));
									Jf.add(bg);
									Jf.setSize(899, 699);
									
									Jf.addWindowListener (new WindowAdapter() {    
										 public void windowClosing (WindowEvent e) {    
								             F.dispose();    
										 } 
									}); 
									
								}
						    	
						    });
						   
							JButton BT3= new JButton("Kids's Wear");
						    BT3.setBounds(320, 20, 140, 30);
						    JF.add(BT3);
						    
						    BT3.addActionListener(new ActionListener() {
								@Override
								public void actionPerformed(ActionEvent e) {
									JFrame Jf=new JFrame("Mens Wear");
									
									JLabel l1=new JLabel(new ImageIcon("C:/Users/hp/eclipse-workspace/OnlineDressOrdering/src/shirt1.jpg"));
									l1.setBounds(50, 100, 200, 200);
								    l1.setFont(new Font("TimesNewRoman", Font.PLAIN, 16));
								    Jf.add(l1);
								    
								    JLabel l2=new JLabel("Rate: Rs.399");
									l2.setBounds(300, 200, 100, 30);
								    l2.setFont(new Font("TimesNewRoman", Font.PLAIN, 16));
								    Jf.add(l2);
								    
								    JLabel l3=new JLabel("Add Quantity:");
									l3.setBounds(300, 250, 100, 30);
								    l3.setFont(new Font("TimesNewRoman", Font.PLAIN, 16));
								    Jf.add(l3);
								    
								    JTextField t1=new JTextField("");
									t1.setBounds(400, 260, 160, 20);
								    t1.setFont(new Font("TimesNewRoman", Font.PLAIN, 16));
								    Jf.add(t1);
								    
								    JLabel l4=new JLabel(new ImageIcon("C:/Users/hp/eclipse-workspace/OnlineDressOrdering/src/shirt8.jpg"));
									l4.setBounds(50, 350, 200, 200);
								    l4.setFont(new Font("TimesNewRoman", Font.PLAIN, 16));
								    Jf.add(l4);
								    
								    JLabel l5=new JLabel("Rate: Rs.499");
									l5.setBounds(300, 400, 100, 30);
								    l5.setFont(new Font("TimesNewRoman", Font.PLAIN, 16));
								    Jf.add(l5);
								    
								    JLabel l6=new JLabel("Add Quantity:");
									l6.setBounds(300, 450, 100, 30);
								    l6.setFont(new Font("TimesNewRoman", Font.PLAIN, 16));
								    Jf.add(l6);
								    
								    JTextField t2=new JTextField("");
									t2.setBounds(400, 460, 160, 20);
								    t2.setFont(new Font("TimesNewRoman", Font.PLAIN, 16));
								    Jf.add(t2);
								    
								    JButton B1= new JButton("Purchase");
									B1.setBounds(300, 600, 100, 30);
								    Jf.add(B1);
								   
								   B1.addActionListener(new ActionListener() {
										@Override
										public void actionPerformed(ActionEvent e) {
										JFrame JFR=new JFrame("Billing Page");
										int a1 = Integer.parseInt(t1.getText())	;
										int a2 = Integer.parseInt(t2.getText())	;
										int A1= a1*399;
										int A2= a2*499;
										int A=A1+A2;
										t3.setText(String.valueOf(A));
										
										JLabel l1=new JLabel("Your Billing Ammount Is:" +" " +A);
									    l1.setBounds(40, 100, 300, 30);
									    JFR.add(l1);
									    
									    JTextField t3=new JTextField("");
									    t3.setFont(new Font("TimesNewRoman", Font.PLAIN, 16));
									    JFR.add(t3);
									   
								        JLabel l2=new JLabel("Thankyou For Purchasing!");
									    l2.setBounds(40, 130, 300, 30);
									    JFR.add(l2);
									    
									    JButton Bt1= new JButton("Payment");
									    Bt1.setBounds(70, 200, 100, 40);
									    JFR.add(Bt1);
									    
									   Bt1.addActionListener(new ActionListener() {
										@Override
										public void actionPerformed(ActionEvent e) {
										JFrame jfr= new JFrame("Payment");	
										
										JLabel l1=new JLabel("Enter Your Account Number:");
									    l1.setBounds(50, 100, 300, 30);
									    jfr.add(l1);
									    
									    JTextField t1=new JTextField("");
									    t1.setBounds(230, 100, 300, 30);
									    t1.setFont(new Font("TimesNewRoman", Font.PLAIN, 16));
									    jfr.add(t1);
									   
								        JLabel l2=new JLabel("Enter Your CVV Number:");
									    l2.setBounds(50, 150, 300, 30);
									    jfr.add(l2);
									    
									    JTextField t2=new JTextField();
									    t2.setBounds(230, 150, 300, 30);
									    t2.setFont(new Font("TimesNewRoman", Font.PLAIN, 16));
									    jfr.add(t2);
									    
									    JLabel l3=new JLabel("Your Bill Amount:");
									    l3.setBounds(50, 200, 300, 30);
									    jfr.add(l3);
									    
									    JTextField t3=new JTextField();
									    t3.setBounds(230, 200, 300, 30);
									    t3.setFont(new Font("TimesNewRoman", Font.PLAIN, 16));
									    jfr.add(t3);
									    
									    JButton Bt1= new JButton("Submit");
									    Bt1.setBounds(250, 300, 100, 40);
									    jfr.add(Bt1);
									 
									   Bt1.addActionListener(new ActionListener() {
										@Override
										public void actionPerformed(ActionEvent e) {
											JFrame fra= new JFrame();
											
											JLabel l1=new JLabel("Your Ammount Is Transferd Successfully!");
										    l1.setBounds(50, 100, 300, 30);
										    fra.add(l1);
										    
											JButton BN1= new JButton("OK");
										    BN1.setBounds(130, 150, 100, 40);
										    fra.add(BN1);
										 
										   BN1.addActionListener(new ActionListener() {
											@Override
											public void actionPerformed(ActionEvent e) {
												System.exit(0);
												
											}
											   
										   });
	
										   fra.setSize(400, 400);
										    fra.setLayout(null);
										    fra.setVisible(true);
											
										    fra.setLayout(new BorderLayout());
											JLabel bg = new JLabel(new ImageIcon("C:/Users/hp/eclipse-workspace/OnlineDressOrdering/src/img1.jpg"));
											fra.add(bg);
											fra.setSize(399, 399);
											
											fra.addWindowListener (new WindowAdapter() {    
												 public void windowClosing (WindowEvent e) {    
										             fra.dispose();    
												 } 
											}); 
										    
										}
										   
									   });
									    
									    
									    jfr.setSize(600, 600);
									    jfr.setLayout(null);
									    jfr.setVisible(true);
										
									    jfr.setLayout(new BorderLayout());
										JLabel bg = new JLabel(new ImageIcon("C:/Users/hp/eclipse-workspace/OnlineDressOrdering/src/img1.jpg"));
										jfr.add(bg);
										jfr.setSize(599, 599);
										
										jfr.addWindowListener (new WindowAdapter() {    
											 public void windowClosing (WindowEvent e) {    
									             jfr.dispose();    
											 } 
										}); 
									    
										}
										   
									   });
									    
									    JFR.setSize(400, 400);
										JFR.setLayout(null);
										JFR.setVisible(true);
										
										JFR.setLayout(new BorderLayout());
										JLabel bg = new JLabel(new ImageIcon("C:/Users/hp/eclipse-workspace/OnlineDressOrdering/src/img1.jpg"));
										JFR.add(bg);
										JFR.setSize(399, 399);
										
										JFR.addWindowListener (new WindowAdapter() {    
											 public void windowClosing (WindowEvent e) {    
									             JFR.dispose();    
											 } 
										}); 
									    
										}
								    	
								    });
								     
								    Jf.setSize(900, 700);
								    Jf.setLayout(null);
								    Jf.setVisible(true);
									
								    Jf.setLayout(new BorderLayout());
									JLabel bg = new JLabel(new ImageIcon("C:/Users/hp/eclipse-workspace/OnlineDressOrdering/src/img1.jpg"));
									Jf.add(bg);
									Jf.setSize(899, 699);
									
									Jf.addWindowListener (new WindowAdapter() {    
										 public void windowClosing (WindowEvent e) {    
								             F.dispose();    
										 } 
									}); 
									
								}
						    	
						    });
						    
						    
						    
						    
						    
						    JLabel l1=new JLabel(new ImageIcon("C:/Users/hp/eclipse-workspace/OnlineDressOrdering/src/SenthilSreeja.jpg"));
							l1.setBounds(50, 100, 250, 250);
						    l1.setFont(new Font("TimesNewRoman", Font.PLAIN, 16));
						    JF.add(l1);
							
						    JLabel l2=new JLabel(new ImageIcon("C:/Users/hp/eclipse-workspace/OnlineDressOrdering/src/kurthi3.jpg"));
							l2.setBounds(300, 100, 250, 250);
						    l2.setFont(new Font("TimesNewRoman", Font.PLAIN, 16));
						    JF.add(l2);
						    
						    JLabel l3=new JLabel(new ImageIcon("C:/Users/hp/eclipse-workspace/OnlineDressOrdering/src/saree9.jpg"));
							l3.setBounds(550, 100, 250, 250);
						    l3.setFont(new Font("TimesNewRoman", Font.PLAIN, 16));
						    JF.add(l3);
						    
						    JLabel l4=new JLabel("Purchase Your Dess With Us at Best Deal");
							l4.setBounds(300, 350, 500, 30);
						    l4.setFont(new Font("TimesNewRoman", Font.PLAIN, 16));
						    JF.add(l4);
						    
						    JLabel l5=new JLabel(new ImageIcon("C:/Users/hp/eclipse-workspace/OnlineDressOrdering/src/kids.jpg"));
							l5.setBounds(50, 400, 250, 250);
						    l5.setFont(new Font("TimesNewRoman", Font.PLAIN, 16));
						    JF.add(l5);
						    
						    JLabel l6=new JLabel(new ImageIcon("C:/Users/hp/eclipse-workspace/OnlineDressOrdering/src/shirt1.jpg"));
							l6.setBounds(300, 400, 250, 250);
						    l6.setFont(new Font("TimesNewRoman", Font.PLAIN, 16));
						    JF.add(l6);
						    
						    JLabel l7=new JLabel(new ImageIcon("C:/Users/hp/eclipse-workspace/OnlineDressOrdering/src/shirt8.jpg"));
							l7.setBounds(550, 400, 250, 250);
						    l7.setFont(new Font("TimesNewRoman", Font.PLAIN, 16));
						    JF.add(l7);
						    
						    JF.setSize(900, 700);
							JF.setLayout(null);
							JF.setVisible(true);
							
							JF.setLayout(new BorderLayout());
							JLabel bg = new JLabel(new ImageIcon("C:/Users/hp/eclipse-workspace/OnlineDressOrdering/src/img6.jpg"));
							JF.add(bg);
							JF.setSize(899, 699);
						       
							JF.addWindowListener (new WindowAdapter() {
								public void windowClosing (WindowEvent e) { 
									JF.dispose();
			            }    
			        }); 
						}
							
				    });
				    
			
				    FE.setSize(300, 300);
					FE.setLayout(null);
					FE.setVisible(true);
					
					FE.setLayout(new BorderLayout());
					JLabel bg = new JLabel(new ImageIcon("C:/Users/hp/eclipse-workspace/OnlineDressOrdering/src/img5.jpg"));
					FE.add(bg);
					FE.setSize(299, 299);
				       
					FE.addWindowListener (new WindowAdapter() {
						public void windowClosing (WindowEvent e) { 
							Fm.dispose();
	            }    
	        }); 
				    
	            	
						}
				           }
				                 );
		   
				  
		    Fm.setSize(900, 700);
			Fm.setLayout(null);
			Fm.setVisible(true);
			
			Fm.setLayout(new BorderLayout());
			JLabel bg = new JLabel(new ImageIcon("C:/Users/hp/eclipse-workspace/OnlineDressOrdering/src/img4.jpg"));
			Fm.add(bg);
			Fm.setSize(899, 699);
			
			Fm.addWindowListener (new WindowAdapter() {
				public void windowClosing (WindowEvent e) { 
					Fm.dispose();
				}
			}
	    					);
			
			
			}});

        F.setSize(900, 700);
		F.setLayout(null);
		F.setVisible(true);
		
		F.setLayout(new BorderLayout());
		JLabel bg = new JLabel(new ImageIcon("C:/Users/hp/eclipse-workspace/OnlineDressOrdering/src/img1.jpg"));
		F.add(bg);
		F.setSize(899, 699);
		
		F.addWindowListener (new WindowAdapter() {    
			 public void windowClosing (WindowEvent e) {    
	             F.dispose();    
			 } 
		}); 
	
	}
}


public class onlinedressshop {

	public static void main(String[] args) {
		
    HomePage HP=new HomePage();
	}

}
