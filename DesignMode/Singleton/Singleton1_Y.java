package Singleton;
/*
 * ����������ʽ-�̰߳�ȫ
ֻ��Ҫ�� getUniqueInstance() ������������ô��һ��ʱ���ֻ����һ���߳��ܹ�����÷�����
�Ӷ������˶� uniqueInstance ���ж��ʵ���������⡣
����������һ�����⣬���ǵ�һ���߳̽���÷���֮�������߳���ͼ����÷���������ȴ��������������һ������ġ�*/
public class Singleton1_Y {
	private static Singleton1_Y uniqueInstance;
	private Singleton1_Y(){
		
	}
	public static synchronized Singleton1_Y getUniqueInstance(){
		if(uniqueInstance==null){
			uniqueInstance=new Singleton1_Y();
			
		}
		return uniqueInstance;
		
	}
}
