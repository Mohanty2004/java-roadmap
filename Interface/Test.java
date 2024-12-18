package Interface;

import Interface.animals.Animal;
import Interface.animals.Dog;
import Interface.devices.SmartPhone;

public class Test {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone();
        smartPhone.makeCall("874987");
        smartPhone.takePhoto();
        smartPhone.recordVideo();
    }

}
