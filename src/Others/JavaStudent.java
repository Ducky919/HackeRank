package Others;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

class Student4 {
    private final String name;
    private final int age;
    private final LocalDate birthday ;
    public Student4(String name, int age, LocalDate birthday) {
//        super();
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public LocalDate getBirthday() {
        return birthday;
    }
}
public class JavaStudent {
    public static List<Student4> compareByName(List<Student4> studentList) {
        return studentList.stream()
                .sorted(Comparator.comparing(Student4::getName)
                .thenComparing(Comparator.comparingInt(Student4::getAge).reversed())
                .thenComparing(Student4::getBirthday))
                .collect(Collectors.toList());
    }
    public static List<Student4> compareByAge(List<Student4> studentList) {
        return studentList.stream()
                .sorted(Comparator.comparingInt(Student4::getAge).reversed()
                .thenComparing(Comparator.comparing(Student4::getName)
                .thenComparing(Student4::getBirthday)))
                .collect(Collectors.toList());
    }
    public static List<Student4> compareByBirthDay(List<Student4> studentList) {
        return studentList.stream()
//                .filter(n -> n.getName().startsWith("a"))
                .sorted(Comparator.comparing(Student4::getBirthday)
                .thenComparing(Comparator.comparingInt(Student4::getAge).reversed())
                .thenComparing(Student4::getName))
                .collect(Collectors.toList());
    }

    private static int randBetween(int start, int end) {
        return start + (int) Math.round(Math.random() * (end - start));
    }

    private static LocalDate generateRandomBirthDay() {
        GregorianCalendar gc = new GregorianCalendar();

        int year = randBetween(1900, 2020);

        gc.set(Calendar.YEAR, year);

        int dayOfYear = randBetween(1, gc.getActualMaximum(Calendar.DAY_OF_YEAR));

        gc.set(Calendar.DAY_OF_YEAR, dayOfYear);

        return LocalDate.of(gc.get(Calendar.YEAR), gc.get(Calendar.MONTH) + 1, gc.get(Calendar.DAY_OF_MONTH));
    }

    private static String generateRandomName(String aToZ) {
        Random rand = new Random();
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < 12; i++) {
            int randIndex = rand.nextInt(aToZ.length());
            res.append(aToZ.charAt(randIndex));
        }
        return res.toString();
    }

    public static void main(String[] args) {
        int testCases = 10;
        String aToZ = "ABCDEFGXYZGHIOPQWMN ";
        List<Student4> studentList1 = new ArrayList<Student4>();
        while (testCases > 0) {
            String name = generateRandomName(aToZ);
            int age = (int) (Math.random() * 100 + 1);
            ;
            LocalDate birthday = generateRandomBirthDay();
            Student4 st = new Student4(name, age, birthday);
            studentList1.add(st);
            testCases--;
        }
        Scanner sc = new Scanner(System.in);
        while (true) {
            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> studentList1 = compareByName(studentList1);
                case 2 -> studentList1 = compareByAge(studentList1);
                case 3 -> studentList1 = compareByBirthDay(studentList1);
                case 0 ->  {
                    System.out.println("End of process");
                    System.exit(1);
                }
                default -> {
                    System.out.println("Error");
                    System.exit(-1);
                }
            }
            for (Student4 st : studentList1) {
                System.out.printf("%s %d %s\n",st.getName(),st.getAge(),st.getBirthday().toString());
            }
        }

    }
}




