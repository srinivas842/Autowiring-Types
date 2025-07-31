package restaurant.dishes.catering;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Chinese implements IMenu {
    @Override
    public List<String> itemsAvailable() {
        return List.of("Noodles","Manchurian","Fried Rice");
    }
}
