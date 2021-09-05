
class Service{
	
	
	    
	
/*  *
   ***
  *****
 *******
*********   
*/
	
	public static void main(String[] args){
		int num=10;
		for(int i=1;i<=num;i++){
		for(int j=i;j<=num;j++){
			System.out.print(" ");
		}
		for(int j=2*i-1;j>0;j--)
		System.out.print("*");
		System.out.print("\n");
		}
	}
}