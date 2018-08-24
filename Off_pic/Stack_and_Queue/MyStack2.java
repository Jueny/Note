package Off_pic.Stack_and_Queue;
import java.util.*;
public class MyStack2 {
	private Stack <Integer> stackData;
	private Stack<Integer> stackMin;
	public MyStack2(){
		this.stackData=new Stack<Integer>();
		this.stackMin=new Stack<Integer>();
	}
	public void push(int newNum){
		if(this.stackMin.isEmpty()){
			this.stackMin.push(newNum);
		}else if(this.getmin()>=newNum){
			this.stackMin.push(newNum);
		}else{
			int newMin=this.stackMin.peek();
			this.stackMin.push(newMin);
		}
		this.stackData.push(newNum);
	}
	public int pop(){
		
		return stackMin.peek();
		
	}
	private int getmin() {
		// TODO Auto-generated method stub
		if(stackMin.isEmpty()){
			throw new RuntimeException("stack is null");
		}
		return stackMin.peek();
	}
}

