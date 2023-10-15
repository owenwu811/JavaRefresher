public class main {
    public static void main(String[] args) {
        person p = new person();
        p.setName("John");
        p.setAge(30);

        System.out.println("Name: " + p.getName());
        System.out.println("Age: " + p.getAge());
    }
}