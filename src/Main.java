//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var cls = new User("Asadov", "Elmir");
        var res = cls.getFullName();
        System.out.println(res);
    }
}