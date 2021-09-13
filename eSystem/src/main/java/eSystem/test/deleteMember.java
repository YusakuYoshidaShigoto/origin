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
//
//public class deleteMember {
//
//	/**
//	 * @param args
//	 */
//	public static void main(String[] args) {
//		Connection   con = null;
//
//		// データベースに接続する。
//		try {
//			con = ConnectionManager.getConnection();
//		} catch (SQLException e) {
//			System.out.println("データベースへの接続に失敗しました。");
//			e.printStackTrace();
//		}
//
//		try {
//			//★ ヒント
//			// コンソール画面に入力されたメンバーコードを取得する
//			// getConsoleを使う。表示するメッセージ　"削除する従業員のメンバーコードを入力してください。";
//			// 入力した内容を出力。表示するメッセージ　"入力内容：" + 入力したメンバーコード
//
//			//★ ヒント
//			// メンバー情報を格納するオブジェクトを生成する
//			// Member member = ???
//
//			//★ ヒント
//			// メンバーDAOのオブジェクトを生成する
//			// MemberDAO memberDAO  = ???
//
//			//★ ヒント
//			// メンバーの削除を行う。結果をresultに格納する
//			boolean result = false;
//			// result = memberDAO.???
//
//			System.out.println("＜メンバー削除＞");
//
//			if (result == false) {
//				// 削除に失敗した場合
//				System.out.println("入力されたメンバーコードは存在しません。");
//			}else {
//				//★ ヒント
//				// 削除に成功した場合
//				// 表示するメッセージ "メンバーコード ：" + メンバーコード
//				// System.out.println("メンバーコード ：" + ???
//			}
//
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
