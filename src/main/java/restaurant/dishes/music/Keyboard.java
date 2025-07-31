package restaurant.dishes.music;

import org.springframework.stereotype.Component;

@Component
public class Keyboard implements Instrument{

    @Override
    public void playSong(String song) {
        System.out.println("Playing with " + song + "Keyboard");
    }
}
