public class Work {

    public static void main(String[] args) {
        Instructor instructor =new Instructor();
        instructor.allSet(1, "Yusuf", "yusuf@gmail.com");
        instructor.addIns(instructor);
        User user=new User();
        user.allSet(1, "Yusuf.49", 58);
        user.addUser(user);
        Student student=new Student();
        student.allSet(1, "yusuf", 60);
        student.addStudent(student);
    }
    
}
