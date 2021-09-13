/************************************************************************************
 *
 * メンバー管理  テスト用ドライバ
 *
 *
 * 		@author
 * 		@version	1.0
 *
 ************************************************************************************/

package eSystem.test;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import eSystem.ConsoleInput;
import eSystem.dao.ConnectionManager;
import eSystem.dao.MemberDAO;
import eSystem.entity.Member;

//
//ヒントを参考に ★印 の箇所に実装する必要があります。
//
public class findMember1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Connection   con = null;

		// データベースに接続する。
		try {
			con = ConnectionManager.getConnection();
		} catch (SQLException e) {
			System.out.println("データベースへの接続に失敗しました。");
			e.printStackTrace();
		}

		// ここからテストを行う。
		try {
			// ★
			// コンソール画面に入力されたメンバーコードを取得する
			ConsoleInput ci = new ConsoleInput();
			String memberCode = ci.getConsole("検索する従業員のメンバーコードを入力してください。");
			// 表示するメッセージ　"検索する従業員のメンバーコードを入力してください。"

			// ★
	        // メンバーDAOのオブジェクトを生成する
			MemberDAO memberDAO  = new MemberDAO(con);

			// ★
			// メンバーDAOのメンバー検索メソッド(引数はメンバーコード)を呼び出してメンバー検索を行う
			Member member = memberDAO.findMember(memberCode);

			// 検索結果を出力する
			System.out.println("＜メンバー検索１＞");
			/* ★ 結果のオブジェクトがnull以外*/
			if (member != null) {
				System.out.println("メンバーコード ：" + member.getMemberCode());/* ★ メンバーコード */
				System.out.println("メンバー名     ：" + member.getMemberName());/* ★ 名前 */
				//System.out.println("パスワード     ：" + member.getPassword()); // パスワードは出力しない
				System.out.println("権限           ：" + member.getRole());/* ★ Role */
				System.out.println("メールアドレス ：" + member.getMail());/* ★ Mail */
				System.out.println("郵便番号       ：" + member.getZipCode());/* ★ ZipCode */
				System.out.println("都道府県       ：" + member.getPrefecture());/* ★ Prefecture */
				System.out.println("住所           ：" + member.getAddress());/* ★ Address */
				System.out.println("電話番号       ：" + member.getTel());/* ★ Tel */
				System.out.println("在籍年数       ：" + Integer.toString(member.getYears()) + "年");
			/* ★ 結果のオブジェクトがnull*/
			}
			else{
				System.out.println("入力されたメンバーコードが間違っています。");
			}
		} catch (NullPointerException e) {
			System.out.println("NullPointerExceptionがスローされました。");
			e.printStackTrace();
//★ ヒント try内を実装すると必要になる
		} catch (SQLException e) {
			System.out.println("SQLExceptionがスローされました。");
			e.printStackTrace();
//★ ヒント try内を実装すると必要になる
		} catch (IOException e) {
			System.out.println("IOExceptionがスローされました。");
			e.printStackTrace();
		} finally {
			try {// データベースへの接続を切断する
				con.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
