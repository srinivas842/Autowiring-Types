package restaurant.dishes.music;

import org.springframework.stereotype.Component;

@Component
public class Guitar implements Instrument{
    @Override
    public void playSong(String song) {
        System.out.println("chill with "+ song + "guitar");
    }
}
