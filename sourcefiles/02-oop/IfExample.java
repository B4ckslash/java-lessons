public class IfExample {
    public static void main(String[] args) {
        int check = 16;
        String empty = "";

        if(check == 15) {
            System.out.println("Check is divisible by 3");
        }

        if(!empty.isEmpty()) {
            System.out.println("String contains: " + empty);
        }else if(empty.equals("Test")) {
            System.out.println("String is the same as Test");   
        }else {
            if(empty.isEmpty()) System.out.println("String is empty");
        }
    }
}
