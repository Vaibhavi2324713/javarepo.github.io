//encapsulation


class Student {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }
}

// ✅ File name = fd.java → So public class name must be fd
public class fd {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Harshada");
        s.setAge(20);

        System.out.println("Student Name: " + s.getName());
        System.out.println("Student Age: " + s.getAge());
    }
}
