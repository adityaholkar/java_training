public class Person {
    private int id;

    public Person(int id) {
        this.id = id;
    }
    class Name{
        public void showDetails(){
            System.out.println("The name is adam and id is: "+ id);
        }
    }
    public void intro(){
        System.out.println("Intro....");
        Name name = new Name();
        name.showDetails();
    }
    public static class Car{
        public void Own(){
            System.out.println("Adam own the car...");
        }
    }
}
