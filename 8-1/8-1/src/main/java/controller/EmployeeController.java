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
 
　                              //↓元クラスをベースにして、同じ定義は省略する。（違いだけを記述する）　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　
public class EmployeeController extends HttpServlet {

 /*「GET」メソッドはクライアントからページの要求を行う場合に使われます。直接サーブレット名をURLに指定して表示したりリンクに設定されたサーブレットをクリックした場合には「GET」を使ってリクエストが来ます。
   またフォームにおいて送信方法に「GET」を使った場合にも「GET」メソッドが使われます。
   「POST」メソッドはクライアントがWebブラウザ上で入力した内容をサーバ側に送信するために使用するメソッド。主にフォームにおいて送信方法に「POST」を指定した場合に使われます。
 */
                    //↓HTTPリクエストに対応　　　　　　　　　　　　　　　　　　　　↓HTTPレスポンスに対応
 public void doPost(HttpServletRequest request, HttpServletResponse response)
 throws ServletException, IOException {
 
 try {
  // HTTPメソッド　パラメーター　データの受け渡し　　ユーザーからの情報をパラーメータとして受け取る(リクエストパラメータとは、フォームから送られてきたデータ)
 String id = request.getParameter("id");
 String password = request.getParameter("password");
 
 /*
 * IDとPassWordと元に、社員情報を検索する関数の呼び出し、結果をJSPに渡す処理
 * ※ EmployeeBeanとEmployeeServiceをimportするのを忘れないでください。
 */
 
  // ↓インスタンス時に実行されるメソッド=コンストラクタ
 EmployeeService es = new EmployeeService();
  // EmployeeServiceよりsearch関数を呼び出し、戻り値を格納する。（ユーザー情報をもとに、社員情報の照会をする必要があるため、EmployeeService の search メソッドを呼び出す。）
  // 戻り値がEmployeeBean型のデータを渡しているので、変数に格納する
 EmployeeBean emp = es.search(id , password);
  // emp=search関数からの戻り値を代入(→jspで受け取る) リクエストスコープへ格納。第1引数にデータの名前、第2引数でデータを与える。
 request.setAttribute("EmployeeBean", emp);
 
  //↓発生した例外をキャッチ。複数記述可能。
 } catch (Exception e) {
  //↓実行したメソッドの時系列の一覧を出力。
 e.printStackTrace();
  //↓例外が起きても起きなくても、最後に必ずしなければならない処理
 } finally {
  //①EmployeeController　→　②dispatcher → ③index.jsp　　　(repuest,response をforward転送している。)
 ServletContext context = this.getServletContext();
 RequestDispatcher dispatcher = context.getRequestDispatcher("/index.jsp");
 dispatcher.forward(request, response);
 }
 }
}
