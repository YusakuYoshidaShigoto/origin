///************************************************************************************
// *
// * メンバー管理  テスト用ドライバ
// *
// *
// * 		@author
// * 		@version	1.0
// *
// ************************************************************************************/
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
//public class findMemberList {
//	/**
//	 * @param args
//	 */
//	public static void main(String[] args) {
//
//		// データベースに接続する。
//		Connection   con = null;
//		try {
//			con = ConnectionManager.getConnection();
//		} catch (SQLException e) {
//			System.out.println("データベースへの接続に失敗しました。");
//			e.printStackTrace();
//		}
//
//		try {
//			// ★
//			// メンバーDAOのオブジェクトを生成する
//			// MemberDAO memberDAO  = ???
//
//			// ★
//			// メンバー型のアレイリスト memberListオブジェクト生成する。初期値はnull
//			// ArrayList<Member> memberList
//
//			// ★
//			// メンバーDAOのfindMemberListメソッドを呼び出してメンバーリスト検索を行う
//			// memberList = memberDAO.???
//
//			// ★
//			// 検索結果がない場合、メッセージを表示する
//			//if (memberList.size() == 0) {
//			//	System.out.println("データベースにメンバーが存在しません。");
//			//}
//
//			// 検索結果を出力する
//			System.out.println("＜メンバー全件検索＞");
//			System.out.println("Code  ｜Name      ｜Pass ｜Role    ｜Mail                            ｜Post      ｜Pref.  ｜Address 　　｜Tel          ｜Years｜D-Code｜");
//			// ★ memberListから1件ずつmemberオブジェクトを取り出して出力する
//			//for ( Member member : memberList) {
//				//System.out.printf("%6s｜%6s｜%5s｜%8s｜%32s｜%10s｜%4s｜%6s｜%13s｜%5s｜%6s｜%n",
//						/* ★ メンバーコード getMemberCode */
//						/* ★ 名前 */
//						/* ★Password */
//						/* ★Role*/
//						/* ★Mail*/
//						/* ★ZipCode*/
//						/* ★Prefecture*/
//						/* ★Address*/
//						/* ★Tel*/
//						//Integer.toString(/* ★Years*/),
//						/* ★DepartmentCode*/
//				//);
//				//System.out.println("");// printf(.. %n )で改行するか、または、ここで改行する
//			//}
//
//		} catch (NullPointerException e) {
//			System.out.println("NullPointerExceptionがスローされました。");
//			e.printStackTrace();
////★ ヒント try内を実装すると必要になる
////		} catch (SQLException e) {
////			System.out.println("SQLExceptionがスローされました。");
////			e.printStackTrace();
//		} finally {
//			try {// データベースへの接続を切断する
//				con.close();
//			} catch(SQLException e) {
//				e.printStackTrace();
//			}
//		}
//
//	}
//
//}
