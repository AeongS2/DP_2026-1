package hw.ch05;

public class LoggerSynchronizedLazy {
    private static LoggerSynchronizedLazy instance = new LoggerSynchronizedLazy();
    private StringBuilder logBuffer;

    private LoggerSynchronizedLazy(){
        System.out.println("[LoggerSynchronizedLazy] 인스턴스를 생성했습니다.");
        logBuffer = new StringBuilder();
        slow();
    }

    public static synchronized LoggerSynchronizedLazy getInstance(){
        if (instance == null) {
            instance = new LoggerSynchronizedLazy();
        }

        return instance;
    }

    private void slow(){
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
    }

    public void log(String message){
        logBuffer.append("[").append(System.currentTimeMillis()).append("]").append(message).append("\n");
        System.out.println("[LoggerStaticInit]" + message);
    }

    public String getLog(){
        return logBuffer.toString();
    }
}
