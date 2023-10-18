public class elseIf {
    public static void main(String[] args) {
        int age = 13;
        if (age >= 18) {
            System.out.println("ADULT");
        } else if (age >= 13 && age < 18) {
            System.out.println("TEENAGER");
        } else {
            System.out.println("CHILD");
        }
    }
}
