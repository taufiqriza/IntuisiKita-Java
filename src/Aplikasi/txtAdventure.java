package Aplikasi;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class txtAdventure {
	
	JFrame window;
	Container con;
	JPanel titleNamePanel, startButtonPanel, mainTextPanel, choiceButtonPanel, playerPanel;
	JLabel titleNameLabel, hpLabel, hpLabelNumber, weaponLabel, weaponLabelName;
	Font titleFont = new Font("Times New Roman", Font.PLAIN, 90);
	Font normalFont = new Font("Times New Roman", Font.PLAIN, 28);
	JButton startButton, choice1, choice2, choice3, choice4;
	JTextArea mainTextArea;
	int playerHP, monsterHP, silverRing;
	String weapon, position;
	
	TitleScreenHandler tsHandler = new TitleScreenHandler();
	ChoiceHandler choiceHandler = new ChoiceHandler();


	public static void main(String[] args) {

		new Game();
	}
	
	public txtAdventure(){
		
		window = new JFrame();
		window.setSize(800, 600);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setBackground(Color.black);
		window.setLayout(null);
		window.setVisible(true);
		con = window.getContentPane();
		
		titleNamePanel = new JPanel();
		titleNamePanel.setBounds(100, 100, 600, 150);
		titleNamePanel.setBackground(Color.black);
		titleNameLabel = new JLabel("ADVENTURE");
		titleNameLabel.setForeground(Color.white);
		titleNameLabel.setFont(titleFont);	
		
		startButtonPanel = new JPanel();
		startButtonPanel.setBounds(300, 400, 200, 100);
		startButtonPanel.setBackground(Color.black);
		
		startButton = new JButton("Mulai");
		startButton.setBackground(Color.black);
		startButton.setForeground(Color.white);
		startButton.setFont(normalFont);
		startButton.addActionListener(tsHandler);
		startButton.setFocusPainted(false);
		
		titleNamePanel.add(titleNameLabel);
		startButtonPanel.add(startButton);
		
		con.add(titleNamePanel);
		con.add(startButtonPanel);
	}
	
	public void createGameScreen(){
		
		titleNamePanel.setVisible(false);
		startButtonPanel.setVisible(false);
		
		mainTextPanel = new JPanel();
		mainTextPanel.setBounds(100, 100, 600, 250);
		mainTextPanel.setBackground(Color.black);
		con.add(mainTextPanel);
		
		mainTextArea = new JTextArea("Ini adalah teks utama. Game ini akan menjadi luar biasa. Saya yakin itu !!!!!!!");
		mainTextArea.setBounds(100, 100, 600, 250);
		mainTextArea.setBackground(Color.black);
		mainTextArea.setForeground(Color.white);
		mainTextArea.setFont(normalFont);
		mainTextArea.setLineWrap(true);
		mainTextPanel.add(mainTextArea);
		
		choiceButtonPanel = new JPanel();
		choiceButtonPanel.setBounds(250, 350, 300, 150);
		choiceButtonPanel.setBackground(Color.black);
		choiceButtonPanel.setLayout(new GridLayout(4,1));
		con.add(choiceButtonPanel);
		
		choice1 = new JButton("Pilihan 1");
		choice1.setBackground(Color.black);
		choice1.setForeground(Color.white);
		choice1.setFont(normalFont);
		choice1.setFocusPainted(false);
		choice1.addActionListener(choiceHandler);
		choice1.setActionCommand("c1");
		choiceButtonPanel.add(choice1);
		choice2 = new JButton("Pilihan 2");
		choice2.setBackground(Color.black);
		choice2.setForeground(Color.white);
		choice2.setFont(normalFont);
		choice2.setFocusPainted(false);
		choice2.addActionListener(choiceHandler);
		choice2.setActionCommand("c2");
		choiceButtonPanel.add(choice2);
		choice3 = new JButton("Pilihan 3");
		choice3.setBackground(Color.black);
		choice3.setForeground(Color.white);
		choice3.setFont(normalFont);
		choice3.setFocusPainted(false);
		choice3.addActionListener(choiceHandler);
		choice3.setActionCommand("c3");
		choiceButtonPanel.add(choice3);
		choice4 = new JButton("Pilihan 4");
		choice4.setBackground(Color.black);
		choice4.setForeground(Color.white);
		choice4.setFont(normalFont);
		choice4.setFocusPainted(false);
		choice4.addActionListener(choiceHandler);
		choice4.setActionCommand("c4");
		choiceButtonPanel.add(choice4);
		
		playerPanel = new JPanel();
		playerPanel.setBounds(100, 15, 600, 50);
		playerPanel.setBackground(Color.black);
		playerPanel.setLayout(new GridLayout(1,4));
		con.add(playerPanel);
		hpLabel = new JLabel("Point:");
		hpLabel.setFont(normalFont);
		hpLabel.setForeground(Color.white);
		playerPanel.add(hpLabel);
		hpLabelNumber = new JLabel();
		hpLabelNumber.setFont(normalFont);
		hpLabelNumber.setForeground(Color.white);
		playerPanel.add(hpLabelNumber);
		weaponLabel = new JLabel("Senjata:");
		weaponLabel.setFont(normalFont);
		weaponLabel.setForeground(Color.white);
		playerPanel.add(weaponLabel);
		weaponLabelName = new JLabel();
		weaponLabelName.setFont(normalFont);
		weaponLabelName.setForeground(Color.white);
		playerPanel.add(weaponLabelName);

		playerSetup();

	}
	public void playerSetup(){
		playerHP = 15;
		monsterHP = 20;
		weapon = "Pisau";
		weaponLabelName.setText(weapon);
		hpLabelNumber.setText("" + playerHP);
		
		townGate();
	}
	public void townGate(){
		position = "townGate";
		mainTextArea.setText("Anda berada di gerbang kota. \\ n Seorang penjaga berdiri di depan Anda. \\ n \\ nApa yang kamu lakukan ?:");		
		choice1.setText("Bicaralah pada penjaga");
		choice2.setText("Serang penjaga");
		choice3.setText("Meninggalkan");
		choice4.setText("");
	}
	public void talkGuard(){
		position = "talkGuard";
		mainTextArea.setText("Penjaga: Halo orang asing. Aku belum pernah melihat wajahmu. Maaf, kami tidak bisa membiarkan orang asing memasuki kota kami.");
		choice1.setText(">");
		choice2.setText("");
		choice3.setText("");
		choice4.setText("");
	}
	public void attackGuard(){
		position = "attackGuard";
		mainTextArea.setText("Penjaga: Hei, jangan bodoh! \\ N \\ nPenjaga itu membalas dan memukul Anda dengan keras. \\ N (Anda menerima 3 kerusakan)");
		playerHP = playerHP -3;
		hpLabelNumber.setText(""+playerHP);
		choice1.setText(">");
		choice2.setText("");
		choice3.setText("");
		choice4.setText("");
	}
	public void crossRoad(){
		position = "crossRoad";
		mainTextArea.setText("Anda berada di persimpangan jalan. \\ Jika Anda pergi ke selatan, Anda akan kembali ke kota.");
		choice1.setText("Pergi ke utara");
		choice2.setText("Pergi ke timur");
		choice3.setText("Pergi ke selatan");
		choice4.setText("Pergi ke barat");
	}
	public void north(){
		position = "north";
		mainTextArea.setText("Ada sebuah sungai. \\ Anda meminum air dan beristirahat di tepi sungai. \\ n \\ n (HP Anda pulih 2)");
		playerHP = playerHP + 2;
		hpLabelNumber.setText(""+playerHP);
		choice1.setText("Pergi ke selatan");
		choice2.setText("");
		choice3.setText("");
		choice4.setText("");		
	}
	public void east(){
		position = "east";
		mainTextArea.setText("Anda berjalan ke hutan dan menemukan Pedang Panjang! \\ N \\ n (Anda memperoleh Pedang Panjang)");
		weapon = "Long Sword";
		weaponLabelName.setText(weapon);
		choice1.setText("Go west");
		choice2.setText("");
		choice3.setText("");
		choice4.setText("");
		
	}
	public void west(){
		position = "west";
		mainTextArea.setText("Anda menemukan seorang goblin!");
		choice1.setText("Pertarungan");
		choice2.setText("Lari");
		choice3.setText("");
		choice4.setText("");
	}
	public void fight(){
		position = "Pertarungan";
		mainTextArea.setText("Monster HP: \"+ monster HP +\" \\ dan Apa yang kamu lakukan?");
		choice1.setText("Menyerang");
		choice2.setText("Lari");
		choice3.setText("");
		choice4.setText("");
	}
	public void playerAttack(){
		position = "playerAttack";
		
		int playerDamage = 0;
		
		if(weapon.equals("Pisau")){
			playerDamage = new java.util.Random().nextInt(3);
		}
		else if(weapon.equals("Pedang Panjang")){
			playerDamage = new java.util.Random().nextInt(12); 
		}
		
		mainTextArea.setText("Anda menyerang monster itu dan memberi \"+ playerDamage +\" kerusakan!");
		
		monsterHP = monsterHP - playerDamage;
		
		choice1.setText(">");
		choice2.setText("");
		choice3.setText("");
		choice4.setText("");		
	}
	public void monsterAttack(){
		position = "monsterAttack";
		
		int monsterDamage = 0;
		
		monsterDamage = new java.util.Random().nextInt(6); 
		
		mainTextArea.setText("Monster itu menyerangmu dan memberi \"+ monsterDamage +\" damage!");
		
		playerHP = playerHP - monsterDamage;
		hpLabelNumber.setText(""+playerHP);
		
		choice1.setText(">");
		choice2.setText("");
		choice3.setText("");
		choice4.setText("");	
	}
	public void win(){
		position = "win";
		
		mainTextArea.setText("Anda mengalahkan monster itu! \\ NS monster itu menjatuhkan cincin! \\ N \\ n (Anda mendapatkan Cincin Perak)");
		
		silverRing = 1;
		
		choice1.setText("Pergi ke timur");
		choice2.setText("");
		choice3.setText("");
		choice4.setText("");
		
	}
	public void lose(){
		position = "lose";
		
		mainTextArea.setText("Anda sudah mati! \\ N \\ n");
		
		choice1.setText("");
		choice2.setText("");
		choice3.setText("");
		choice4.setText("");
		choice1.setVisible(false);
		choice2.setVisible(false);
		choice3.setVisible(false);
		choice4.setVisible(false);
	}
	public void ending(){
		position = "ending";
		
		mainTextArea.setText("Anda berjalan ke hutan dan menemukan Pedang Panjang! \\ N \\ n (Anda memperoleh Pedang Panjang");
		
		choice1.setText("");
		choice2.setText("");
		choice3.setText("");
		choice4.setText("");
		choice1.setVisible(false);
		choice2.setVisible(false);
		choice3.setVisible(false);
		choice4.setVisible(false);
	}

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



	
	
	
		
	
	
	
	public class TitleScreenHandler implements ActionListener{
		
		public void actionPerformed(ActionEvent event){
			
			createGameScreen();
		}
	}
	public class ChoiceHandler implements ActionListener{
		
		public void actionPerformed(ActionEvent event){
			
			String yourChoice = event.getActionCommand();
			
			switch(position){
			case "townGate":
				switch(yourChoice){
				case "c1": 
					if(silverRing==1){
						ending();
					}
					else{
						talkGuard();
					}
					break;
				case "c2": attackGuard();break;
				case "c3": crossRoad();break;
				}
				break;
			case "talkGuard":
				switch(yourChoice){
				case "c1": townGate(); break;
				}
				break;
			case "attackGuard":
				switch(yourChoice){
				case "c1": townGate(); break;
				}
				break;
			case "crossRoad":
				switch(yourChoice){
				case "c1": north(); break;
				case "c2": east();break;
				case "c3": townGate(); break;
				case "c4": west();break;
				}
				break;
			case "north":
				switch(yourChoice){
				case "c1": crossRoad(); break;
				}
				break;
			case "east":
				switch(yourChoice){
				case "c1": crossRoad(); break;
				}
				break;
			case "west":
				switch(yourChoice){
				case "c1": fight(); break;
				case "c2": crossRoad(); break;
				}
				break;
			case "fight":
				switch(yourChoice){
				case "c1": playerAttack();break;
				case "c2": crossRoad(); break;
				}
				break;
			case "playerAttack":
				switch(yourChoice){
				case "c1": 
					if(monsterHP<1){
						win();
					}
					else{
						monsterAttack();
					}
					break;
				}
				break;
			case "monsterAttack":
				switch(yourChoice){
				case "c1": 
					if(playerHP<1){
						lose();
					}
					else{
						fight();
					}
					break;
				}
				break;
			case "win":
				switch(yourChoice){
				case "c1": crossRoad();
				}
				break;
				
			}
			
			
		}
	}



}
