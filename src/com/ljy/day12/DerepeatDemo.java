package com.ljy.day12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 * contains����ԭ��:���Ԫ�ص�ʱ��,���õ�ǰ��Ԫ�����Ѿ���ӵ�list2�е�ÿһ��Ԫ��ͨ��equals�Ƚ�,�ȽϹ���
 * �������true����,˵������contains�����ķ��ؽ������true,ֻ�����еıȽϽ������false,contains���ؽ������fasle
 * �������ؽ����true��ʱ��,˵��list2���Ѿ������˵�ǰ��Ԫ��.����list2����ӵ�ǰԪ��,�����false,����list2����ӵ�ǰԪ��
 * �Զ������,��Ҫ�Լ���дequals����
 * @author lijia
 *
 */
public class DerepeatDemo {
	public static void main(String[] args) {
		ArrayList<String>list = new ArrayList<>();
		Collections.addAll(list, "java1","java2","java3","java4","java5","java5");
		System.out.println(list);
		//������Ų��ظ�������
		ArrayList<String>tempList = new ArrayList<>();
//		for(String str:list) {
//			if (!tempList.contains(str)) {
//				tempList.add(str);
//			}
//		}
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			String string = iterator.next();
			if (!tempList.contains(string)) {
				tempList.add(string);
			}
		}
		
		System.out.println(tempList);
	}
	
	
}
