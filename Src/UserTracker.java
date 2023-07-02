
public class UserTracker {
    private String name;
    private  int date;
    private String month;
    private int year;
    private int age;
    private String eMail;
    private long phone;
    public String surname;
    public int weight;

    public float bloodPress;
    public int step;

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

    public int getAge() {
        return age;
    }

    public long getPhone() {
        return phone;
    }

    public String getSurname() {
        return surname;
    }

    public int getWeight() {
        return weight;
    }

    public float getBloodPress() {
        return bloodPress;
    }

    public int getStep() {
        return step;
    }

    public String geteMail() {
        return eMail;

    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setBloodPress(float bloodPress) {
        this.bloodPress = bloodPress;
    }

    public void setStep(int step) {
        this.step = step;
    }

    public UserTracker(String name, String surname, int date, String month,int year, int age, String eMail, long phone,
                       int weight, float bloodPress, int step) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.bloodPress = bloodPress;
        this.weight = weight;
        this.date = date;
        this.eMail = eMail;
        this.phone = phone;
        this.year = year;
        this.step = step;
        this.month = month;

    }


}
