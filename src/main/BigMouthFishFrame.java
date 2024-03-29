/**
  * @(#)main.BigMonthFishFrame.java  2008-7-31  
  * Copy Right Information	: Tarena
  * Project					: main
  * JDK version used		: jdk1.6.4
  * Comments				: 此处输入简单类说明
  * Version					: 1.0
  * Sr	Date		Modified By		Why & What is modified
  * 1.	2008-7-31 	小猪     		新建
  **/
package main;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import fish.FishPool;

 /**
 * 大嘴鱼洁面类。完成大嘴鱼的界面的绘制。
 * 2008-7-31
 * @author		达内科技[Tarena Training Group]
 * @version	1.0
 * @since		JDK1.6(建议) 
 * @author		Administrator
 */
public class BigMouthFishFrame extends JFrame{

	private FishPool pool = null;
	
	public static int width = 800;
	public static int height = 600;
	
	private JLabel lblInfo = new JLabel("欢迎进入大嘴鱼!V1.0");
	
	private JLabel lblFishSize = new JLabel("鱼 的 大 小:");
	private JLabel lblFishSpeed = new JLabel("鱼 的 速 度:");
	private JLabel lblFishScore = new JLabel("现 在 得  分:");
	
	public static JLabel lblSize = new JLabel("50");
	public static JLabel lblSpeed = new JLabel("4");
	public static JLabel lblScore = new JLabel("0");
	
	private JTextArea txtInfo = new JTextArea();
	
	
	public BigMouthFishFrame() {
		
		
		
		
		
		
		
		pool = new FishPool();
		pool.setBorder(new EtchedBorder(EtchedBorder.RAISED));
		
		setTitle("大嘴鱼游戏");
		setSize(width+180,height+50);
		setResizable(false);
		Toolkit tk=Toolkit.getDefaultToolkit();
		setLocation((tk.getScreenSize().width-getSize().width)/2,(tk.getScreenSize().height-getSize().height)/2);
		
		lblInfo.setSize(150,20);
		lblInfo.setLocation(width+25,240);
		
		String str = "    大嘴鱼游戏的简单使用说明：使用键盘上的上、下、左、右控制大嘴鱼的方向，每吃1条小鱼，得分加1分。每吃10条小鱼，大嘴鱼将升级：大小加1，速度加2。\n\n";
		
		
		txtInfo.append(str);
		txtInfo.setBackground(getBackground());
		txtInfo.setEditable(false);
		txtInfo.setLineWrap(true);
		txtInfo.setSize(150,240);
		txtInfo.setLocation(width+15,370);
		txtInfo.setBorder(new TitledBorder(new LineBorder(Color.GRAY),"游戏说明"));
		
		
		JPanel pan = new JPanel();
		pan.setSize(150,100);
		pan.setLocation(width+15,265);
		pan.setLayout(new FlowLayout(FlowLayout.CENTER,5,5));
		pan.setBorder(new TitledBorder(new LineBorder(Color.GRAY),"游戏积分"));
		pan.add(lblFishSize);
		pan.add(lblSize);
		pan.add(lblFishSpeed);
		pan.add(lblSpeed);
		pan.add(lblFishScore);
		pan.add(lblScore);
		
		
		setLayout(null);
		add(pool);
		add(lblInfo);
		add(pan);
		add(txtInfo);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new BigMouthFishFrame();
	}

}
