package CEP_programs;
class MobilePhone{
    void parent(){
        System.out.println("\nEmergency Calls Only!!Please check your network");
    }
}
class BasicPhone extends MobilePhone{
    void MakeCall(){
        System.out.println("Calling");
    }
    void PickCall(){
        System.out.println("Picking Call");
    }
}
class Smartphone extends BasicPhone{
    void TakePhoto(){
        System.out.println("Taking photo in 50 MP");
    }
    void RecordVideo(){
        System.out.println("Recording video in 4k");
    }
    void PlayGame(){
        System.out.println("Welcome to BattleGrounds Mobile India");
    }
}
public class MultilevelInh {
    public static void main(String[] args) {
        Smartphone display = new Smartphone();
        display.parent();
        display.MakeCall();
        display.PickCall();
        display.RecordVideo();
        display.TakePhoto();
        display.PlayGame();
    }
    
    
}