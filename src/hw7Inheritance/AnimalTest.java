package hw7Inheritance;

public class AnimalTest {

	public static void main(String[] args) {

		Animal animal = new Animal();
		animal.animalInfo();

		Mammal mammal = new Mammal();
		mammal.mammalInfo();
		mammal.animalInfo(); // Hierarchical inheritance-

		Reptile reptile = new Reptile();
		reptile.reptileInfo();
		reptile.animalInfo(); // Hierarchical inheritance-

		Birds birds = new Birds();
		birds.birdsInfo();
		birds.animalInfo(); // Hierarchical inheritance-

		Dog dog = new Dog();
		dog.dogInfo();
		dog.mammalInfo();
		dog.animalInfo();

		BullDog bullDog = new BullDog();
		bullDog.bullDogInfo();
		bullDog.dogInfo(); // Single Inheritance- bulldog extends dog class
		bullDog.mammalInfo();
		bullDog.animalInfo(); // line 32- 29, multilevel inheritance. exp: bulldog - dog - mammal - Animal

		Snake snake = new Snake();
		snake.snakeInfo();
		snake.reptileInfo();
		snake.animalInfo();

		Cobra cobra = new Cobra();
		cobra.cobraInfo();
		cobra.snakeInfo();
		cobra.reptileInfo();
		cobra.animalInfo();

		Robin robin = new Robin();
		robin.robinInfo();
		robin.birdsInfo();
		robin.animalInfo();

	}

}
