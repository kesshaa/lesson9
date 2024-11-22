package zadanie3;

public class MobilePhone extends  Phone{
    public  MobilePhone(String number){
        super(number);
    }
    public  void sendSms(String messageText,String targetNumber){
        System.out.println("Отправляем сообщение"+messageText+"По номеру"+targetNumber);
    }
}
