package Common_task;

public class Session2_Assignments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//if_else_Block( 2);

		// prime_NUmbers(100);
		
		//disply_series();
		
		switch_statement('D');
	}
	
	
	public static void if_else_Block( int age){
		if (age > 18 )			
			System.out.println("You are eligble for voting");			
		else System.out.println("You ar not eligible for voting");		
	}
	
	
	public static void prime_NUmbers(int num){
		
		int z = 0;
		for ( int x = 1 ; x<=100 ;x++ )
		{
			
			
			for (int y = 2  ; y < x ; y++)
			{
				 z= x%y ;
				 
				 if (z == 0 )break ;
				
			}
			
			if (z != 0)
			{
				System.out.print(","+x);
			}			
		}	
			
		}
		
		public static void disply_series(){
		
		String display = "" ;
			
		 for ( int i=1 ; i< 6 ;i++){
			 
			 display = display + i;
			System.out.println(display); 
		 }
		
		 
		 for ( int i = 4 ; i > 0 ;i--){
			 
			 display = display.substring(0, i);
			 System.out.println(display); 
			 
			 
		 }
	}
	
	
		
		public static void switch_statement(char month){
			
			
			switch ( month) {
			case 'J' : System.out.println("Days in Month of January 30" ) ;
					   break;
			case 'F' : System.out.println("Days in Month of February 28" );
						break;
			case 'M' : System.out.println("Days in Month of March 31" );
						break;
			case 'A' : System.out.println("Days in Month of April 30" );
						break;
			case 'D' : System.out.println("Days in Month of December 31" );
						break;
			case 'N' : System.out.println("Days in Month of November 30" );
			
			}
			 
			
			
			
			
		}
		

}
