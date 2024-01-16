package hw11UseOfSuperInChildClass;

public class TestFamily {

	public static void main(String[] args) {

		Father father = new Father();
		Father father2 = new Father("Rakib", 100, 'M', true);

		Daughter daughter = new Daughter();
		Daughter daughter2 = new Daughter("January", 30);

		daughter.daughter();
		daughter.daughterInfo("December", 40);
	}

}
