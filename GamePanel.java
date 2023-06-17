import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GamePanel extends JPanel {

    private static final long seriaVersionUID = 1L;
    //レイアウト
    BorderLayout layout = new BorderLayout();
    //コンポーネント
    MenuBar menuBar;
    FieldPanel fieldPanel;
    //リスナー
    MyKeyListener myKeyListener;

    JLabel gameLabel;
    GamePanel(){
        this.setLayout(layout);
        this.setBackground(Color.yellow);
        //パネル生成と設置
        menuBar = new MenuBar();
        fieldPanel = new FieldPanel();
        this.add(menuBar,BorderLayout.NORTH);
        this.add(fieldPanel,BorderLayout.CENTER);

    }
    public void prepareComponents() {
        menuBar.prepareComponents();
        fieldPanel.prepareComponents();
        myKeyListener = new MyKeyListener(this);
    }

    private class MyKeyListener implements KeyListener {
        JPanel panel;
        MyKeyListener(JPanel p) {
            super();
            panel = p;
            panel.addKeyListener(this);
        }
        @Override
        public void keyTyped(KeyEvent e) {
            //do nothing
        }
        @Override
        public void keyReleased(KeyEvent e) {
            //do nothing
        }
        @Override
        public void keyPressed(KeyEvent e){
            switch(e.getKeyCode()){
                case KeyEvent.VK_H:
                    MainAPP.mainWindow.setFrontScreenAndFocus(ScreenMode.TITLE);
                    break;
            }
        }
    }

}
