package Day3;

public class alphabetpattern {
public static void main(String a[])
{  int i,j;
    char n='A';
	for(i=1;i<=5;i++)   
	{  n='A';
		for(j=5;j>=i;j--) 
		{
	     System.out.print(n); 
	     n++;
		}
		System.out.println();
		
	}
	
}
}
