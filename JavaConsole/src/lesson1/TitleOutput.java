package lesson1;

public class TitleOutput {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String title1 = "トレノカフェ";
		String title2 = "AIはじめての一歩";
		String title3 = "AWS学びの小冊子";

		TitleEdit titleEdit = new TitleEdit();

		titleEdit.editOut(title1);
		titleEdit.editOut(title2);
		titleEdit.editOut(title3);

	}

}
