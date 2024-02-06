package com.ict.day22;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex02_Paint extends JFrame{ // 창 프레임
	JPanel jp; // 바닥
	JButton jb1, jb2, jb3, jb4, jb5, jb6, jb7; // 색 버튼
	JComboBox<String> jcom; // 메뉴칸
	String[] iteams = {"5", "10", "15", "20", "25", "30"}; // 메뉴칸에 들어갈 펜굵기
	int x = -5, y = -5, wh = 5; // x, y 는 좌표 wh 는 펜넓이
	Color color;
	
	// 내부 클래스
	CanvasTest ct = new CanvasTest();
	
	// 생성자
	public Ex02_Paint() {
		super("미니그림판"); // 부모인 JFrame 창에 이름
		
		jp = new JPanel();
		jb1 = new JButton(" "); // 띄어쓰기 안하면 안나옴
		jb1.setBackground(Color.red); // 색 버튼에 색 넣기
		jb2 = new JButton(" "); // 띄어쓰기 안하면 안나옴
		jb2.setBackground(Color.GREEN); // 색 버튼에 색 넣기
		jb3 = new JButton(" "); // 띄어쓰기 안하면 안나옴
		jb3.setBackground(Color.BLUE); // 색 버튼에 색 넣기
		jb4 = new JButton(" "); // 띄어쓰기 안하면 안나옴
		jb4.setBackground(Color.CYAN); // 색 버튼에 색 넣기
		jb5 = new JButton(" "); // 띄어쓰기 안하면 안나옴
		jb5.setBackground(Color.MAGENTA); // 색 버튼에 색 넣기
		jb6 = new JButton(" "); // 띄어쓰기 안하면 안나옴
		jb6.setBackground(Color.YELLOW); // 색 버튼에 색 넣기
		
		jb7 = new JButton("clear"); // 지우기 버튼
		
		jcom = new JComboBox<String>(iteams);
		
		jp.add(jb1);
		jp.add(jb2);
		jp.add(jb3);
		jp.add(jb4);
		jp.add(jb5);
		jp.add(jb6);
		jp.add(jb7);
		jp.add(jcom);
		
		add(jp, BorderLayout.NORTH); // 북쪽에 배치
		add(ct, BorderLayout.CENTER); // 캔버스는 중간
		
		// 화면크기 구함
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		// 창이 뜨는 위치를 지정 (화면 중간에 창을 보이게 하자)
		setBounds(ds.width/2-300, ds.height/2-300, 600, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		
		// 버튼 클릭시 색 변하게 하기
		jb1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				color = Color.RED;
			}
		});
		jb2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				color = Color.GREEN;
			}
		});
		jb3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				color = Color.BLUE;
			}
		});
		jb4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				color = Color.CYAN;
			}
		});
		jb5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				color = Color.MAGENTA;
			}
		});
		jb6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				color = Color.YELLOW;
			}
		});
		jb7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ct.removeNotify();
				ct.addNotify();
				x = -5;
				y = -5;
				wh = 5;
				// 크기 지정
				jcom.setSelectedIndex(0);
			}
		});
		jcom.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == e.SELECTED) { // 선택한 숫자의 대한 결과 
					switch ((String)e.getItem()) {
					case "5": wh = 5; break;
					case "10": wh = 10; break;
					case "15": wh = 15; break;
					case "20": wh = 20; break;
					case "25": wh = 25; break;
					case "30": wh = 30; break;
					}
				}
			}
		});
		ct.addMouseMotionListener(new MouseAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				x = e.getX();
				y = e.getY();
				ct.repaint();
			}
		});
	}
	
	// 내부클래스
	private class CanvasTest extends Canvas{ // 도화지
		@Override
		public void paint(Graphics g) {
			g.setColor(color); // 색
			g.fillOval(x, y, wh, wh); // x,y,넓이,높이
		}
		
		@Override
			public void update(Graphics g) {
				paint(g);
			}
	}
	
	public static void main(String[] args) {
		new Ex02_Paint();
	}
}
