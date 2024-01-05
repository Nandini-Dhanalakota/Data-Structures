//Leetcode - 2011
//Final Value of Variable After Performing Operations

class solution
  {
    public int finalValueAfterOperations(String [] operations)
    {
      int result = 0;
      for(String element: operations)
        {
          if(element.equals("++X") || element.equals("X++"))
          {
            result++;
          }
          else if(element.equals("--X") || element.equals("X--"))
          {
            result--;
          }
        }
      return result;
    }
  }
