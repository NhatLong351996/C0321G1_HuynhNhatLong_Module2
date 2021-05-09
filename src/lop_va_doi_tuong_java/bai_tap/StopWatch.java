package lop_va_doi_tuong_java.bai_tap;

public class StopWatch {
    private long startTime = 0;
    private long endTime = 0;
    private boolean running = false;

    public void start() {
        this.startTime = System.currentTimeMillis();
        this.running = true;
    }

    public void end() {
        this.endTime = System.currentTimeMillis();
        this.running = false;
    }

    public void setStartTime() {
        this.startTime = System.currentTimeMillis();
    }

    public void setEndTime() {
        this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        if (running) {
            return (System.currentTimeMillis() - startTime);
        } else {
            return endTime - startTime;
        }
    }

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        for (int i = 0; i <= 10000; i++) {
            System.out.println("CODEGYM");
        }
        stopWatch.end();
        System.out.println(stopWatch.getElapsedTime());
    }

}
