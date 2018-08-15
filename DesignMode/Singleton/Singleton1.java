package Singleton;
/*
 * ��һ������ʽ-�̲߳���ȫ

����ʵ���У�˽�о�̬���� uniqueInstance ���ӳٻ�ʵ������
�������ĺô��ǣ����û���õ����࣬��ô�Ͳ���ʵ���� uniqueInstance���Ӷ���Լ��Դ��
���ʵ���ڶ��̻߳������ǲ���ȫ�ģ��������߳��ܹ�ͬʱ���� if (uniqueInstance == null) ��
���Ҵ�ʱ uniqueInstance Ϊ null����ô����̻߳�ִ�� uniqueInstance = new Singleton(); ��䣬
�⽫���¶��ʵ���� uniqueInstance��
 * */
public class Singleton1 {

	private static Singleton1 uniqueIntance;
	private Singleton1(){
		
	}
	public static Singleton1 getUniqueIntance(){
		if(uniqueIntance==null){
			uniqueIntance=new Singleton1();
		}
		return uniqueIntance;
	}

}
