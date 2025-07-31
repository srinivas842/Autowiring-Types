package restaurant.dishes.music;

import org.springframework.stereotype.Component;

@Component
public class Violin implements Instrument{
    @Override
    public void playSong(String song) {
        System.out.print("playing with " + song + "violin");
    }
}
