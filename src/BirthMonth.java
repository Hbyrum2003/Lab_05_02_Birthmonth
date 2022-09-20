public class BirthMonth {
    public static void main(String[] args) {
        //prompting user for birth month
        System.out.println("Enter your brith month in the format of [1-12]");
        int birthMonth = 8;
        if(birthMonth ==1){
            System.out.println("Your Birth Month is January!");
        } else if (birthMonth ==2) {
            System.out.println("Your Birth month is February!");
        } else if (birthMonth ==3) {
            System.out.println("Your Birth month is March!");
        } else if (birthMonth == 4) {
            System.out.println("Your Birth month is April!");
        } else if (birthMonth == 5) {
            System.out.println("Your Birth month is May!");
        } else if (birthMonth == 6) {
            System.out.println("Your Birth month is June");
        } else if (birthMonth ==7) {
            System.out.println("Your Birth month is July!");
        } else if (birthMonth ==8) {
            System.out.println("Your Birth month is August!");

        } else if (birthMonth ==9) {
            System.out.println("Your Birth month is September!");
        } else if (birthMonth ==10) {
            System.out.println("Your Birth month is October!");
        } else if (birthMonth == 11) {
            System.out.println("Your Birth month is November");
        } else if (birthMonth == 12) {
            System.out.println("Your Birth month is December!");

        } else{
            System.out.println("You inputted an invalid month: " + birthMonth);
        }
    }
}
