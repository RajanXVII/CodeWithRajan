import java.util.*;

class Code{
	Code(){
		System.out.println("This is No arg constructor");
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number!!");
		int num=sc.nextInt();
		
		List<String> names=new ArrayList<String>();
		for(int i=0;i<=num;i++){
			names.add(sc.nextLine());
		}
		List<String> newname=new ArrayList<String> ();
		for(String name:names)
		{
			String temp="";
			
			for(int i=0;i<name.length();i++){
				if(Character.isUpperCase(name.charAt(i))){//i=0
					temp=i==0?name.substring(0,i+1):name.substring(0,i);//R
					if(i==0){
					temp=temp.toLowerCase();
					temp=temp.concat(name.substring(1,name.length()));
					}
					else{
						temp=temp.concat("_");//r_
						temp=temp.concat(Character.toString(Character.toLowerCase(name.charAt(i))));
						temp=temp.concat(name.substring(i+1,name.length()));
					}	
					name=temp;
			}
			}
			newname.add(name);
			
		}
		newname.remove(0);
			for(String name2:newname)
		{
			System.out.println("this->"+name2);
		}
	}
}