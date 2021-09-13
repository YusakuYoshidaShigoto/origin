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
//public class insertMember {
//
//	/**
//	 * @param args
//	 */
//	public static void main(String[] args) {
//		Connection   con = null;
//
//		// 引数の数をチェックする
//		if(args.length != 11)
//	    {
//	        System.out.println("引数を１１個設定してください。");
//	        System.exit(1);
//	    }
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
//			// ★
//			// 引数の値を変数に格納する
//			//String memberCode = // ★引数1番目
//			//String memberName = // ★引数2番目
//			//String password = // ★引数3番目
//			//String role = // ★引数4番目
//			//String mail = // ★引数5番目
//			//String zipCode = // ★引数6番目
//			//String prefecture = // ★引数7番目
//			//String address = // ★引数8番目
//			//String tel = // ★引数9番目
//			//int years = Integer.parseInt(// ★引数10番目);
//			//String departmentCode = // ★引数11番目;
//
//			// ★
//			// メンバー情報を格納するオブジェクトを生成する
//			//Member member = new Member(memberCode, role, ...???
//
//			// ★
//			// メンバーDAOのオブジェクトを生成する
//			//MemberDAO memberDAO  = ???
//
//			// ★
//			// メンバーコードでメンバー検索(引数はメンバーコード)を行い、メンバーが存在しているか確認する
//			//Member findMember= memberDAO.???  findMemberに検索結果が入る
//
//			// ★
//			// 既に登録済みのメンバーコードの場合は、メッセージ表示
//			//if (findMember != null) {
//				//System.out.println("既に登録済みのメンバーコードです。登録をやり直して下さい。");
//			//}else {
//				//★
//				// メンバー登録（追加）
//				//memberDAO.???
//
//				// ★
//				// 登録結果を出力する
//				System.out.println("＜メンバー登録＞");
//				System.out.println("メンバーコード ：" + "");/*★MemberCode*/
//				System.out.println("メンバー名     ：" + "");/*★MemberName*/
//				System.out.println("パスワード     ：" + "");/*★Password*/
//				System.out.println("権限           ：" + "");/*★Role*/
//				System.out.println("メールアドレス ：" + "");/*★Mail*/
//				System.out.println("郵便番号       ：" + "");/*★ZipCode*/
//				System.out.println("都道府県       ：" + "");/*★Prefecture*/
//				System.out.println("住所           ：" + "");/*★Address*/
//				System.out.println("電話番号       ：" + "");/*★Tel*/
//				System.out.println("在籍年数       ：" + Integer.toString(0/*★Years*/) + "年");
//				System.out.println("部署コード     ：" + "");/*★DepartmentCode*/
//			//}
//
//		// データベース接続が無効な状態(テーブル削除）で、MemberDAOオブジェクトの引数に指定した場合、NullPointerExceptionが発生する
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
//	}
//}
