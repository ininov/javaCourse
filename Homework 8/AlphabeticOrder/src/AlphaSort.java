import java.util.Scanner;


public class AlphaSort {

	 public static void main(String[ ] args)
     {
		 
//		 	Scanner input = new Scanner(System.in);
//		 	
//		 	System.out.println("Enter sentance: ");
//		 	String sen = input.next();
//		 	
//		 	String[] newSen = sen.split(" |,|\\.");
		 	
//		 	for (String string : newSen) {
//		 		System.out.println(string);
//			}
		 	
		 
             String[ ] names = {"Илиян", "Николай", "Георги", "Милен"};
             BubbleSortString (names);
             for ( int i = 0;  i < names.length;  i++ )
                System.out.println( names [i] );
      }

      public static void BubbleSortString( String array [] )
      {
            int j;
            boolean flag = true;  // will determine when the sort is finished
            String temp;

            while ( flag )
            {
                  flag = false;
                  for ( j = 0;  j < array.length - 1;  j++ )
                  {
                          if ( array[j].compareToIgnoreCase(array[j+1]) > 0 )
                          {                                             // ascending sort
                                      temp = array[j];
                                      array[j] = array[j+1];     // swapping
                                      array[j+1] = temp;
                                      flag = true;
                           }
                   }
            }
      } 

	}
