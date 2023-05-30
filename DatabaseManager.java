import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class DatabaseManager {
    private Connection connection;
    // MySQLの接続情報
    private String url = "jdbc:mysql://localhost:3306/household_db";
    private String username = "root";
    private String password = "root";

    public void connect() throws SQLException {
        connection = DriverManager.getConnection(url, username, password);

    }

    public void disconnect() throws SQLException {
        if (connection != null) {
            connection.close();
        }
    }

    public void insertExpense(Expense expence) {
        // 支出をデータベースに追加する

    }

    public void deleteExpense(Expense expence) {
        // データベースから削除
    }

   // public List<Expense> getExpensesByUser(User user) {
        // ユーザ毎のししゅつをデータベースから取得する
        // expensesリストに取得した支出を追加
      //  return
    //}
}
