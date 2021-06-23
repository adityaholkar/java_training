import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class Person {
    private int id;
    private String name;
     
    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }
 
    public int getId() {
        return id;
    }
 
    public void setId(int id) {
        this.id = id;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
     
    public String toString() {
        return id + ": " + name;
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        List<Integer>arrayList = new ArrayList<Integer>();
        arrayList.add(12);
        arrayList.add(34);
        arrayList.add(1);
        arrayList.add(24);
        Collections.sort(arrayList,new Comparator<Integer>(){

            @Override
            public int compare(Integer o1, Integer o2) {
                // TODO Auto-generated method stub
                return -o1.compareTo(o2);
            }
            
        });

        for(Integer i:arrayList){
            System.out.println(i);
        }



        //sorting object


        List<Person> people = new ArrayList<Person>();
         
        people.add(new Person(1, "Joe"));
        people.add(new Person(3, "Bob"));
        people.add(new Person(4, "Clare"));
        people.add(new Person(2, "Sue"));
         
        // Sort in order of ID
        Collections.sort(people, new Comparator<Person>() {
            public int compare(Person p1, Person p2) {
 
                if(p1.getId() > p2.getId()) {
                    return 1;
                }
                else if(p1.getId() < p2.getId()) {
                    return -1;
                }
                 
                return 0;
            }
        });
         
        for(Person person: people) {
            System.out.println(person);
        }
         
        System.out.println("n");
        // Sort in order of name
        Collections.sort(people, new Comparator<Person>() {
            public int compare(Person p1, Person p2) {
                return p1.getName().compareTo(p2.getName());
            }
        });
         
        for(Person person: people) {
            System.out.println(person);
        }
         
    
 


    }
}
