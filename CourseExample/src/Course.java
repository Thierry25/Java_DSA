public class Course {
    private String courseName;
    private String[] students;
    private int numberOfStudents;

    public Course(){}

    public Course(String courseName){
        this.courseName = courseName;
        this.numberOfStudents = 0;
        students = new String[60];
    }

    public String getCourseName(){
        return this.courseName;
    }

    public String[] getStudents(){
        return this.students;
    }

    public int getNumberOfStudents(){
        return this.numberOfStudents;
    }

    public void addStudent(String student){
        if(this.numberOfStudents < 60){
            this.students[this.numberOfStudents] = student;
        }
        this.numberOfStudents++;
        System.out.printf("%s successfully added to %s", student, this.courseName);
    }

    public void dropStudent(String student){
        for(String s: this.students){
            if(s.equals(student)){
               // this.stu
            }
        }
    }
}
