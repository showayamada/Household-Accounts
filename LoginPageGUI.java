import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//public class LoginPageGUI extends JFrame implements ActionListener{
//    private JFrame frame;
//    private JTextField usernameField;
//    private JPasswordField passwordField;
//    private JTextArea resultTextArea;
//
//    private static final String ID = "admin";
//    private static final String PASSWORD = "pass";
//
//    private static final Dimension ITEM_SIZE = new Dimension(200,40);
//    private static final Dimension FIELD_SIZE = new Dimension(250,40);
//
//    private static final String TITLE = "Expense Tracker - Login";
//    private static final String SUB_TITLE = "login";
//    private static final String ICON = "hoge.jpg";
//    private static final int X_COORDINATE_SCREEN = 800;
//    private static final int Y_COORDINATE_SCREEN = 200;
//    private static final int WIDTH_SCREEN = 600;
//    private static final int HEIGHT_SCREEN = 400;
//
//    private static final boolean IS_RESIZABLE = true;
//
//
//
//    public void createAndShowGUI() {
//        frame = new JFrame(TITLE);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        JPanel panel = new JPanel(new GridLayout(4, 2));
//
//        JLabel usernameLabel = new JLabel("Username:");
//        JLabel passwordLabel = new JLabel("Password:");
//        usernameField = new JTextField(20);
//        passwordField = new JPasswordField(20);
//        JButton loginButton = new JButton("Login");
//        resultTextArea = new JTextArea(10, 30);
//        resultTextArea.setEditable(false);
//
//        panel.add(usernameLabel);
//        panel.add(usernameField);
//        panel.add(passwordLabel);
//        panel.add(passwordField);
//        panel.add(new JLabel());
//        panel.add(loginButton);
//        panel.add(new JScrollPane(resultTextArea));
//
//        frame.add(panel);
//        frame.pack();
//        frame.setVisible(true);
//
//        loginButton.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                String username = usernameField.getText();
//                String password = new String(passwordField.getPassword());
//
//                // ログイン処理を実行する（ここでは単純に結果を表示するだけ）
//                if (authenticate(username, password)) {
//                    resultTextArea.append("Login successful.\n");
//                    openExpenseEntryPage();
//                } else {
//                    resultTextArea.append("Login failed. Please try again.\n");
//                }
//            }
//        });
//    }
//
//    private boolean authenticate(String username, String password) {
//        // ログイン認証処理を実装する
//        // 実際の認証は、データベースやユーザーリストとの照合などを行います
//        // ここでは、簡単なユーザー名とパスワードの比較を行っています
//        return username.equals("admin") && password.equals("pass");
//    }
//
//    private void openExpenseEntryPage() {
//        frame.dispose();
//
//        ExpenseEntryPageGUI expenseEntryPage = new ExpenseEntryPageGUI();
//        expenseEntryPage.createAndShowGUI();
//    }
//
//    public static void main(String[] args) {
//        SwingUtilities.invokeLater(new Runnable() {
//            public void run() {
//                LoginPageGUI loginPage = new LoginPageGUI();
//                loginPage.createAndShowGUI();
//            }
//        });
//    }
//}

