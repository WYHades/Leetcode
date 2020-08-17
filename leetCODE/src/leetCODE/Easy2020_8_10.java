package leetCODE;

import java.util.ArrayList;
import java.util.Scanner;

public class Easy2020_8_10 {

	/*
	 * 给定一个字符串 s，计算具有相同数量0和1的非空(连续)子字符串的数量，并且这些子字符串中的所有0和所有1都是组合在一起的。
	 * 
	 * 重复出现的子串要计算它们出现的次数。
	 * 
	 * 示例 1 :
	 * 
	 * 输入: "00110011" 输出: 6 解释: 有6个子串具有相同数量的连续1和0：“0011”，“01”，“1100”，“10”，“0011”
	 * 和 “01”。
	 * 
	 * 请注意，一些重复出现的子串要计算它们出现的次数。
	 * 
	 * 另外，“00110011”不是有效的子串，因为所有的0（和1）没有组合在一起。 示例 2 :
	 * 
	 * 输入: "10101" 输出: 4 解释: 有4个子串：“10”，“01”，“10”，“01”，它们具有相同数量的连续1和0。
	 */

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);//创建一个键盘扫描类对象
		String S=input.next(); //输入整型
		input.close();
		
		
		countBinarySubstrings(S);
		
	}

	public static int countBinarySubstrings(String s) {

		ArrayList<Integer> List = new ArrayList<Integer>();

		for (int i = 0; i < s.length(); i++) {
			int num = 0;
			char flag = s.charAt(i);
			for (int j = i + 1; j < s.length() - i; j++) {
				if (s.charAt(j) == flag) {
					num++;
				}else{
					break;
				}
			}
			List.add(num);
		}

		
		
		return 0;

	}
}
