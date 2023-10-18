public class typePromotion {
    public static void main(String[] args) {
        char a = 'a';
        char b = 'b';
        System.out.println(b-a);
    }
}

// JAVA automatically promotes each byte, short or char operand to int when evaluating expression
// If one operand is long, float or double the whole expression is promoted to long, float or double respectively