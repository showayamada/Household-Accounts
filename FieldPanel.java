import javax.swing.*;
import java.awt.*;

public class FieldPanel extends JPanel {
    private static final long serialVersionUID = 1L;
    JLabel gameLabel;
    // コンストラクト
    public FieldPanel(){
        this.setBackground(Color.orange);
        this.setLayout(null);
    }

    public void prepareComponents() {
        // コンポーネント
        gameLabel = new JLabel();
        gameLabel.setText("ゲーム画面");
        gameLabel.setBounds(0,0,100,30);
        gameLabel.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        this.add(gameLabel);
    }
}
