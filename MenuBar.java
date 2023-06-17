import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuBar extends JPanel{
    private static final long serialVersionUID = 1L;
    //コンポーネント
    JButton homeButton;
    JLabel homeLabel;
    HomeBottunListener homeBottunListener;

    public MenuBar() {
        this.setPreferredSize(new Dimension(100,40));
        this.setBackground(Color.red);
        this.setLayout(null);
    }
    public void prepareComponents() {
        homeButton = new JButton();
        homeButton.setBounds(5,5,80,30);
        homeButton.setText("HOME");
        homeButton.setFocusable(false);
        homeBottunListener = new HomeBottunListener();
        homeButton.addActionListener(homeBottunListener);

        homeLabel = new JLabel("click this button");
        homeLabel.setBounds(100,5,250,30);
        //homeLabel(BorderFactory.createEtchedBorder(3,Color.BLACK, Color.WHITE));

        this.add(homeButton);
        this.add(homeLabel);

    }
    //内部クラス（ホームボタンリスナー）
    private class HomeBottunListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e){
            //タイトル画面に戻る
            MainAPP.mainWindow.setFrontScreenAndFocus(ScreenMode.TITLE);
        }
    }
}
