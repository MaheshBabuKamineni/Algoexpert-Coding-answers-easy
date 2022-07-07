import java.util.*;

class Program {
  public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
    // Write your code here.
    int arrindex=0;
    int seqindex=0;
      while(arrindex<array.size() && seqindex<sequence.size())
        {
          if(array.get(arrindex).equals(sequence.get(seqindex))){
            seqindex++;

            
}
          arrindex++;
        
          }
    
  
    
    return seqindex==sequence.size();
    }
 

   
  
}
