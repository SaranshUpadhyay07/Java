public class Section_7_6_javaLang extends Object {
    public static void main(String[] args) {
        Student Saransh = new Student("Saransh", 19);
        System.out.println(Saransh); // prints out the name of the class followed by the @ and then hash code of the object
        chotaBalak niraj = new chotaBalak("Niraj", 8, "Raja");
        System.out.println(niraj);
    }
}
class Student {
    private String name;
    private int age;

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
            return name+ " is "+ age +" years old";
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
    }
}
class chotaBalak extends Student{
    private String parent;
    chotaBalak(String name, int age, String parent){
        super(name, age);
        this.parent = parent;
    }

    @Override
    public String toString() {
        return parent+"'s child, "+ super.toString();
    }
}
