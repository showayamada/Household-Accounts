import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {
    private static final long serialVersionUID = 1L;
    // フィールド
    ScreenMode screenMode = ScreenMode.TITLE;
    // 定数
    final int WIDTH = 800;
    final int HEIGHT = 600;
    //レイアウト
    CardLayout layout = new CardLayout();
    // コンポーネント
    TitlePanel titlePanel;
    GamePanel gamePanel;
    // コンストラクタ
    MainWindow(){
        // ウィンドウの左上のアイコンとタイトル
        this.setTitle("Title");
        //ImageIcon icon = new ImageIcon(getClass().getClassLoader().getResource("hoge.png"));
        //this.setIconImage(icon.getImage());

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.getContentPane().setBackground(Color.green);
        this.setLayout(layout);
        this.setPreferredSize(new Dimension(WIDTH,HEIGHT));
        this.pack();
        this.setLocationRelativeTo(null);
    }

    public void preparePanels(){
        titlePanel = new TitlePanel();
        this.add(titlePanel, "タイトル画面");
        gamePanel = new GamePanel();
        this.add(gamePanel, "ゲーム画面");
        this.pack();
    }

    public void prepareComponents(){
        titlePanel.prepareComponetnts();
        gamePanel.prepareComponents();
    }

    // スクリーンモードを切り替える
    public void setFrontScreenAndFocus(ScreenMode s) {
        screenMode = s;
        switch(screenMode) {
            case TITLE:
                layout.show(this.getContentPane(), "タイトル画面");
                titlePanel.requestFocus();
                break;
            case GAME:
                layout.show(this.getContentPane(), "ゲーム画面");
                gamePanel.requestFocus();
                break;
        }
    }


}
