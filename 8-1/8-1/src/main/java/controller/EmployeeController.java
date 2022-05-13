//↓クラスファイルの集まりを示すもの。　パッケージを使用することで複数のクラスファイルを分類し、管理する事ができる。
package controller;
 
/**
 * 社員情報管理コントローラー
 */
 
//↓他のパッケージに記入されているクラスや関数を実行するための方法。
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.EmployeeService;
 
　//　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　
public class EmployeeController extends HttpServlet {
 public void doPost(HttpServletRequest request, HttpServletResponse response)
 throws ServletException, IOException {
 
 try {
  // HTTPメソッド　パラメーター　データの受け渡し
 String id = request.getParameter("id");
 String password = request.getParameter("password");
 
 /*
 * IDとPassWordと元に、社員情報を検索する関数の呼び出し、結果をJSPに渡す処理
 * ※ EmployeeBeanとEmployeeServiceをimportするのを忘れないでください。
 */
 
  // ↓インスタンス時に実行されるメソッド=コンストラクタ
 EmployeeService es = new EmployeeService();
  // EmployeeServiceよりsearch関数を呼び出し、返り値を格納する。
 EmployeeBean emp = es.search(id , password);
  // emp=search関数からの戻り値を代入
 request.setAttribute("EmployeeBean", emp);
 
  //↓発生した例外をキャッチ。複数記述可能。
 } catch (Exception e) {
 e.printStackTrace();
  //↓例外が起きても起きなくても、最後に必ずしなければならない処理
 } finally {
 ServletContext context = this.getServletContext();
 RequestDispatcher dispatcher = context.getRequestDispatcher("/index.jsp");
 dispatcher.forward(request, response);
 }
 }
}
