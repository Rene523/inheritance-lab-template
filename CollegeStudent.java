public class CollegeStudent extends Student{
    private String myMajor;
    private int myYear;


public CollegeStudent(String myName, int myAge, String myGender, String myIdNum, double myGPA, int year, String major){
    super(myName, myAge, myGender, myIdNum, myGPA);
    myMajor = major;
    myYear = year;
}

public int getYear(){
    return myYear;
}
public void setYear(int year){
    myYear=year;
}
public String getMajor(){
    return myMajor;
}
public void setMajor(String major){
    myMajor=major;
}

public String toString(){
    return super.toString() + ", College Student Year : " + myYear + ", major: " + myMajor;
}

}