package one;

/**
 * java里面继承是单继承，一个子类只能继承一个父类，不能继承多个父类
 * 那我们就引入了接口，接口java中的多继承。
 * 接口不叫继承（extend），叫实现（implements）,接口不用类（class）修饰，用interface修饰。
 */
public class DefenceDoor extends Door implements Lock {
    @Override
    void open() {
        System.out.println("开门");
    }

    @Override
    void close() {
        System.out.println("关门");
    }

    @Override
    public void upLock() {
        System.out.println("钥匙往后拧一圈锁，锁开了");
    }

    @Override
    public void closeLock() {
        System.out.println("钥匙往前拧一圈锁，锁上了");
    }
}
