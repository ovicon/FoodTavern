package ro.ovidiuconeac.foodtavern.webservice.components.food.api;

/**
 * Created by Ovidiu CONEAC on 2/12/2017.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ro.ovidiuconeac.foodtavern.models.features.food.Cheese;
import ro.ovidiuconeac.foodtavern.webservice.components.food.business.beans.CheesesBean;
import ro.ovidiuconeac.foodtavern.webservice.components.food.exceptions.GetException;
import ro.ovidiuconeac.foodtavern.webservice.components.food.exceptions.PostException;

import java.util.List;

@RestController
@RequestMapping("/food/cheeses")
public class CheesesControllerImpl {

    private final CheesesBean cheeses;

    @Autowired
    public CheesesControllerImpl(CheesesBean cheeses) {
        this.cheeses = cheeses;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/random", produces = "application/json")
    public Cheese getRandomCheese() throws GetException {
        return cheeses.getRandom();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/all", produces = "application/json")
    public List<Cheese> getAllCheeses() throws GetException {
        return cheeses.getAll();
    }

    @RequestMapping(method = RequestMethod.PUT, path = "/new", consumes = "application/json")
    public boolean addNewCheese(@RequestBody Cheese cheese) throws PostException {
        return cheeses.addNew(cheese);
    }
}