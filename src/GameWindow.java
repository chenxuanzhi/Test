import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.border.EtchedBorder;

public class GameWindow extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	JMenuBar bar;
	JMenu menuGame,menuHelp;
	JMenu menuImage;
	JMenu menuResult;
	JMenuItem oneGradeItem;
	JMenuItem twoGradeItem;
	JMenuItem musicItem,exitItem;
	JMenuItem qqImage,flowerImage,catImage,loadOtherImage;
	JMenuItem oneGradeResult,twoGradeResult;
	JMenuItem gameDescription;
	private PuzzlePanel puzzlePanel;
	private int row = 3,column = 3;
	ControlGamePanel controlPanel;
	JPanel messagePanel,imagePanel;
	private JLabel playerName,usedStep;
	
	public GameWindow() {
		super("拼图小游戏");
		bar = new JMenuBar();
		setJMenuBar(bar);
		menuGame = new JMenu("游戏");
		menuHelp = new JMenu("帮助");
		
		bar.add(menuGame);
		bar.add(menuHelp);
		menuImage = new JMenu("图片选择");
		this.qqImage = new JRadioButtonMenuItem("QQ图片",true);
		this.qqImage.addActionListener(this);
		this.flowerImage = new JRadioButtonMenuItem("花图片");
		this.flowerImage.addActionListener(this);
		this.catImage = new JRadioButtonMenuItem("猫图片");
		this.catImage.addActionListener(this);
		this.loadOtherImage = new JRadioButtonMenuItem("从本地选择图片");
		this.loadOtherImage.addActionListener(this);
		ButtonGroup group1 = new ButtonGroup();
		group1.add(qqImage);
		group1.add(flowerImage);
		group1.add(catImage);
		menuImage.add(qqImage);
		menuImage.add(flowerImage);
		menuImage.add(catImage);
		menuImage.addSeparator();
		menuImage.add(loadOtherImage);
		oneGradeItem = new JMenuItem("普通级别3*3");
		this.oneGradeItem.addActionListener(this);
		twoGradeItem = new JMenuItem("高级级别4*4");
		this.twoGradeItem.addActionListener(this);
		ButtonGroup group2 = new ButtonGroup();
		group2.add(oneGradeItem);
		group2.add(twoGradeItem);
		musicItem = new JMenuItem("背景音乐播放控制");
		this.musicItem.addActionListener(this);
		menuResult = new JMenu("查看排行榜");
		this.oneGradeResult = new JMenuItem("普通级别排行");
		this.oneGradeResult.addActionListener(this);
		this.twoGradeResult = new JMenuItem("高级级别排行");
		this.twoGradeResult.addActionListener(this);
		this.menuResult.add(this.oneGradeResult);
		this.menuResult.add(this.twoGradeResult);
		exitItem = new JMenuItem("退出");
		this.exitItem.addActionListener(this);
		menuGame.add(this.menuImage);
		menuGame.addSeparator();
		menuGame.add(this.oneGradeItem);
		menuGame.add(this.twoGradeItem);
		menuGame.addSeparator();
		menuGame.add(this.musicItem);
		menuGame.addSeparator();
		menuGame.add(this.menuResult);
		menuGame.addSeparator();
		menuGame.add(this.exitItem);
		this.gameDescription = new JMenuItem("游戏说明");
		this.gameDescription.addActionListener(this);
		this.menuHelp.add(this.gameDescription);
		messagePanel = new JPanel();
		messagePanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		messagePanel.add(new JLabel("当前玩家"));
		playerName = new JLabel(" ");
		playerName.setOpaque(true);
		playerName.setBackground(Color.YELLOW);
		messagePanel.add(playerName);
		messagePanel.add(new JLabel("您完成游戏所走过的步数: "));
		usedStep = new JLabel("0");
		usedStep.setOpaque(true);
		usedStep.setBackground(Color.yellow);
		messagePanel.add(usedStep);
		puzzlePanel = new PuzzlePanel(this);
		puzzlePanel.initPanel();
		imagePanel = new JPanel();
		imagePanel.setBackground(Color.white);
		imagePanel.setBorder(new EtchedBorder());
		imagePanel.setPreferredSize(new Dimension(190, Cell.HEIGHT * row +120));
		controlPanel =new ControlGamePanel(this);
		add(messagePanel,BorderLayout.NORTH);
		add(puzzlePanel,BorderLayout.CENTER);
		add(imagePanel,BorderLayout.EAST);
		add(controlPanel,BorderLayout.SOUTH);
		setLocation(50,50);
		this.setSize(new Dimension(Cell.WIDTH * column + 200,Cell.HEIGHT * row + 128));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(true);
		validate();
		
		
		this.setSize(400,350);
		this.setVisible(true);
		setLocationRelativeTo(null);
	}

	
	private void add(ControlGamePanel controlPanel2, String south) {
		// TODO Auto-generated method stub
		
	}


	private void add(PuzzlePanel puzzlePanel2, String center) {
		// TODO Auto-generated method stub
		
	}


	public void actionPerformed(ActionEvent arg0) {
		
	}
	public static void main(String[] args) {
		new GameWindow();
		
	}

	
}
