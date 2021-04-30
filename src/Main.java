public class Main {
    public static void main(String[] args) {

        UserManager userManager = new UserManager();
        Instructor instructor = new Instructor();
        InstructorManager instructorManager = new InstructorManager();
        Student student = new Student();
        Student student1 = new Student();
        StudentManager studentManager = new StudentManager();

        // Kullanicilar turlerine gore dizilere aktariliyor
        User[] users = {instructor, student, student1};
        Instructor[] instructors = {instructor};
        Student[] students = {student, student1};

        // instructor kullanicisi tanimlaniyor
        instructor.setId(1);
        instructor.setFirstName("Engin");
        instructor.setLastName("Demirog");
        instructor.setEmail("engin@gmail.com");
        instructor.setPassword("123");

        // instructorManager fonksiyonlari kullaniliyor
        instructorManager.viewUser(instructor);
        instructorManager.add(instructor);
        instructorManager.delete(instructor);
        instructorManager.logIn(instructor);
        instructorManager.logOut(instructor);

        // student kullanicilari tanimlaniyor
        student.setId(2);
        student.setFirstName("F_Name-1");
        student.setLastName("L_Name-1");
        student.setEmail("f_name1@gmail.com");
        student.setPassword("456");
        student.setGrade(2);

        student1.setId(3);
        student1.setFirstName("F_Name-2");
        student1.setLastName("L_Name-2");
        student1.setEmail("f_name2@gmail.com");
        student1.setPassword("789");
        student1.setGrade(4);

        // studentManager fonksiyonlari kullaniliyor
        studentManager.viewMultipleUser(students);
        studentManager.addMultiple(students);
        studentManager.deleteMultiple(students);
        studentManager.logIn(student);
        studentManager.logOut(student);
        studentManager.logIn(student1);
        studentManager.logOut(student1);
    }
}
