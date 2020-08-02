import java.util.*;
class Student1 implements Comparable {
    private int id;
    private String fname;
    private double cgpa;
    public Student1(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }


    @Override
    public int compareTo(Object o) {
        Student student = (Student)o;
        if (cgpa == student.cgpa) {
            if (fname.equals(student.fname)) {
                return id - student.id;
            } else {
                return fname.compareTo(student.fname);
            }
        } else {
            //return (student.cgpa - cgpa);
            if (student.cgpa - cgpa > 0) {
                return 1; // positive number means greater
            } else {
                return -1; // Negative number means less than
            }
        }
    }
}
//Complete the code
public class JavaSortComparable
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        List<Student> studentList = new ArrayList<Student>();
        while(testCases>0){
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();
            Student st = new Student(id, fname, cgpa);
            studentList.add(st);
            testCases--;
        }
        Collections.sort(studentList);
        for(Student st: studentList){
            System.out.println(st.getFname());
        }
    }
}