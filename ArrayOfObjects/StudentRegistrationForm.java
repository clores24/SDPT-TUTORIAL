package ArrayOfObjects;

public class StudentRegistrationForm {
    private String firstname, middlename, lastname;
    private int age;
    private char gender;
    private String nationality;
    private String year;
    private String course;
    private String section;

    StudentRegistrationForm(
        String firstname,
        String middlename,
        String lastname,
        int age,
        char gender,
        String nationality,
        String year,
        String course,
        String section){
            this.firstname = firstname;
            this.middlename = middlename;
            this.lastname = lastname;
            this.age = age;
            this.gender = gender;
            this.nationality = nationality;
            this.year = year;
            this. course = course;
            this.section = section; 
    }

    void welcome(String schoolRegistrar){
        System.out.println("Welcome " + firstname + " " + lastname);
        System.out.println("Thank You for choosing us! from " + schoolRegistrar);
    }
        
    void registeredStudents(){
        System.out.println("Fulllname:   " + firstname + " " + middlename + ". " + lastname);
        System.out.println("Age:         " + age);
        System.out.println("Gender:      " + gender);
        System.out.println("nationality: " + nationality);
        System.out.println("year:        " + year);
        System.out.println("course:      " + course);
        System.out.println("section:     " + section);
        

    }

    public String getFirstname() {
        return firstname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    public String getYear() {
        return year;
    }

    public String getNationality() {
        return nationality;
    }

    public String getCourse() {
        return course;
    }

    public char getGender() {
        return gender;
    }

    public String getSection() {
        return section;
    }

}
