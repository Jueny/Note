package Off_pic.Stack_and_Queue;

import java.util.Stack;
/*返回栈中最小元素*/

public class MyStack1 {

	private Stack<Integer> stackData;
	private Stack<Integer> stackMin;
	
	public MyStack1(){
		this.stackData=new Stack<Integer>();
		this.stackMin=new Stack<Integer>();
		
	}
	public void push(int newNum){
		if(this.stackMin.isEmpty()){
			this.stackMin.push(newNum);
		}else if(newNum<=this.getmin()){
			this.stackMin.push(newNum);
		}
		this.stackData.push(newNum);
	}
	
	public int pop(){
		if(this.stackData.isEmpty()){
			throw new RuntimeException("stack is empty");
		}
		int value=this.stackData.pop();
		if(value==this.getmin()){
			this.stackMin.pop();
		}
		return value;
	}
	private int getmin() {
		// TODO Auto-generated method stub
		if(this.stackMin.isEmpty()){
			throw new RuntimeException("stack is empty");
		}
		return this.stackMin.peek();
	}

}
