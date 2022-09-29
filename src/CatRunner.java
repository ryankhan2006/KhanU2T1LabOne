public class CatRunner {
    public static void main (String[] args)
    {
        Cat catOne= new Cat("Ryan", 10,32.5 );
        catOne.introduce();
        catOne.printCatInfo();

        Cat catTwo= new Cat("Nuha", 8, 33.0);
        catTwo.introduce();
        catTwo.printCatInfo();

    }
}
