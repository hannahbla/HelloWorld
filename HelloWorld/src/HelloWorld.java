
public class HelloWorld {

	public static void main(String[] args) {
		int n;
		for(int i=1;i<=300;i++){
			n=i;
		
		System.out.print(n+": ");
		while(n>1)
			{
			if(n%2==0)
			{
				n=n/2;				
			}
			else{
				n=3*n+1;
			}
			System.out.print(n+" ");
			}
		
		System.out.println("");
	}
	
	}
}
