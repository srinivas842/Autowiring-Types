package restaurant.dishes.catering;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Restaurants {

    // Auto wiring by type
    @Autowired
    @Qualifier("indian")
    private IMenu Menu;

   // Auto wiring By name
    @Autowired
    private IMenu chinese;


// By Constructor
    private IMenu iMenu;

    public Restaurants(@Qualifier("italian") IMenu iMenu){
        super();
     this.iMenu=iMenu;
    }

   /* public void displayMenu(String indian){
        Menu.itemsAvailable().forEach(System.out::println);
        chinese.itemsAvailable().forEach(System.out::println);
        iMenu.itemsAvailable().forEach(System.out::println);
    }   */

    public List<String> itemsAvailable(String choice){
        if(choice.equals("indian"))
            return Menu.itemsAvailable();
        if(choice.equals("chinese")){
            return chinese.itemsAvailable();
        }
        if(choice.equals("italian")){
            return iMenu.itemsAvailable();
        }
        return null;
    }
}
