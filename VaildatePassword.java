import java.util.Scanner;

public class ValidatePassword {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String password = "";

        boolean repeat = true;
        boolean isUpperCaseOk = false;
        boolean isLowerCaseOk = false;
        boolean isDigitOk = false;

        int upperCaseCount = 0;
        int lowerCaseCount = 0;
        int digitCount = 0;

        while(repeat){
            System.out.println("Enter password: ");
            password = input.nextLine();
            for(int i = 0; i < password.length(); i++){
                char character = password.charAt(i);
                if(Character.isUpperCase(character)){
                    upperCaseCount++;
                }else if(Character.isLowerCase(character)){
                    lowerCaseCount++;
                }else if(Character.isDigit(character)){
                    digitCount++;
                }
            }
            if(upperCaseCount >= 2){
                isUpperCaseOk = true;
            }
            if(lowerCaseCount >= 2){
                isLowerCaseOk = true;
            }
            if(digitCount >= 2){
                isDigitOk = true;
            }

            if(isUpperCaseOk && isLowerCaseOk && isDigitOk){
                System.out.println("Password set!");
                repeat = false;
            }else{
                System.out.println("You did not have enough of the following: ");
                if(!isUpperCaseOk){
                    System.out.println("upper case characters");
                }
                if(!isLowerCaseOk){
                    System.out.println("lower case characters.");
                }
                if(!isDigitOk){
                    System.out.println("digits.");
                }

                isUpperCaseOk = false;
                isLowerCaseOk = false;
                isDigitOk = false;

                upperCaseCount = 0;
                lowerCaseCount = 0;
                digitCount = 0;
            }
        }
    }
}
