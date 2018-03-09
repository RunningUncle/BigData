package com.ljy.day10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Test10 {

	public static void main(String[] args) {
		String res = trim("  sss ");
		System.out.println("|" + res + "|");
		res = "HelloWorld";
		res = reverse(2, 7, res);
		System.out.println("��ת��:" + res);

		res = "gfedcba";
		System.out.println("����ǰ:" + res);
		System.out.println("�����:" + sortStr(res));
		System.out.println("6921168509256:" + certifyCode("6921168509256"));
		System.out.println("===========================");
		System.out.println(getRandom());

	}

	/**
	 * 1��ģ��һ��trim������ȥ���ַ������˵Ŀո� ˼·�� 1���ж��ַ�����һ��λ���Ƿ��ǿո�����Ǽ��������жϣ�ֱ�����ǿո�Ϊֹ��
	 * ��β���жϿո�Ҳ����ˡ� 2������ʼ�ͽ�β���жϵ����ǿո�ʱ������Ҫ��ȡ���ַ�����
	 * 
	 * @author Administrator
	 *
	 */
	public static String trim(String str) {
		if (str == null || str == "")
			return str;
		StringBuffer sb = new StringBuffer(str);
		// ȥ��ǰ�ո�
		while (true) {
			if (sb.subSequence(0, 1).equals(" ")) {
				sb.delete(0, 1);
				if (sb.length() == 0)
					return "";
			} else {
				break;
			}
		}
		// ȥ����ո�
		while (true) {
			int len = sb.length();
			if (sb.subSequence(len - 1, len).equals(" ")) {
				sb.delete(len - 1, len);
				if (sb.length() == 0)
					return "";
			} else {
				break;
			}
		}
		return sb.toString();
	}

	/**
	 * 2����һ���ַ������з�ת�����ַ�����ָ�����ֽ��з�ת��"abcdefg";abfedcg ˼·�� 1������ѧϰ���������Ԫ�ؽ��з�ת��
	 * 2�����ַ���������飬�����鷴ת�� 3������ת����������ַ����� 4��ֻҪ����ת�Ĳ��ֵĿ�ʼ�ͽ���λ����Ϊ�������ݼ��ɡ�
	 * 
	 * @param start
	 * @param end
	 * @param str
	 * @return
	 */
	public static String reverse(int start, int end, String str) {
		if (end - start > str.length() || str == null || start < 0 || end > str.length())
			throw new IllegalArgumentException("�����쳣");
		String subFirst = str.substring(0, start);
		String subEnd = str.substring(end, str.length());
		String subMiddle = str.substring(start, end);
		return subFirst + new StringBuilder(subMiddle).reverse() + subEnd;
	}

	/**
	 * ���ַ������ַ�������Ȼ˳������ 1:���ַ���ת���ַ����� 2������ 2��������ת���ַ���
	 * 
	 * @param str
	 * @return
	 */
	public static String sortStr(String str) {
		if (str == null)
			return null;
		char[] array = str.toCharArray();
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					char temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		return new String(array);
	}

	/**
	 * String code = "6921168509256"; ȡǰ12λ������λ�ĺ� ȡǰ12λ��ż��λ�ĺ�
	 * ��"����λ��"��"ż��λ�͵�����"������ ȡ�͵ĸ�λ����Ȼ����10��ȥ�����λ��������Ľ�������������֤��
	 * �������ĵ�13λ���ֺ������֤����ͬ��˵����֤����ȷ
	 * 
	 * @param code
	 * @return
	 */
	public static boolean certifyCode(String code) {
		if (code == null || code.length() != 13)
			return false;

		// ��������λ�ĺ�
		int oddSum = 0;
		// ����ż��λ�ĺ�
		int even = 0;
		try {
			for (int j = 0, i = 1; j <= 12 && i <= 12; i = i + 2, j = j + 2) {
				oddSum += Integer.valueOf(String.valueOf(code.charAt(i)));
				even += Integer.valueOf(String.valueOf(code.charAt(j)));
			}
			// ��"����λ��"��"ż��λ�͵�����"������
			int sum = oddSum + even * 3;
			// ȡ�͵ĸ�λ����Ȼ����10��ȥ�����λ��������Ľ�������������֤��
			int numCode = 10 - sum % 10;
			return (String.valueOf(numCode).equals(String.valueOf(code.charAt(12))));
		} catch (Exception e) {
			return false;
		}
	}

	/**
	 * �õ�10��1--20֮����������Ҫ�����ظ�(Ҫ���ü���)
	 * 
	 * @return
	 */
	public static List<Integer> getRandom() {
		int time = 0;
		Random r = new Random();
		List<Integer> list = new ArrayList<Integer>();
		while (time < 10) {
			String random = String.valueOf(r.nextInt(20) + 1);
			if (list.contains(random)) {
				continue;
			} else {
				list.add(new Integer(random));
				time++;
			}
		}
		return list;

	}

	/**
	 * ����һ������n��Ԫ�ص���������a�����Ԫ�س��ֵĴ���Ϊ�����Σ������
	 * @param array
	 */
	public static void printArray(int[] array) {
		//������ת���ɼ���
	}
}
