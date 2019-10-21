 

public class MathUtilities{
    
  /**
   * Add two number together
   * @param baseValue first number
   * @param valueToAdd number
   * @return the sum of the two numbers
   */
  public Integer add(Integer baseValue, Integer valueToAdd){
      int x = baseValue;
      int y = valueToAdd;
      
      return (x + y);
    }

  
  


  /**
   * Add two number together
   * @param baseValue first number
   * @param valueToAdd second number
   * @return the sum of the two numbers
   */
  public Double add(Double baseValue, Double valueToAdd){
     double x = baseValue;
     double y = valueToAdd; 
     return (x + y);
  }

  /**
   * Get half the value of the number
   * @param number the number given
   * @return the half of the number in double
   */
  public Double half(Double number) {
      double x = number;
      
      return (number / 2);
  }

  /**
   * Determine if the number is odd
   * @param number the number given
   * @return true if the number is odd, false if it is even
   */
  public Boolean isOdd(Integer number){
      int x = number;
      int oddOrEven = (x % 2);
      if ( oddOrEven == 1 ){
          return true;
        }
       else{
      return false;
  }
}

  /**
   * Multiply the number by itself
   * @param number the number given
   * @return the result of the number multiply by itself
   */
  public Integer square(Integer number) {
      int x = number;
      
      return (x * x);
  }

}
