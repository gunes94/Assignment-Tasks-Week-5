public class StudentTest2 {

  public static void main(String[] args) {

    Student student1 = new Student("Петров", "Иван", 12, 6);
    Student student2 = new Student("Хаджиева", "Теодора", 15, 9);
    Student student3 = new Student("Енчев", "Емил", 18, 12);

    System.out.println(student1);
    System.out.println(student2);
    System.out.println(student3);

    System.out.println();

    student1.increaseAge();
    student2.increaseAge(5);
    student3.goToNextClass();
  }
}
