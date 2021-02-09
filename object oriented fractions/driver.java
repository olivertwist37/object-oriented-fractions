
public class driver{
    
   public static void main(String[] args) {
      //Fraction empty = new Fraction();
      Fraction parameter = new Fraction(345,639);
      Fraction stringFrac = new Fraction("35/46");
      //Fraction copyFrac = new Fraction(parameter);
      //Fraction getNum = new Fraction();
      //Fraction getDenom = new Fraction();
      Fraction ans = Fraction.subtract(parameter,stringFrac);
      
      System.out.println(ans);
   }
   
}