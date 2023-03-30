package one;

public class Computer implements Lock {
    @Override
    public void upLock() {
        System.out.println("手指放上去，识别成功，锁开了");
    }

    @Override
    public void closeLock() {
        System.out.println("锁上了");
    }
}
