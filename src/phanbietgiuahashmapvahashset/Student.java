package phanbietgiuahashmapvahashset;


public class Student implements Comparable<Student> {
    private String name;
    private Integer age;
    private String address;

    public Student(String name, Integer age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + ", address='" + address + "'}";
    }

    @Override
    public int compareTo(Student student) {
        return this.getName().compareTo(student.getName()); // Sắp xếp theo tên
    }
}
