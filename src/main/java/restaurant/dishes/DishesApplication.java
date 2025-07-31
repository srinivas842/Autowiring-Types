package restaurant.dishes;

import restaurant.dishes.catering.Restaurants;
import restaurant.dishes.music.Performer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DishesApplication implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(DishesApplication.class, args);

	}

	private Restaurants restaurants;
	@Autowired
	public void setRestaurants(Restaurants restaurants) {
		this.restaurants = restaurants;
	}
@Autowired
	private Performer performer;

	@Override
	public void run(String... args) throws Exception {

		restaurants.itemsAvailable("italian").forEach(System.out::println);
		restaurants.itemsAvailable("indian").forEach(System.out::println);

		// restaurants.itemsAvailable("indian");
		performer.bandMusic("Happy n","g");

	}
}
