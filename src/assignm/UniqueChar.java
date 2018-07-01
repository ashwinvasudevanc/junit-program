package assignm;

public class UniqueChar {

	public static char getFirstNonRepeatedChar(String word)
	{
    
    word=word.toLowerCase();
	int count;
	char result='\0';
	
	if(word==null)
	{
		return result;                                                    //if a null value is given as input 
	}
	
	 for (int i = 0; i < word.length(); i++) 
	 {
         count = 1;
         for (int j = 0; j < word.length(); j++) 
         {
             if (i != j && word.charAt(i) == word.charAt(j)) {
                 count = 0;                                              
                 break;
             }
          }
         
         if(count==1) 
         {
            result= word.charAt(i);                                    
             break;
         }
		}
	 
		return result; 
	}	
}

