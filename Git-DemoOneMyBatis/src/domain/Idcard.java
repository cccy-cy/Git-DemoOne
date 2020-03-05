package domain;

public class Idcard {
    //cid number city Person
    private Integer cid;
    private String number;
    private String city;
    private Person person;

    public Idcard(){}

    public Idcard(Integer cid, String number, String city, Person person) {
        this.cid = cid;
        this.number = number;
        this.city = city;
        this.person = person;
    }

    @Override
    public String toString() {
        return "Idcard{" +
                "cid=" + cid +
                ", number='" + number + '\'' +
                ", city='" + city + '\'' +
                ", person=" + person +
                '}';
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
