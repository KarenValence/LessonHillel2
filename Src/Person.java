public class Person {
    public Person(String name, String surname, String city, String phone) {
        this.name = name;
        this.surname = surname;
        this.city = city;
        this.phone = phone;
    }
    public String personInfo() {
        return "Позвонить гражданину " + name + " " + surname + " из города " + city + " можно по номеру " + phone;
    }
    private String name;
    final String surname;
    final String city;
    final String phone;
}