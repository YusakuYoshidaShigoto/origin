///************************************************************************************
// *
// * メンバー管理  テスト用ドライバ
// *
// *
// * 		@author
// * 		@version	1.0
// *
// ************************************************************************************/
//
//package eSystem.test;
//
//import java.sql.Connection;
//import java.sql.SQLException;
//
//import eSystem.dao.ConnectionManager;
//
////
////ヒントを参考に ★印 の箇所に実装する必要があります。
////
//public class findMember2 {
//
//	/**
//	 * @param args
//	 */
//	public static void main(String[] args) {
//		Connection   con = null;
//
//		// テストのための準備としてデータベースに接続する。
//		try {
//			con = ConnectionManager.getConnection();
//		} catch (SQLException e) {
//			System.out.println("データベースへの接続に失敗しました。");
//			e.printStackTrace();
//		}
//
//		// ここからテストを行う。
//		try {
//			// ★
//			// コンソール画面に入力されたメンバーコードを取得する
//			// ConsoleInput ci = ???
//			// String memberCode = ??? getConsoleを使う。
//			// 表示するメッセージ　"検索する従業員のメンバーコードを入力してください。"
//
//			// ★
//			// コンソール画面に入力されたパスワードを取得する
//			// ci = new ???
//			// 表示するメッセージ　"パスワードを入力してください。"
//
//			// ★
//	        // メンバーDAOのオブジェクトを生成する
//			// MemberDAO memberDAO  = ???
//
//			// ★
//			// メンバーDAOのメンバー検索メソッド(引数はメンバーコード、パスワード)を呼び出してメンバー検索を行う
//			// Member member = memberDAO.???
//
//			// 検索結果を出力する
//			System.out.println("＜メンバー検索２＞");
//			/* ★ 結果のオブジェクトがnull以外*/
//			//if (member != null) {
//				System.out.println("メンバーコード ：" + "");/* ★ メンバーコード */
//				System.out.println("メンバー名     ：" + "");/* ★ 名前 */
//				System.out.println("部署コード     ：" + "");/* ★ DepartmentCode*/
//				System.out.println("部署名         ：" + ""); /* ★DepartmentName*/
//				//System.out.println("パスワード     ：" + member.getPassword()); // パスワードは出力しない
//				System.out.println("権限           ：" + "");/* ★ Role */
//				System.out.println("メールアドレス ：" + "");/* ★ Mail */
//				System.out.println("郵便番号       ：" + "");/* ★ ZipCode */
//				System.out.println("都道府県       ：" + "");/* ★ Prefecture */
//				System.out.println("住所           ：" + "");/* ★ Address */
//				System.out.println("電話番号       ：" + "");/* ★ Tel */
//			/* ★ 結果のオブジェクトがnull*/
//			//}else {
//			//	System.out.println("入力されたメンバーコードまたはパスワードが間違っています。");
//			//}
//		} catch (NullPointerException e) {
//			System.out.println("NullPointerExceptionがスローされました。");
//			e.printStackTrace();
////★ ヒント try内を実装すると必要になる
////		} catch (SQLException e) {
////			System.out.println("SQLExceptionがスローされました。");
////			e.printStackTrace();
////★ ヒント try内を実装すると必要になる
////		} catch (IOException e) {
////			System.out.println("IOExceptionがスローされました。");
////			e.printStackTrace();
//		} finally {
//			try {// データベースへの接続を切断する
//				con.close();
//			} catch(SQLException e) {
//				e.printStackTrace();
//			}
//		}
//	}
//}
