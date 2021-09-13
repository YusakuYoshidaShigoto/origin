/*
 * MemberDAO
 *
 * 役割
 * Memberテーブルへアクセスするメソッド定義
 * 主にSQL文を使ってMemberテーブルへアクセスする
 *
 * メンバー登録
 * メンバー削除
 * メンバー変更
 * メンバー個別検索
 * メンバー全件検索
 *
 *
 */
package eSystem.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import eSystem.entity.Member;



//
// ヒントを参考に ★印 の箇所に実装する必要があります。
//

public class MemberDAO {

	/** データベースの接続 */
	private Connection con;

	/**
	 * コンストラクタ
	 *
	 * @param con
	 *            データベースの接続
	 */
	public MemberDAO(Connection con) {
		this.con = con;
	}

	/**
	 * メンバーを検索する。
	 *
	 * @param memberCode
	 *            メンバーコード
	 * @return Member メンバー
	 * @throws SQLException
	 *             データベースエラーが発生した場合
	 */
	public Member findMember(String memberCode) throws SQLException {
		//★
		String sql = "SELECT MemberCode,Role,Name,Password,ZipCode,Prefecture,Address,Tel,Mail,Years,DepartmentCode FROM member WHERE MemberCode = ?";


		PreparedStatement stmt = null;
		ResultSet res = null;
		Member member = null;

		try {
			stmt = con.prepareStatement(sql);
			//★
			// ヒント：SQLのパラメータ１番目をセットする
			stmt.setString(1, memberCode);
			// ヒント：SQLを実行して結果をresに入れる
			res = stmt.executeQuery();

			//★
			// ヒント：ＳＱＬ実行結果を取得する
			if(res.next()) {
				member = new Member(res.getString("MemberCode"),res.getString("Role"),res.getString("Name"),
						res.getString("Password"),res.getString("ZipCode"),res.getString("Prefecture"),
						res.getString("Address"),res.getString("Tel"),res.getString("Mail"),res.getInt("Years"),res.getString("DepartmentCode"));
			}


		} finally {
			if (res != null) {
				res.close();
			}
			if (stmt != null) {
				stmt.close();
			}
		}

		return member;
	}

//	/**
//	 * メンバーを検索する。
//	 *
//	 * @param memberCode
//	 *            メンバーコード
//	 * @param password
//	 *            パスワード
//	 * @return Member メンバー
//	 * @throws SQLException
//	 *             データベースエラーが発生した場合
//	 */
//	public Member findMember(String memberCode, String password) throws SQLException {
//		//★
//		String sql = "ヒント：ここにSQL文を書く";
//
//		PreparedStatement stmt = null;
//		ResultSet res = null;
//		Member member = null;
//
//		try {
//			stmt = con.prepareStatement(sql);
//			//★
//			// ヒント SQLのパラメータ１番目をセットする
//			// ヒント SQLのパラメータ２番目をセットする
//
//			//★
//			// ヒント：SQLを実行して結果をresに入れる
//
//			//★
//			// ヒント：ＳＱＬ実行結果を取得する
//
//
//
//
//		} finally {
//			if (res != null) {
//				res.close();
//			}
//			if (stmt != null) {
//				stmt.close();
//			}
//		}
//
//		return member;
//	}
//
//	/**
//	 * メンバーを登録する。
//	 *
//	 * @param member
//	 *            メンバー
//	 * @return boolean
//	 * @throws SQLException
//	 *             データベースエラーが発生した場合
//	 */
//	public boolean insertMember(Member member) throws SQLException {
//		boolean result = false;
//		//★
//		String sql = "ヒント：ここにSQL文を書く";
//		PreparedStatement stmt = null;
//
//		try {
//			stmt = con.prepareStatement(sql);
//			//★
//			// ヒント：SQLのパラメータ１番目をセットする
//			// ヒント：SQLのパラメータ２番目をセットする
//			// ヒント：SQLのパラメータ３番目をセットする
//			// ヒント：SQLのパラメータ４番目をセットする
//			// ヒント：SQLのパラメータ５番目をセットする
//			// ヒント：SQLのパラメータ６番目をセットする
//			// ヒント：SQLのパラメータ７番目をセットする
//			// ヒント：SQLのパラメータ８番目をセットする
//			// ヒント：SQLのパラメータ８番目をセットする
//			// ヒント：SQLのパラメータ１０番目をセットする
//			// ヒント：SQLのパラメータ１１番目をセットする
//
//
//			int count=0;
//			//★
//			// ヒント：SQLを更新(データ更新メソッド)を実行して結果(行数）をcountに入れる
//			if (count == 1) { // result = ( count == 1 ); でも同様
//				result = true;
//			}
//		} finally {
//			if (stmt != null) {
//				stmt.close();
//			}
//		}
//
//		return result;
//
//	}
//
//	/**
//	 * メンバーを削除する。
//	 *
//	 * @param member
//	 *            メンバー
//	 * @return boolean
//	 * @throws SQLException
//	 *             データベースエラーが発生した場合
//	 */
//	public boolean deleteMember(Member member) throws SQLException {
//		boolean result = false;
//		//★
//		String sql = "ヒント：ここにSQL文を書く";
//		PreparedStatement stmt = null;
//
//		try {
//			stmt = con.prepareStatement(sql);
//			//★
//			// ヒント：SQLのパラメータ１番目をセットする（メンバーコード）
//
//			int count = 0;
//			//★
//			// ヒント：SQLを更新(データ更新メソッド)を実行して結果(行数）をcountに入れる
//			if (count == 1) { // result = ( count == 1 ); でも同様
//				result = true;
//			}
//		} finally {
//			if (stmt != null) {
//				stmt.close();
//			}
//		}
//		return result;
//	}
//
//	/**
//	 * メンバーを更新する。
//	 *
//	 * @param member
//	 *            メンバー
//	 * @return boolean
//	 * @throws SQLException
//	 *             データベースエラーが発生した場合
//	 */
//	public boolean updateMember(Member member) throws SQLException {
//		boolean result = false;
//		//★
//		String sql = "ヒント：ここにSQL文を書く";
//		PreparedStatement stmt = null;
//
//		try {
//			stmt = con.prepareStatement(sql);
//			//★
//			// ヒント：SQLのパラメータ１番目をセットする
//			// ヒント：SQLのパラメータ２番目をセットする
//			// ヒント：SQLのパラメータ３番目をセットする
//			// ヒント：SQLのパラメータ４番目をセットする
//			// ヒント：SQLのパラメータ５番目をセットする
//			// ヒント：SQLのパラメータ６番目をセットする
//			// ヒント：SQLのパラメータ７番目をセットする
//			// ヒント：SQLのパラメータ８番目をセットする
//			// ヒント：SQLのパラメータ８番目をセットする
//			// ヒント：SQLのパラメータ１０番目をセットする
//			// ヒント：SQLのパラメータ１１番目をセットする
//
//
//			int count = 0;
//			//★
//			// ヒント：SQLを更新(データ更新メソッド)を実行して結果(行数）をcountに入れる
//			if (count == 1) { // result = ( count == 1 ); でも同様
//				result = true;
//			}
//		} finally {
//			if (stmt != null) {
//				stmt.close();
//			}
//		}
//
//		return result;
//	}
//
//	/**
//	 * メンバーを全件検索する。
//	 *
//	 * @return ArrayList<Member> メンバーリスト
//	 * @throws SQLException
//	 *             データベースエラーが発生した場合
//	 */
//	public ArrayList<Member> findMemberList() throws SQLException {
//		ArrayList<Member> memberList = new ArrayList<Member>();
//		//★
//		String sql = "ヒント：ここにSQL文を書く";
//
//		Statement stmt = con.createStatement();
//		ResultSet res = null;
//		try {
//			res = stmt.executeQuery(sql);
//			//★
//			// ヒント：SQLを実行して結果をresに入れる
//
//			//★
//			// ヒント：ＳＱＬ実行結果を取得する
//
//			//★
//			// ヒント：memberListにaddでmemberオブジェクトを追加
//
//
//		} finally {
//			if (res != null) {
//				res.close();
//			}
//			if (stmt != null) {
//				stmt.close();
//			}
//		}
//		return memberList;
//	}

}
