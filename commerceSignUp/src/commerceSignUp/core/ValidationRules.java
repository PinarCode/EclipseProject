package commerceSignUp.core;

public class ValidationRules {
   public static boolean run(boolean... logics) {
	   for (boolean b : logics) {
		  if(!b) {
			  return false;
		  }
	   }
	   return true;
   }
}
