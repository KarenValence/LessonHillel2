
public class UserTracker {
    private String name;
    private  int date;
    private String month;
    private int year;
    private String eMail;
    private long phone;
    private String surname;
    private int weight;

    private float bloodPress;
    private int step;



    public String getName() {
        return name;
    }

    public String getMonth() {
        return month;
    }

    public int getDate() {
        return date;
    }

    public int getYear() {
        return year;
    }

    public long getPhone() {
        return phone;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
        public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
        public float getBloodPress() {
        return bloodPress;
    }

    public void setBloodPress(float bloodPress) {
        this.bloodPress = bloodPress;
    }
       public int getStep() {
        return step;
    }

    public void setStep(int step) {
        this.step = step;
    }
    public UserTracker(String name, String surname, int date, String month,int year, int age, String eMail, long phone,
                       int weight, float bloodPress, int step) {
        this.name = name;
        this.surname = surname;
        this.bloodPress = bloodPress;
        this.weight = weight;
        this.date = date;
        this.eMail = eMail;
        this.phone = phone;
        this.year = year;
        this.step = step;
        this.month = month;
    }
    private int age;
    public int getAge() {
        return age;
    }


    public void printAccountInfo(){
        int presentYear = 2020;
        age = presentYear - year;
        System.out.println("User: " + getName() + "  " + getSurname() + ": " + "\n Date of birthday: "
        + getDate() + "." + getMonth() + "." + getYear() + "\n Age: " + getAge() + "\n Email: " + this.eMail +
                "\n Phone Number: " + getPhone() + "\n Weight " + getWeight() + "\n Tension: " + getBloodPress() +
                "\n Steps per day: " + getStep() + ".");

        System.out.println();



    }
}
