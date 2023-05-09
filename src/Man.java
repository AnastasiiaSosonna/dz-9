public class Man extends Person {

    Man(String firstName, String lastName, int age, boolean partner) {
        super(firstName, lastName, age, partner);
    }

    public boolean isRetired(int age) {
        if (age > 65) {
            return true;
        } else return false;
    }
}
