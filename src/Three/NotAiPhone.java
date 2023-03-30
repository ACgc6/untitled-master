package Three;

public class NotAiPhone extends Phone {
    public NotAiPhone(String brand, String type){
        super(brand, type);
    }

    @Override
    void sentMessage() {
        System.out.println("发送文字信息....");
    }

    @Override
    void call() {
        System.out.println("开始语音通话....");
    }

    @Override
    void broadcast() {
        System.out.println("开始播放音乐《歌唱祖国》");
    }
}
