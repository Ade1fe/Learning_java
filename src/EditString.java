import java.util.Scanner;
import java.util.Locale;
    public class EditString {
        String new1 = "All dogs goes to heaven", oldWorld;
        String newt = " ";
        Scanner waoh = new Scanner(System.in);
        public void main(String[] args){
            EditString edit = new EditString();
            edit.call();
        }
        public void call(){
            while (!newt.equalsIgnoreCase("X")){
                newt = new Scanner(System.in).nextLine().toLowerCase();
                switch (newt){
                    case "u": uppercase(); break;
                    case "l": lowercase(); break;
                    case "r": reverseString(); break;
                    case "c": replaceString(); break;
                    case "z": undoString(); break;
                    default:
                        System.out.println("Thank you for Banking with us");
                }
            }
            System.out.println("End: "+ newt);
        }
        public void uppercase() {
            oldWorld = new1;
            new1 = new1.toUpperCase();
        }
        public void lowercase() {
            oldWorld =new1;
            new1 = new1.toLowerCase();
        }
        public void reverseString() {
            oldWorld = new1;
            StringBuilder s1 = new StringBuilder(new1);
            s1.reverse();

        }
        public void replaceString() {
            String input1 = waoh.nextLine();
            String input2 = waoh.nextLine();
            new1 = new1.replace(input1, input2);
        }

        public void undoString() {
            new1 = oldWorld;
        }

        public void exit(){
            System.out.println("Enter your character(s): ");
        }
    }


