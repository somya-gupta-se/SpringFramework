import com.baniacode.conference.service.SpeakerService;
import com.baniacode.conference.service.SpeakerServiceImpl;

public class Application {
    public static void main(String[] args){
        SpeakerService service = new SpeakerServiceImpl();
        System.out.println(service.findAll().get(0).getFirstName()+" "+service.findAll().get(0).getLastName());
    }
}
