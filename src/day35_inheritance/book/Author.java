package day35_inheritance.book;

import my_utilities.StringUtil1;

public class Author {

    private String name;
    private int age;

    public Author(String name, int age) {
        //this.name = name;
        setName(name);
       // this.age = age;
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String result = "";
        for (String each : name.split(" ")) {
            result += StringUtil1.FixFormat(each) + " ";

        }
        //result = "Jojo_Moyes_"

        this.name = result.trim();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        //this.age = age;

        if (age > 10) {
            this.age = age;

        }
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
