package practice;

public class Stack {

		private int[] arr = new int[10000];
		private int itr = -1;
		
		
		public Stack(){
			itr = -1;
			arr = new int[10000];
		}

		void push(int n){
			arr[++itr] = n;
		}

		String pop(){
			if( empty().equalsIgnoreCase("1"))
				return "-1";		
			else
				return arr[itr--] + "";
		}

		String top(){
			if( empty().equalsIgnoreCase("1"))
				return "-1";		
			else
				return arr[itr] + "";
		}

		String empty(){
			if(itr < 0)
				return "1";
			return "0";
		}

		String size(){
			return "" + (itr + 1);
		}


	
}
