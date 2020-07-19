
class Singleton {

    private static Singleton instance = null;

    // A public String instance variable
    public String str;

    // A private Singleton non parameterized constructor.
    private Singleton() {
        str = "Hello I am a singleton! Let me say hello world to you";
    }

    public static Singleton getSingleInstance() {
        if (instance == null) {
            return new Singleton();
        }
        return instance;
    }

}