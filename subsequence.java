import java.util.*;
public class subsequence{

	public static void main(String[] args){
		int n = Integer.parseInt(args[0]);
		int [] num = new int[n];
		Random r = new Random();
		for(int i = 0; i<n; i++){
			if(Math.random()<.5){
				num[i] = r.nextInt(Integer.MAX_VALUE) * -1;
			}
			else{
				num[i] = r.nextInt(Integer.MAX_VALUE);
			}
		}//FORI	
		long start = System.nanoTime();
		methodOne(num);
		long stop = System.nanoTime();
		System.out.println("MethodOne " + (stop-start));
		start = System.nanoTime();
		methodTwo(num);
		stop = System.nanoTime();
		System.out.println("MethodTwo " + (stop - start));
		start = System.nanoTime();
		methodThree(num);
		stop = System.nanoTime();
		System.out.println("MethodThree " + (stop - start));
		
	}//main
	public static int methodOne(int [] num){
		int best = 0;
		for(int i = 0; i<num.length; i++){
			for(int j = 0; j<num.length; j++){
				int current = 0;
				for(int k = i; k<=j; k++){
					current+= num[k];
				}
				if(current > best)
				best = current;
			}
		}
		return best; 
	}
	public static int methodTwo(int[] num){
		int best = 0;
		for(int i = 0; i<num.length; i++){
			for(int j = 0; j<num.length; j++){
				int current = 0;
				current+= num[j];
				if(current>best)
				best = current;
		}
		
		
	
		}
		return best;
	}
	public static int methodThree(int[] num){
		int best = 0;
		for(int i = 0; i<num.length; i++){
		int current = 0;
		current +=num[i];
		if(current<0)
			current = 0;
		else if(current>best)
			best=current;
		}
		return best;
		}
		
		
		}//class
		
	
	
		

