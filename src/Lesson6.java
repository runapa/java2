public class Lesson6 {
    public static void main(String[] args) {
        Student anton = new Student();
        anton.firstName = "Anton";
        anton.age = 22;
        anton.group = "IT-8";

        Student natali = new Student();
        natali.firstName = "Natali";

        Animal dog = new Animal("Pirat", 12, Gender.MALE);
        Animal cat = new Animal("Barsik", 7, Gender.MALE);
        Animal pig = new Animal("Pepa", 3, Gender.FEMALE);

        Animal[] zoo = {cat, dog, pig};
        Animal oldest = getOldestAnimal(zoo);
    }

    public static Animal getOldestAnimal(Animal[] zoo){
        int maxAgeIndex = 0;

        for (int i = 1; i < zoo.length; i++) {
            Animal maxAgeAnimal = zoo[maxAgeIndex];
            Animal current = zoo[i];
            if(current.age > maxAgeAnimal.age){
                maxAgeIndex = i;
            }
        }
        Animal oldestAnimal = zoo[maxAgeIndex];
        System.out.println("Max Name: " + oldestAnimal.name);
        System.out.println("Max Age: " + oldestAnimal.age);
        return oldestAnimal;
    }
}
