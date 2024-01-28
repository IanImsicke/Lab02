import java.util.Calendar;

public class Person
{
    private String ID;
    private String firstName;
    private String lastName;
    private String title;
    private int YOB;
    static private int IDSeed =  1;

    public static void setIDSeed(int IDSeed) {
        Person.IDSeed = IDSeed;
    }

    public static int getIDSeed() {
        return IDSeed;
    }

    public Person(String ID, String firstName, String lastName, String title, int YOB)
    {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.YOB = YOB;
    }

    public Person(String firstName, String lastName, String title, int YOB)
    {
        this.ID = this.genID();
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.YOB = YOB;
    }


    public String getID() {
        return ID;
    }

    private String genID() {
        String newID = "" + IDSeed;
        while(newID.length() < 8)
        {
            newID = "0" + newID;
        }

        IDSeed++;

        return newID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYOB() {
        return YOB;
    }

    public void setYOB(int YOB) {
        this.YOB = YOB;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String fullName()
    {
        return firstName + " " + lastName;
    }

    public String formalName()
    {
        return title + " " + fullName();
    }

    public String getAge()
    {
        int age = 2024 - YOB;
        return Integer.toString(age);
    }

    public String getAge(int specifiedYear)
    {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, specifiedYear);
        int age = specifiedYear - YOB;
        return Integer.toString(age);
    }


    @Override
    public String toString() {
        return "Person{" +
                "ID='" + ID + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", title='" + title + '\'' +
                ", YOB=" + YOB +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return YOB == person.YOB && ID.equals(person.ID) && firstName.equals(person.firstName) && lastName.equals(person.lastName) && title.equals(person.title);
    }



    public String toJSONRecord()
    {
        String retString = "";
        char DQ = '\u0022';  // Assign the double quote char to a variable
        retString =  "{" + DQ + "ID" + DQ + ":" + DQ + this.ID + DQ + ",";
        retString += DQ + "firstName" + DQ + ":" + DQ + this.firstName + DQ + ",";
        retString += " " + DQ + "lastName"  + DQ + ":" + DQ + this.lastName + DQ + ",";
        retString += " " + DQ + "title" + DQ + ":" + DQ + this.title +DQ + ",";
        retString += " " + DQ + "YOB"  + DQ + ":" + this.YOB + "}";

        return retString;
    }

    public String toXMLRecord()
    {
        String retString = "";

        retString = "<Person>" + "<ID>" + this.ID + "</ID>";
        retString += "<firstName>" + this.firstName + "</firstName>";
        retString += "<lastName>" + this.lastName + "</lastName>";
        retString += "<title>" + this.title + "</title";
        retString += "<YOB>" + this.YOB + "</YOB></Person>";

        return retString;
    }
    public String toCSVRecord() {
        return  this.ID + ", " + this.firstName + "," + this.lastName + "," + this.title + "," + YOB;
    }
}