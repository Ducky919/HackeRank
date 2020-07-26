// Muc dich cua function la tra ve danh sach nhung object thoa man age = 65
// Input : Arraylist bao gom object (Ten,Tuoi,Nghe Nghiep)
// Output : Arraylist bao gom nhung object thoa man yeu cau muc dich

import java.util.*;


public class Person {
    private final String name;
    int age;
    String job;
    public Person(String name, int age, String job ){
        this.name = name;
        this.age = age;
        this.job = job;
    }

    // Method tra ve danh sach cac object theo dieu kien tuoi tu user input
//    public static ArrayList<Person> getPersonList(ArrayList<Person> people, int inputAge) {
//        ArrayList<Person> resultPersonList = new ArrayList<>();
//        for (int i = 0; i < people.size(); i++) {
//            if (people.get(i).age == inputAge) {
//                resultPersonList.add(people.get(i));
//            }
//        }
//        return resultPersonList;
//    }

    // Method tra ve tat ca object group theo tuoi
    public static  HashMap<Integer, ArrayList<Person>> getPersonByAge(ArrayList<Person> people) {
        HashMap<Integer, ArrayList<Person>> resultHashMap = new HashMap<Integer, ArrayList<Person>>(); // create an empty hashmap
        for (Person person : people) { // loop through each person in people list
            Integer age = person.age;   // get age as key
            if(resultHashMap.containsKey(age)) {   // if age in person is already found as key in result hashmap
                ArrayList<Person> personList = resultHashMap.get(age);
                personList.add(person);
            } else {
                ArrayList<Person> personList = new ArrayList<Person>();
                personList.add(person);
                resultHashMap.put(age,personList);
            }
        }
        return resultHashMap;
    }


    public static void main(String []args) {
        int numberOfPeople = 100;

        // Tao ra mot list 100 object voi du lieu random
        Random random = new Random();
        String job = "Job";
        String name = "Name";
        ArrayList<Person> people = new ArrayList<>();
        for (int i = 0; i < numberOfPeople; i++) {
            int age = random.nextInt(101);
            Person person = new Person(name + age, age, job + age);
            people.add(person);
        }

        HashMap<Integer, ArrayList<Person>> groupByAgePeople = getPersonByAge(people);

        for(HashMap.Entry<Integer, ArrayList<Person>> eachAgeGroup: groupByAgePeople.entrySet()) {
            int age = eachAgeGroup.getKey();
            ArrayList<Person> personList = eachAgeGroup.getValue();
            System.out.println("Number of people that have age = " + age + ":");
            for(Person person : personList) {
                System.out.println("\t " + person.name + ", " + person.age + ", " + person.job);
            }
        }

        // Nhap thong tin tuoi tu user input
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Input Age");
//        int inputAge = sc.nextInt();

        // Xuat ra danh sach cac object thoa man dieu kien age theo user input
        // People that has age follow by user input
//        ArrayList<Person> ageInputPeople = getPersonList(people,inputAge);
//        for (int i = 0; i < ageInputPeople.size(); i++) {
//            Person person = ageInputPeople.get(i);
//            System.out.printf("%s %s %s \n",person.name,person.age,person.job);
//        }
    }
}


