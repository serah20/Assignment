package assignment.pkg2;
public class Assignment2 {
    
    public static void main(String[] args) {
       int limit = 10;
        int previous = 0;
        int current = 1;
        for (int i = 1; i <= limit; i++) {
            System.out.print(current + " ");
            int next = previous + current;
            previous = current;
            current = next;
        }
    }
}
