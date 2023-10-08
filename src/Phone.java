import java.util.ArrayList;
import java.util.List;
public class Phone {
    String number, model;
    Float weight;
    public void receiveCall(String name){
        System.out.println("Звонит "+name) ;
    }
    public void receiveCall(String name,String phone){
        System.out.println("Звонит "+name+"#n Номер "+ phone);
    }
    public String getNumber(){
        return number;
    }

    public Phone(String number, String model, Float weight){
        this.weight=weight;
        new Phone(number,model);
    }

    public Phone(String number, String model){
        this.number=number;
        this.model=model;
    }

    /**
     * The implication is that if the phone data does not contain model information, then undoubtedly this is the same legendary phone
     */
    public Phone(){
        this.number="8-800-555-35-35";
        this.weight= 133.0F;
        this.model="Nokia 3310";
    }
    public void getPhone(){
        System.out.println(this.number+" "+this.model+" "+this.weight);
    }
    public void sendMessage(String[] numbers){
        StringBuilder output = new StringBuilder("Отправить смс по номерам: ");
        for (String number : numbers){
            //sendMessage(number);
            output.append(number).append(" ");
        }
        System.out.println(output);
    }
}
