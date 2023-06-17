import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MainPanel extends JPanel {
    private static final long serialVersionUID = 1l;
    Color backgroundColor = Color.green;
    //コンポーネント
  //  CatLabel catLabel;
    // リスナー
//    MyKeyListener myKeyListener;

    // コンストラクタ
    MainPanel(){
        this.setLayout(null);
        this.setBackground(backgroundColor);
    }
//    public void prepareComponents(){
//        catLabel = new CatLabel();
//        this.add(catLabel);
//        myKeyListener = new MyKeyListener(this);
//    }

    // 内部クラス
//    private class MyKeyListener implements KeyListener {
//        MainPanel panel;
//        MyKeyListener(MainPanel p){
//            super();
//            panel = p;
//            p.addKeyListener(this);
//        }
//        @Override
//        public void keyTyped(KeyEvent e) {
//            //do nothing
//        }
//        @Override
//        public void keyReleased(KeyEvent e) {
//            // do nothing
//        }
//    }
}
