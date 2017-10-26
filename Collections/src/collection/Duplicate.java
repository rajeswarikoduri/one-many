package collection;


	import java.util.ArrayList;

	public class Duplicate {
	  public static void main(String[] args){

	    ArrayList<Integer> ar=new ArrayList<Integer>();
	    ArrayList<Integer> ar2=new ArrayList<Integer>();

	    ar.add(2);
	    ar.add(4);
	    ar.add(2);
	    ar.add(4);
	    ar.add(3);
	    ar.add(5);
	    ar.add(3);
	    ar.add(6);

	    for(int x=0;x<ar.size();x++)
	    {
	        if(!ar2.contains(ar.get(x)))
	        {
	             for(int y=x+1;y<ar.size()-1;y++)
	            {

	                  if((ar.get(y).equals(ar.get(x))))
	                {
	                    System.out.print("repeating "+ar.get(x));
	                    ar2.add(ar.get(x));
	                    break;

	                }  


	            } 

	        } 

	    }

	  }
}
