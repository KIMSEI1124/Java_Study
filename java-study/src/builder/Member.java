package builder;

public class Member {
    private String name;
    private String gender;
    private int age;
    private String email;
    private String phone;
    private String address;
    private String job;
    private String hobby;
    private int money;
    private boolean hasCar;

    private boolean hasHome;

    public Member() {

    }

    public Member(String name, String gender, int age, String email, String phone, String address, String job, String hobby, int money, boolean hasCar, boolean hasHome) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.job = job;
        this.hobby = hobby;
        this.money = money;
        this.hasCar = hasCar;
        this.hasHome = hasHome;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void setHasCar(boolean hasCar) {
        this.hasCar = hasCar;
    }

    public void setHasHome(boolean hasHome) {
        this.hasHome = hasHome;
    }
}
