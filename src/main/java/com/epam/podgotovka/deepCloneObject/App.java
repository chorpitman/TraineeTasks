package podgotovka.deepCloneObject;

/**
 * Created by Oleg on 20.12.15.
 */
public class App {
    public static void main(String[] args) {
        User user = new User();
        user.setName("Oleg");
        user.setAge(16);
        user.setBirthday(12,03,2015);

        System.out.println("before cloning "  + user.getName() +  " - " +
        + user.getAge() + " day,month, year " + user.getBirthday());

        try {
            User clone = (User)user.clone();
            clone.setName("Петров");
            clone.setAge(30);
            clone.setBirthday(15, 11, 1992);

            System.out.println("Клон после изменения данные: " + clone.getName() + " - " + clone.getAge() + "лет, день рождение: " + clone.getBirthday());

        } catch (CloneNotSupportedException e) {
            System.out.println("Объект не может быть клонированным.");
        }

        System.out.println("Оригинал, после манипуляций с клоном: "
                + user.getName() +
                " - " + user.getAge() +
                "лет, день рождение: " + user.getBirthday());
    }
}
