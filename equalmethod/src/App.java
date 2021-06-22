class Person{
    private int id;
    private String name;
    public Person(int id,String name){
        this.id = id;
        this.name = name;
    }
   
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        if (id != other.id)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "person id is "+id+" and name is "+name;
    }
    
}
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(new Object());
        Person person1 = new Person(12,"adam");
        Person person2 = new Person(12,"adam");
        System.out.println(person1.equals(person2));
        Double d1 =45.56;
        Double d2 = 45.56;
        System.out.println(d1 == d2);//== only works with int
    }
}
