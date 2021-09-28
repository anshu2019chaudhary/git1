package Day3;

public class Aphabetpattern2 {

	public static void main(String[] args) {

int i,j;
char n='A';
int space=0;
for( i=1;i<=5;i++)
{
    n='A';
	for(j=5;j>=i;j--) 
	{
     System.out.print(n);// ABCDE
                         
     n++;
      }
	 
     for(int s=0;s<space;s++)
     {
    	 System.out.print(" ");
     }
       
	for(j=5;j>=i;j--) //EDCBA
	{
     System.out.print(--n); 
    }
   System.out.println();
   space=space+2;  

}



	}

}
