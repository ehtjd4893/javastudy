package practice;

import java.util.Scanner;

public class queue {
	static int f_itr = 0;
	static int size = 0;
	static int b_itr = 0;
	static int q_size = 10000;
	static int[] q = new int[q_size];

	static void push(int x) {
		q[b_itr++] = x;
	}
	
	static String pop() {
		if(!empty()) {
			return q[f_itr++] + "";
		}
		else
			return "-1";
	}
	
	static int size() {
		return Math.abs(b_itr - f_itr);
	}
	
	static boolean empty() {
		return f_itr == b_itr;	
	}
	
	static String front() {
		if(!empty())
			return q[f_itr] + "";
		else
			return "-1";
	}
	
	static String back() {
		if(!empty())
			return q[b_itr-1] + "";
		else
			return "-1";
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer("");
		int n_prompt = sc.nextInt();
		String prompt;
		for(int i = 0; i < n_prompt; i++) {
			prompt = sc.next();
			switch(prompt) {
			case "push":
				int t = sc.nextInt();
				push(t);
				break;
			case "pop":
				sb.append(pop()+"\n");
				break;
			case "size":
				sb.append(size()+"\n");
				break;
			case "empty":
				if(empty())
					sb.append("1\n");
				else
					sb.append("0\n");
				break;
			case "front":
				sb.append(front()+"\n");
				break;
			case "back":
				sb.append(back()+"\n");
				
			}
		
		}
		System.out.println(sb);
	}

}
