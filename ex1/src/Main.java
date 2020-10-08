public class Main {

    public static void main(String[] args) {
        Peoples human = new Peoples("Ivan");
        human.setSkinColor("White");
        human.setGender("Male");
        human.setAge(20);

        System.out.println(human.getSkinColor());
        System.out.println(human.getName());
        System.out.println(human.getGender());
        System.out.println(human.getAge());
        System.out.println("___________________________________________________");
        human.live();
        human.sayAge();
    }
}
