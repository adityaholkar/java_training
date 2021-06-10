

class Person{
    //if class is public then file name must be same as public class
    //class contain:
        //  1.data    2.method
    String name;
    int age;
    int calculateYearsToRetire(){
        int yearLeft = 65-age;
        return yearLeft;
    }
    void show(){
        System.out.println("Name of user is "+name+" and user is "+age+" years old");
    }
    int getAge(){
        return age;
    }
    String getName(){
        return name;
    }
}


public class App {
    public static void main(String[] args) throws Exception {
        Person person1 = new Person();
        person1.name="Adam Smith";
        person1.age = 29;
        //person1.show();
        int retireAge = person1.calculateYearsToRetire();
        System.out.println("Name is: "+person1.getName()+"\n age is: "+person1.getAge());
        System.out.println("Years left for retirement for: "+retireAge);
        Person person2 = new Person();
        person2.name = "befjb djbfebf";
        person2.age = 40;
        //System.out.println("Person 1 name and age is " + person1.name+" "+person1.age);
        //System.out.println("Person 2 name and age is " + person2.name+" "+person2.age);
        person2.show();

    }
}
