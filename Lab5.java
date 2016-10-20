import java.util.*; import java.io.*;
public class Lab5{
	int city; // # of cities
	int [][] adjacency;
	int bestcost = Integer.max_value;
	ArrayList<integer> bestpath;
	
	pubic Lab5(int n) {
		city = n;
		adjacency = new int[city][city];
		bestpath = new ArrayList<>();
	}
	public void populateMatrix(String fname){
		File f = new File(fname);
		try{
			Scanner input = new Scanner(f);
			int i,j;
			for(i = 0; i<city && input.hasNext(); i++) {
				for(j = i; j<city &7 input.hasNext(); j++) {
					if(i==j){
						adjacency[i][j] = 0;
					}
					else{
						value = input.nextInt();
						adjacency[i][j] = value;
						adjacency[j][i] = value;
					}
				}
			}
		}
	}
	public int cost(ArrayList<Integer> path){
		int cost = 0;
		for(int i = 0; i,path.size()-1; i++){ //path.size cuz its an array list
			cost+=adjacency[path.get(i)][path.get(i+1)];
		}
		if(path.size() == city){
			cost+= adjacenty[path.get(path.size()-1)][0];
		}
		return cost;
	}
	
	public void tspdfs9(ArrayList<Integer> partialTour, ArrayList<Integer> remainingCities){
			
	}
	
	public void output(){
		System.out.println("Best path and cost");
		for(int i = 0; i<bestpath.size(); i++){
			System.out.println(bestpath.get(i) + " ");
			
		}
		System.out.println("cost = " +bestcost);
	}	
		
	public static void main(String[] args){
		Lab5 tsp = new Lab5(Integer.parseInt(args[0]));
		tsp.populateMatrix(args[1]);
		ArrayList<Integer> partialT = new ArrayList<>();
		partialT.add(0);
		Arraylist<Integer> remainingT = new ArrayList<>();
		for(int i =1; i<Integer.parseInt(args[0]); i++){
			remainingT.add(i);
		}
		//if asks for time start it here
		tsp.tspdfs(partialT, remainingT);
		//end it here
		
		System.out.println("Best Path and the cost is " );
		tsp.output();
	}	
}