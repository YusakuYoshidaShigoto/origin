package eSystem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * コンソールから入力された値を取得します。
 * @author    作成者
 * @version   バージョン
 */
public class ConsoleInput {
    /**
     * 引数の値をコンソールに出力し、コンソールより
     * 入力された値を戻り値として返却します。
     */
    public String getConsole(String outputConsole) throws IOException {

        System.out.println(outputConsole);

        BufferedReader buf = new BufferedReader( new InputStreamReader(System.in),1);

        String inputValue = buf.readLine();

        return inputValue;
    }
}
