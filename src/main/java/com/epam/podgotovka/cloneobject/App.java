package podgotovka.cloneObject;

public class App {
    public static void main(String[] args) {
        User user = new User();
        user.setName("Oleg");
        user.setAge(31);
        System.out.println("before cloning " + user.getName() + " " + user.getAge() );

        try {
            User clone = user.clone();
            clone.setName("Tanya");
            clone.setAge(30);
            System.out.println("after cloning " + clone.getName() + " "+ clone.getAge());
        } catch (CloneNotSupportedException e) {
            System.out.println("object cant be cloning");
            e.printStackTrace();
        }
    }
}
