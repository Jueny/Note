package Singleton;
/*
 * ����������ʽ-�̰߳�ȫ

�̲߳���ȫ������Ҫ������ uniqueInstance ��ʵ�����˶�Σ���� uniqueInstance ����ֱ��ʵ�����Ļ���
�Ͳ��ᱻʵ������Σ�Ҳ�Ͳ�������̲߳���ȫ���⡣
����ֱ��ʵ�����ķ�ʽҲ��ʧ���ӳ�ʵ���������Ľ�Լ��Դ�ĺô���*/
public class Singleton2_Y {
	private static Singleton2_Y instance=new Singleton2_Y();
	private Singleton2_Y(){}
	public static Singleton2_Y getInstance(){
		return instance;
	}
}
