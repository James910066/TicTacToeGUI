import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Base64;

public class TicTacToeFrame extends JFrame implements ActionListener {
    private JPanel mainPanel;
    private JPanel boardPanel;
    private JPanel bottomBtnPanel;
    private JPanel messagePanel;
    private JPanel iconPanel;
    private JOptionPane JOPane;
    private ImageIcon icon;
    private JScrollPane scroller;
    private JTextArea displayTA;
    private JLabel titleLbl;

    private JButton A1btn;
    private JButton A2btn;
    private JButton A3btn;
    private JButton B1btn;
    private JButton B2btn;
    private JButton B3btn;
    private JButton C1btn;
    private JButton C2btn;
    private JButton C3btn;

    private JButton quitBtn;
    private JButton onePlayerBtn;
    private JButton twoPlayerBtn;

    public TicTacToeFrame() {
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
        setSize(screenWidth / 2, screenHeight / 2);
        setLocation(screenWidth / 4, screenHeight / 4);

        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        // Create and add icon panel
        createIconPanel();
        mainPanel.add(iconPanel, BorderLayout.NORTH);

        createMessagePanel();
        mainPanel.add(messagePanel, BorderLayout.CENTER);

        createBottomBtnPanel();
        mainPanel.add(bottomBtnPanel, BorderLayout.SOUTH);

        createBoardPanel();
        mainPanel.add(boardPanel, BorderLayout.NORTH);

        add(mainPanel);
        setSize(800, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void createMessagePanel() {
        messagePanel = new JPanel();
        displayTA = new JTextArea(33, 75);
        scroller = new JScrollPane(displayTA);
        messagePanel.add(scroller);
    }

    private void createBottomBtnPanel() {
        bottomBtnPanel = new JPanel();
        bottomBtnPanel.setLayout(new GridLayout(1, 3));
        onePlayerBtn = new JButton("1 Player"); //Player vs Computer
        twoPlayerBtn = new JButton("2 Player"); //Human vs Human
        quitBtn = new JButton("Quit");
        bottomBtnPanel.add(onePlayerBtn);
        bottomBtnPanel.add(twoPlayerBtn);
        bottomBtnPanel.add(quitBtn);
        quitBtn.addActionListener((ActionEvent ae) -> System.exit(0));
    }
    private void createBoardPanel()
    {
        boardPanel = new JPanel();
        boardPanel.setLayout(new GridLayout(3,3));
        A1btn = new JButton("");
        A1btn.setPreferredSize(new Dimension(10,150));
        A2btn = new JButton("");
        A2btn.setPreferredSize(new Dimension(10,150));
        A3btn = new JButton("");
        A3btn.setPreferredSize(new Dimension(10,150));
        B1btn = new JButton("");
        B1btn.setPreferredSize(new Dimension(10,150));
        B2btn = new JButton("");
        B2btn.setPreferredSize(new Dimension(10,150));
        B3btn = new JButton("");
        B3btn.setPreferredSize(new Dimension(10,150));
        C1btn = new JButton("");
        C1btn.setPreferredSize(new Dimension(10,150));
        C2btn = new JButton("");
        C2btn.setPreferredSize(new Dimension(10,150));
        C3btn = new JButton("");
        C3btn.setPreferredSize(new Dimension(10,150));

        boardPanel.add(A1btn);
        boardPanel.add(A2btn);
        boardPanel.add(A3btn);
        boardPanel.add(B1btn);
        boardPanel.add(B2btn);
        boardPanel.add(B3btn);
        boardPanel.add(C1btn);
        boardPanel.add(C2btn);
        boardPanel.add(C3btn);

    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }

    private void createIconPanel() {
        icon = new ImageIcon("Player X.jpg");
        titleLbl = new JLabel("Tic Tac Toe", icon, JLabel.CENTER);
        titleLbl.setVerticalTextPosition(JLabel.BOTTOM);
        titleLbl.setHorizontalTextPosition(JLabel.CENTER);

        iconPanel = new JPanel();
        iconPanel.add(titleLbl);
        setVisible(true);
    }


}
