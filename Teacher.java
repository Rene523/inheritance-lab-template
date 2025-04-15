public class Teacher extends Person{
    
    // TODO: Add fields.
    private String mySubject;
    private double mySalary;

    public Teacher (String myName, int myAge, String myGender, String subject, double salary){
        super(myName, myAge, myGender);
        mySubject = subject;
        mySalary = salary;
    }

    public Teacher(String name, int age, String gender)
    {
        super(name, age, gender);
        
    }

    public String getSubject(){
        return mySubject;
    }
    public void setSubject(String subject){
        mySubject=subject;
    }
    public double getSalary(){
        return mySalary;
    }
    public void setSalary(double salary){
        mySalary=salary;
    }

    

    // TODO Add methods

    public String toString(){
        // TODO: improve this.
        return super.toString() + ", Teacher subject: " + mySubject + ", salary: " + mySalary;
    }
}
