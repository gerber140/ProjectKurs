package pl.kurs.zad1;

public class Osoba implements Comparable<Osoba>{
    private final String name;
    private final int age;

    public Osoba(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Osoba o) {
        return Integer.compare(age,o.age);
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
