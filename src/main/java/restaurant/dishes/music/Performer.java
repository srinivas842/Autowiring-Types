package restaurant.dishes.music;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Performer {

    @Autowired
    @Qualifier("guitar")
    private Instrument instrument;

    @Autowired
    private Instrument violin;

    private Instrument key;

    public Performer(@Qualifier("keyboard") Instrument key ){
        this.key=key;
    }

    public void bandMusic(String song,String type){
        if(type.equals("g")){
           instrument.playSong(song);
        }
        if(type.equals("v")){
            violin.playSong(song);
        }
        if(type.equals("k"))
        {
            key.playSong(song);
        }

    }

}
