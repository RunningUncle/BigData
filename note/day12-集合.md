����:
	���Դ洢�������͵�����
	ȱ��:��������һ����ֵ,ֻ�ܴ洢�̶����ȵ�����,һ�����˾Ͳ����ٴ���
����:
	�ص�:���Դ洢��ͬ���͵�����,�洢�ռ�����Ŵ洢�����ݵ����������
	�е�:���Ը��Ӻ����ʹ���ڴ�.
	ȱ��:ֻ�ܴ��Ӧ����������.	
���Ϸ���:
1.Collection
	List(ArrayList,LinkedList,vector)
	Set(HashSet,TreeSet)
3.Map
	HashMap
	TreeMap
	
Collection�ж���������Collection��ϵ��Եķ���:

Collection<Object> c = new ArrayList<Object>();
1.���:
	boolean add(E e);�ڼ��ϵ�ĩβ׷��
	boolean addAll(Collection<? extends E> c2)  
2.ɾ��:
	boolean remove(Object o)
	boolean removeAll(Collection<?> c2):�����c2�е�Ԫ�ز���c��ɾ����Ԫ��.
	void clear():������������Ƴ����е�Ԫ��(��ѡ����),size = 0.

3.�ж�:
	boolean contains(Object o)  ���� true������ϰ���ָ��Ԫ�ء� 
	boolean containsAll(Collection<?> c)  ���� true���������ϰ���ָ�����ϵ�����Ԫ��
	isEmpty() ���� true������ϲ������κ�Ԫ�ء� 
4.��ȡ
	int size()  ���ش˼����е�Ԫ�ص���Ŀ��
5.ת��������:��ϣ����Ԫ�ؼ��ϵĳ��ȹ̶�����
	Object[] toArray()  
	<T> T[] toArray(T[] a)
6.������:
	Iterator<E> iterator()//�Ӽ����л�ȡ������ 
		Iterator<Object> it = c.iterator();
		while(it.hasNext()) {
			Object object = it.next();
			System.out.println(object);
		}
	ע��:������ʹ����һ��ȫ�����������,���ܽ���ʹ��,��Ϊָ���Ѿ�ָ�򼯺����λ����,�����Ҫ�ٵ���,��Ҫ���»�ȡ���ϵĵ�����.

List:������ظ�
	ArrayList:
		�ײ�����ݽṹ������,�̲߳���ȫ,�����ٶȿ�,���ɾ���ٶ���.
	LinkedList
		�ײ����ݽṹ������,�̲߳���ȫ,�����ٶ���,���ɾ���ٶȿ�,���Ը��õ������ڴ�ռ�
		����:������,˫����,ѭ������(����ѭ������\˫��ѭ������)
	Vector:
		�ײ�������,�̰߳�ȫ��,��ArrayListȡ����.

Set:���򲻿��ظ�
	HashSet
	TreeSet
	LinkedHashSet
	
List:
	����:
		void add(int index, E element)  ���б���ָ����λ���ϲ���ָ����Ԫ�ء� 
		boolean addAll(Collection<? extends E> c)  ׷��ָ�����ϵ�����Ԫ�ص�����б��ĩβ�������ǵ�ָ�����ϵĵ��������ء�
		boolean addAll(int index, Collection<? extends E> c)  ��ָ�������е�����Ԫ�ز��뵽���б��У���ָ��λ�ÿ�ʼ�� 
	ɾ��:
		boolean remove(Object o)  �Ӹ��б����Ƴ�ָ��Ԫ�صĵ�һ��������������Ǵ��ڵġ�
		E remove(int index)  �Ƴ����б���ָ��λ�õ�Ԫ�ء� 
	����:
		ListIterator<E> listIterator() �����б�Ԫ�ص��б�����������ʵ���˳�򣩡� 
		ListIterator<E> listIterator(int index)  ���б��е�Ԫ���Ϸ����б�����������ʵ���˳�򣩣����б��е�ָ��λ�ÿ�ʼ�� 
	ע��:�ٵ���ʱ,�������������������ڲ����ļ��Ͻ����޸�,�����ٵ���ʱ������list.remove�����ķ�ʽ����ɾ��,�����õ�����ɾ��,��iterator.remove();
	ȡ�Ӽ�:
	subList(int start,int end);

Listȥ��:
ͨ����д�Զ������equals����,Ȼ�����list.contains(obj)�������ȥ��
		
	
	