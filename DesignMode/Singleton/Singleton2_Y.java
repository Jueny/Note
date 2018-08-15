package Singleton;
/*
 * （三）饿汉式-线程安全

线程不安全问题主要是由于 uniqueInstance 被实例化了多次，如果 uniqueInstance 采用直接实例化的话，
就不会被实例化多次，也就不会产生线程不安全问题。
但是直接实例化的方式也丢失了延迟实例化带来的节约资源的好处。*/
public class Singleton2_Y {
	private static Singleton2_Y instance=new Singleton2_Y();
	private Singleton2_Y(){}
	public static Singleton2_Y getInstance(){
		return instance;
	}
}
