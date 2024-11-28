package services;

public class ValidationServices {
	

		public static boolean emptyStringValidation(String input) {
			
			if(input == "") {
				return true;
			}
			return false;
		}
		
		public static boolean specialCharacterValidation(String input) {
			
			 String specialCharacters = ".*[!@#$%^&*].*";
			    
			 return input.matches(specialCharacters);
		}
		
		public static boolean phoneNumberValidation(String input) {
			
			if(input.length() <= 12) {
				return false;
			}
			
			
			if(input.indexOf(0) != '+' && input.indexOf(1) != '6' && input.indexOf(2) != '2'  ) {
				return false;
			}
			
			return true;
		}
		

}
