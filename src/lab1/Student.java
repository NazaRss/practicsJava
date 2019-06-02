package lab1;

public class Student {

    private String Name;
    private Student Pomoshnik;
    private String Kafedra;

    public Student(String name) {
        this.Name = name;
    }

    public String getName() {
        return this.Name;
    }

    public void printInf() {

        System.out.println("Name: " + this.Name + "\nPomoshnik: " + this.Pomoshnik.getName());

    }

    public void setPomoshnik(Student pom) {
        this.Pomoshnik = pom;
    }
}
