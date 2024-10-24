package collectionslist;

public class ForEachExample {
	
	public void printArray()
	{
		 //declaring an array  
		   int arr[]={12,13,14,44};  
		   //traversing the array with for-each loop  
		   //for(data_type variable : array or collection)
		   int total=0; //to find sum of elements
		   for(int i:arr){  
		     System.out.println(i);
		     total=total+i; 
		   }  
		   System.out.println("Total: "+total); 
	}

	public static void main(String[] args) {
		ForEachExample obj=new ForEachExample();
		obj.printArray();
	}

}
