package Off_pic.Stack_and_Queue;

import java.util.Stack;

public class TwoStacksQueue {
	public Stack<Integer> stackPush;
	public Stack<Integer> stackPop;
	
	public static void mian(String arg[]){
		
	}
	public TwoStacksQueue(){
		this.stackPush=new Stack<Integer>();
		this.stackPop=new Stack<Integer>();
	}
	
	public void add(int pushInt){
		stackPush.push(pushInt);
	}
	public int poll(){
		if(stackPush.isEmpty()&&stackPop.isEmpty()){
			throw new RuntimeException("Queue is empty!");
		}else if(stackPop.isEmpty()){
			while(!stackPop.isEmpty()){
				stackPop.push(stackPush.pop());
			}
			
		}
		return stackPop.pop();
		
	}
	public int peek(){
		if(stackPop.isEmpty()&&stackPush.isEmpty()){
			throw new RuntimeException("Queue is empty");
		}else if(stackPop.isEmpty()){
			while(!stackPush.isEmpty()){
				stackPop.push(stackPush.pop());
			}
		}
		return stackPop.peek();
	}
}
