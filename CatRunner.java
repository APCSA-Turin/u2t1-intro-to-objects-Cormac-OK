public class CatRunner {
    public static void main(String[] args){
        Cat cat1 = new Cat("Thomas", 10, 13);
        cat1.introduce();
        cat1.printCatInfo();

        Cat cat2 = new Cat("Lester", 3, 7.8);
        cat2.printCatInfo();
        cat2.introduce();
    }
}
