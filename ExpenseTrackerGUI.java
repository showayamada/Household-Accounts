import javax.swing.*;
import java.awt.*;
import java.util.List;

public class ExpenseTrackerGUI {
    private JFrame frame;
    private JTable expenseTable;

    public void createAndShowGUI() {
        frame = new JFrame("Expense Tracker");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // GUIコンポーネントの作成と配置

        // 支出テーブルの作成
        expenseTable = new JTable();
        JScrollPane scrollPane = new JScrollPane(expenseTable);
        frame.add(scrollPane, BorderLayout.CENTER);

        frame.pack();
        frame.setVisible(true);
    }

    public void updateExpenseTable(List<Expense> expenses) {
        // 支出テーブルを更新する処理を実装する
        // expensesを使用してテーブルデータを更新する
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                ExpenseTrackerGUI gui = new ExpenseTrackerGUI();
                gui.createAndShowGUI();
            }
        });
    }
}

