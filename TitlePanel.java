import com.sun.tools.javac.Main;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class TitlePanel extends JPanel{
    private static final long seriaVersionUID = 1L;
    // コンポーネント
    JLabel title;
    JLabel start;
    JLabel exit;
    JLabel select;
    JLabel message;
    Menu checkMenu = Menu.START;
    Border border = BorderFactory.createLineBorder(Color.BLACK,2);
    MyKeyListener myKeyListener;

    //列挙型
    public enum Menu {
        START,
        EXIT,
    }






    // コンストラクタ
    TitlePanel() {
        this.setLayout(null);
        this.setBackground((Color.cyan));
        //その他設定はここ

    }

    public void prepareComponetnts(){
        title = new JLabel();
        title.setHorizontalAlignment(SwingConstants.CENTER);
        title.setVerticalAlignment(SwingConstants.BOTTOM);
        title.setText("Created by {YOUR NAME}");
        title.setHorizontalTextPosition(JLabel.CENTER);
        title.setVerticalTextPosition(SwingConstants.BOTTOM);
        title.setBounds(90, 0, 600, 350);
        title.setBorder(border);//いらないかも

        start = new JLabel();
        start.setText("START");
        start.setFont(new Font("MV boli",Font.BOLD,40));
        start.setHorizontalTextPosition(JLabel.CENTER);
        start.setVerticalTextPosition(JLabel.BOTTOM);
        start.setBounds(330,400,150,40);
        start.setBorder(border);

        exit = new JLabel();
        exit.setText("EXIT");
        exit.setFont(new Font("MV　boli",Font.BOLD,40));
        exit.setHorizontalTextPosition(JLabel.CENTER);
        exit.setVerticalTextPosition(JLabel.BOTTOM);
        exit.setBounds(350,450,110,40);
        exit.setBorder(border);

        select = new JLabel();
        select.setBackground(Color.BLUE);
        select.setOpaque(true);
        select.setBounds(280,400,40,40);
        select.setBorder(border);

        message = new JLabel();
        message.setHorizontalAlignment(SwingConstants.CENTER);
        message.setText("選択↑↓　　決定SPACE");
        message.setVerticalTextPosition(JLabel.CENTER);
        message.setHorizontalTextPosition(JLabel.CENTER);
        message.setBounds(249,517,300,30);
        message.setBorder(border);

        //配置
        this.setLayout(null);
        this.add(title);
        this.add(start);
        this.add(exit);
        this.add(select);
        this.add(message);

        //リスナーの設定
        myKeyListener = new MyKeyListener(this);

    }
    private class MyKeyListener implements KeyListener {
        TitlePanel panel;

        MyKeyListener(TitlePanel p) {
            super();
            panel = p;
            p.addKeyListener(this);
        }

        @Override
        public void keyTyped(KeyEvent e) {
            //do nothing
        }

        @Override
        public void keyReleased(KeyEvent e) {
            // do nothing
        }

        @Override
        public void keyPressed(KeyEvent e) {
            switch (e.getKeyCode()) {
                case KeyEvent.VK_DOWN:
                    if (checkMenu == Menu.START) {
                        select.setLocation(select.getX(), select.getY() + 50);
                        checkMenu = Menu.EXIT;
                    }
                    break;
                case KeyEvent.VK_UP:
                    if (checkMenu == Menu.EXIT) {
                        select.setLocation(select.getX(), select.getY() - 50);
                        checkMenu = Menu.START;
                    }
                    break;
                case KeyEvent.VK_SPACE:
                    if (checkMenu == Menu.START) {
                        MainAPP.mainWindow.setFrontScreenAndFocus(ScreenMode.GAME);
                    } else if (checkMenu == Menu.EXIT) {
                        System.exit(0);
                    }
                    break;
            }
        }
    }


}
