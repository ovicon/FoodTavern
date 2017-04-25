package ro.ovidiuconeac.foodtavern.apilayer.components.food.api;

/**
 * Created by Ovidiu CONEAC on 2/12/2017.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ro.ovidiuconeac.foodtavern.businesslayer.components.food.business.beans.CheesesBean;
import ro.ovidiuconeac.foodtavern.common.exceptions.GetException;
import ro.ovidiuconeac.foodtavern.common.exceptions.PostException;
import ro.ovidiuconeac.foodtavern.common.models.Cheese;

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

    @RequestMapping(method = RequestMethod.POST, path = "/new", consumes = "application/json")
    public boolean addNewCheese(@RequestBody Cheese cheese) throws PostException {
        return cheeses.addNew(cheese);
    }
}