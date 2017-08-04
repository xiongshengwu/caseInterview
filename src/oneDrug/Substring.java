package oneDrug;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Substring {

	public static void main(String[] args) {
		String str = "nihao你0好AAD吗？1我2不4好；A44=AWe6666d";
		System.out.println("数字[0-9]:"+Substring.getString(str, "[0-9]"));//数字
		System.out.println("数字[\\d]:"+Substring.getString(str, "[\\d]"));//数字
		System.out.println("英文[a-z]:"+Substring.getString(str, "[a-z]"));//数字
		System.out.println(Substring.getString(str, "A"));
	}

	public static String getString(String str, String regex) {
		// 1.将正在表达式封装成对象Patten 类来实现
		Pattern pattern = Pattern.compile(regex);
		// 2.将字符串和正则表达式相关联
		Matcher m = pattern.matcher(str);
		// 3.String 对象中的matches 方法就是通过这个Matcher和pattern来实现的。
		//System.out.println(m.matches());
		// 查找符合规则的子串
		StringBuffer sb = new StringBuffer();
		while (m.find()) {
			// 获取 字符串
			sb.append(m.group());
			// 获取的字符串的首位置和末位置
			//System.out.println(m.start() + "--" + m.end());
		}
		return sb.toString();
	}

}
