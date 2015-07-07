package testSingleton;

public class testSingletone {
    private testSingletone(){};
    
    private static testSingletone instance = new testSingletone();
    
    public static testSingletone getInstance() {
        return instance;
    }
    
}
