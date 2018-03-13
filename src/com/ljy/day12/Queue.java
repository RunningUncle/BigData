package com.ljy.day12;

import java.util.LinkedList;

/**
 * ջ:�Ƚ����
 * ����:�Ƚ��ȳ�
 *	��������:ģ�����
 */
public class Queue<E> {
	//�ڲ�ά���ļ���
	private LinkedList<E> list = new LinkedList<>();

	public Queue() {
	}
	
	//��
	public boolean push(E e) {
		return list.offerFirst(e);
	}
	//ȡ
	public E pull() {
		return list.pollLast();
	}
	//��ȡ���������ݵĴ�С
	public int getSize() {
		return list.size();
	}
	//�ж϶����Ƿ�Ϊ��
	public boolean isEmpty() {
		return list.isEmpty();
	}
	//��ն���
	public void clear() {
		list.clear();
	}
	
	@Override
	public String toString() {
		return list.toString();
	}
}
