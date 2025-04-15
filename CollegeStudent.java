public class CollegeStudent {
    private String myMajor;
    private int myYear;
}

public CollegeStudent(String myName, int myAge, String myGender, String myIdNum, double myGPA, int year, String major){
    super(myName, myAge, myGender, myIdNum, myGPA);
    myMajor = major;
    myYear = year;
}
