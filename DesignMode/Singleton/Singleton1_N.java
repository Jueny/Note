package Singleton;
/*
 * ��һ������ʽ-�̲߳���ȫ

����ʵ���У�˽�о�̬���� uniqueInstance ���ӳٻ�ʵ������
�������ĺô��ǣ����û���õ����࣬��ô�Ͳ���ʵ���� uniqueInstance���Ӷ���Լ��Դ��
���ʵ���ڶ��̻߳������ǲ���ȫ�ģ��������߳��ܹ�ͬʱ���� if (uniqueInstance == null) ��
���Ҵ�ʱ uniqueInstance Ϊ null����ô����̻߳�ִ�� uniqueInstance = new Singleton(); ��䣬
�⽫���¶��ʵ���� uniqueInstance��
 * */
public class Singleton1_N {

	private static Singleton1_N uniqueIntance;
	private Singleton1_N(){
		
	}
	public static Singleton1_N getUniqueIntance(){
		if(uniqueIntance==null){
			uniqueIntance=new Singleton1_N();
		}
		return uniqueIntance;
	}

}
