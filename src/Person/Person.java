package person;

import java.util.ArrayList;
import java.util.List;

public class Person implements Comparable<Person> {
    //This list contains the phone numbers.
    List<Long> list = new ArrayList<>();
    private String fName;
    private String lName;
    private String email;
    private long phoneNumber;

    public Person() {
    }

    public Person(String fName, String lName, String email, long phoneNumber, List<Long> list) {
        this.fName = fName;
        this.lName = lName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.list = list;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
        list.add(phoneNumber);
    }

    public List<Long> getList() {
        return list;
    }

    //This method addString() add the list of phone number in StringBuilder in particular format.
    private StringBuilder addString() {
        StringBuilder sb = new StringBuilder();
        int k = 0;
        for (long i : list) {
            sb.append(i);
            k++;
            sb.append((k <= list.size() - 1 ? "," : ""));
            sb.append(" ");
        }
        return sb;
    }

    @Override
    public String toString() {
        return "-------- * -------- * -------- * --------\n" +
                "First Name: " + fName + "\n" +
                "Last Name: " + lName + "\n" +
                (list.size() == 1 ? "Contact Number: " : "Contact Number(s):") + addString() + "\n" +
                "Email Address: " + email + "\n" +
                "-------- * -------- * -------- * --------";
    }

    //This method compare the fName of two persons.
    @Override
    public int compareTo(Person person) {
        return fName.compareTo(person.fName);

    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Person guest = (Person) obj;
        return fName.compareToIgnoreCase(guest.fName) >= 1;
    }


}