package restaurant.dishes.catering;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Indian implements IMenu {
    @Override
    public List<String> itemsAvailable() {
        return List.of("Rice","roti","Sabji");
    }
}
