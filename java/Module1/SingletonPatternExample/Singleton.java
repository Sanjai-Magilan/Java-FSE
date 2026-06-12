package Module1.SingletonPatternExample;

class Logger{

    private  static Logger instance;
    private Logger(){
        System.out.println("Instance created !");
    }

    public static Logger getInstance(){
        if(instance == null)
            instance = new Logger();
        return instance;
    }

    public void PrintLog(String log){
        System.out.println("Log : "+log);
    }
}


public class Singleton {
    public static void main(String[] args) {
        Logger L1 = Logger.getInstance();
        L1.PrintLog("Application is running");
        Logger L2 = Logger.getInstance();
        L2.PrintLog("Application crashed !");
        System.out.println("L1 = L2 : "+(L1==L2));
    }
}
