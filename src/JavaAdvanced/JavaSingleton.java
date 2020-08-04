package JavaAdvanced;


class Singleton{

    // Create private constructor of Singleton class
    private Singleton(){}

    public String str;

    // Create instance from private constructor of Singleton class
    static Singleton instance = new Singleton();

    //Create getSingleInstance method
    public static Singleton getSingleInstance() {
        return instance;
    }
}