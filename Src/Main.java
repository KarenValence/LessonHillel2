public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Will", "Smith", "New York", "2936729462846");
        Person person2 = new Person("Jackie", "Chan", "Shanghai", "12325436454");
        Person person3 = new Person("Sherlock", "Holmes", "London", "37754634686");
        System.out.println(person1.personInfo());
        System.out.println(person2.personInfo());
        System.out.println(person3.personInfo());
    }
}
