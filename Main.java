public class Main
{
  public static void main(String [] args)
  {
    // Student(String name, int age, String gender, String idNum, double gpa)
    Person me = new Student("H", 3, "F", "2584", 4.0);
    
    System.out.println("Hi, " + me.getName() + ". What's your GPA?");
    System.out.println("My GPA is: " + ((Student)me).getGPA());

    Teacher you = new Teacher("C", 30, "F");
    System.out.println("My teacher is: " + you.getName());

    Person bob = new Person("Coach Bob", 27, "M");
  System.out.println(bob);

  Student lynne = new Student("Lynne Brooke", 16, "F", "HS95129", 3.5);
  System.out.println(lynne);

  Teacher mrJava = new Teacher("Duke Java", 34, "M", "Computer Science", 50000);
  System.out.println(mrJava);

  CollegeStudent ima = new CollegeStudent("Ima Frosh", 18, "F", "UCB123",
                                         4.0, 1, "English");
  System.out.println(ima);
  }
}
