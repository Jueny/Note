package Singleton;
/*
 * （二）懒汉式-线程安全
只需要对 getUniqueInstance() 方法加锁，那么在一个时间点只能有一个线程能够进入该方法，
从而避免了对 uniqueInstance 进行多次实例化的问题。
但是这样有一个问题，就是当一个线程进入该方法之后，其它线程试图进入该方法都必须等待，因此性能上有一定的损耗。*/
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
