 
import java.util.*;
import java.io.*;
import java.lang.*;

public class Program5{

static BinarySearchTree[] list = new BinarySearchTree[26];
static long compsfound = 0;
static long wdfound = 0;
static long compsnotfound = 0;
static long wdnotfound = 0;	

public static void main(String[] args){

	for(int i = 0; i < list.length; i++)
		list[i] = new BinarySearchTree<String>();

	
	read();
 	list.toString(); 
 	compare();
 	System.out.println("words found " + wdfound);
 	System.out.println("words not found " + wdnotfound);
 	System.out.println("comparisons found " + compsfound);
 	System.out.println("comparisons not found " + compsnotfound);
 	double avgcompwdfound = (double)(compsfound/wdfound);
 	System.out.println("average comparison words found " + avgcompwdfound);
 	double avgcompwdnotfound = (double)(compsnotfound/wdnotfound);
 	System.out.println("average comparison words not found " + avgcompwdnotfound);

 	
 	}

	

public static void read(){
	try{
		File f = new File("random_dictionary.txt");
		Scanner input = new Scanner(f);
			while(input.hasNext()){
				String word = input.next();
				if(word.charAt(0) < 97)
					word = word.toLowerCase();

				list[word.charAt(0) - 97].insert(word);
			}//while
			input.close();


	}//try

	catch(IOException e){
		System.out.println("Can't read file");
	}//catch
		
}// read


public static void compare(){
	int [] counter = {0};
	
	try{

	File f = new File("oliver.txt");
	Scanner input = new Scanner(f);
		String word = "";
		while(input.hasNext()){

			String line = input.nextLine().toLowerCase();
			String [] l = line.split(" ");
			StringBuilder sb = new StringBuilder();
				for(int i = 0; i < l.length; i++){
					for(int j = 0; j < l[i].length(); j++){
						if(Character.isLetter(l[i].charAt(j)))
							sb.append(l[i].charAt(j));
						
					}//for
						String w = sb.toString();
						if(!w.isEmpty())
							
						if(list[w.charAt(0) - 97].search(w, counter)){
							wdfound++;
							compsfound += counter[0];
						}
						else{
							 wdnotfound++;
							 compsnotfound += counter[0];
						}
						sb.setLength(0);
						counter[0] = 0;
				}
		}//while
			 input.close();
			 System.out.println("The file was read Successfully");





	}//try

	catch(IOException e){
		System.out.println("Cannot read the file");


	}


}//compare


}//class
