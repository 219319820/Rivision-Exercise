package za.ac.cput;

/**
 * @author Justin Nkuna -219319820
 */




public class Person {

    private String personName;
    private String personSurname;
    private int personAge;
    private String personGender;

    public Person(){

    }
    public Person(String pname, String pSurname, int pAge, String pGender){
        this.personName = pname;
        this.personSurname = pSurname;
        this.personAge = pAge;
        this.personGender = pGender;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonSurname() {
        return personSurname;
    }

    public void setPersonSurname(String personSurname) {
        this.personSurname = personSurname;
    }

    public int getPersonAge() {
        return personAge;
    }

    public void setPersonAge(int personAge) {
        this.personAge = personAge;
    }

    public String getPersonGender() {
        return personGender;
    }

    public void setPersonGender(String personGender) {
        this.personGender = personGender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personName='" + personName + '\'' +
                ", personSurname='" + personSurname + '\'' +
                ", personAge=" + personAge +
                ", personGender='" + personGender + '\'' +
                '}';
    }

}
