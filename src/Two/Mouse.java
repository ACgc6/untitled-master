package Two;

public class Mouse implements UsbInterface {
    @Override
    public void usbStandard() {
        System.out.println("我遵守了usb规范，我可以操作电脑了。");
    }
}
