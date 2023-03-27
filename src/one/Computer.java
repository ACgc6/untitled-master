package one;

public class Computer implements Lock {
    @Override
    public void upLock() {
        System.out.println("手指放上去");
    }

    @Override
    public void closeLock() {

    }
}
