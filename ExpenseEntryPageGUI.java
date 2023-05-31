import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExpenseEntryPageGUI {
    private JFrame frame;
    private JTextField amountField;
    private JTextField descriptionField;
    private JTextArea resultTextArea;

    public void createAndShowGUI() {
        frame = new JFrame("Expense Tracker - Expense Entry");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(4, 2));

        JLabel amountLabel = new JLabel("Amount:");
        JLabel descriptionLabel = new JLabel("Description:");
        amountField = new JTextField(20);
        descriptionField = new JTextField(20);
        JButton submitButton = new JButton("Submit");
        resultTextArea = new JTextArea(10, 30);
        resultTextArea.setEditable(false);

        panel.add(amountLabel);
        panel.add(amountField);
        panel.add(descriptionLabel);
        panel.add(descriptionField);
        panel.add(new JLabel());
        panel.add(submitButton);
        panel.add(new JScrollPane(resultTextArea));

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);

        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String amount = amountField.getText();
                String description = descriptionField.getText();

                // 支出登録処理を実行する（ここでは単純に結果を表示するだけ）
                String result = "Submitted expense: Amount=" + amount + ", Description=" + description;
                resultTextArea.append(result + "\n");
            }
        });
    }
}
