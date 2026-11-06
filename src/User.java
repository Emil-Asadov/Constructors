public class User {
    private String name;
    private String surname;

    private String fullName;

    public User() {//parametersiz constructor
        System.out.println("Parametersiz constructor");
    }

    public User(String surname, String name) {//iki parameterli constructor
        this.surname = surname;
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullName() {
        fullName = new StringBuilder(surname).append((char) 32).append(name).toString();
        return fullName;
    }
}
