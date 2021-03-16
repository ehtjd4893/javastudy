package practice;

import java.util.Scanner;

public class Stack_Main {

	public static int[] arr;
	public static int itr = -1;

	public static void push(int n){
		arr[++itr] = n;
	}

	public static String pop(){
		if( empty().equalsIgnoreCase("1"))
			return "-1";		
		else
			return arr[itr--] + "";
	}

	public static String top(){
		if( empty().equalsIgnoreCase("1"))
			return "-1";		
		else
			return arr[itr] + "";
	}

	public static String empty(){
		if(itr < 0)
			return "1";
		return "0";
	}

	public static String size(){
		return "" + (itr + 1);
	}

	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		int num_p;	// 명령어 개수
		String prompt;
		int x;
		num_p = sc.nextInt();
		arr = new int[num_p];
			for(int i = 0; i < num_p; i++){
				prompt = sc.next();
				
					if(prompt.equalsIgnoreCase("push")){			
						x = sc.nextInt();
						push(x);
					}else if(prompt.equalsIgnoreCase("pop")){
						sb.append(pop() + "\n");
					}else if(prompt.equalsIgnoreCase("top")){
						sb.append(top() + "\n");
					}else if(prompt.equalsIgnoreCase("empty")){
						sb.append(empty() + "\n");
					}else if(prompt.equalsIgnoreCase("size"))
						sb.append(size() + "\n");

			} // end of for i 
		
		System.out.println(sb);
		sc.close();
	}

}
