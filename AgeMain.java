public class AgeMain{
    public static void main(String[] args) {
        Age a = new Age();
        boolean one = a.isTeenAger(20);
        System.out.println(one + " : should be false");
        boolean two = a.isTeenAger(15);
        System.out.println(two + " : should be true");
    }

}