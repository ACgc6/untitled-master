package Three;

public class Test {
    public static void main(String[] args) {
        Phone phone=new NotAiPhone("G502c","索尼爱立信");
        if (phone instanceof AiPhone){
            phone.printInfo();
            phone.broadcast();
            phone.sentMessage();
            phone.call();

            System.out.println();
//            智能手机
            Phone phone1=new AiPhone("HTC","I9100");
            phone1.printInfo();
//            联网
            if (phone1 instanceof AiPhone){
                ((AiPhone)phone1).upOnline();
            }
            phone1.broadcast();
            if (phone1 instanceof AiPhone){
                ((AiPhone) phone1).takePicture();
            }
            phone1.sentMessage();
            phone1.call();
        }
    }
}
