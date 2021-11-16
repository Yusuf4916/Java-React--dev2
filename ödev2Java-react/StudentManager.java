public class StudentManager {
    

    public void addStudent(Student student)
    {
        System.out.println("Öğrenci id :"+student.getId());
        System.out.println("Öğrenci adı :"+student.getName());
        System.out.println("Öğrenci notu:"+student.getNote());
    }
}
