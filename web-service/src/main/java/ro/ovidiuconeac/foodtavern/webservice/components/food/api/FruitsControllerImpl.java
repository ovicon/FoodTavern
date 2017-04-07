package ro.ovidiuconeac.foodtavern.webservice.components.food.api;

/**
 * Created by Ovidiu CONEAC on 2/12/2017.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ro.ovidiuconeac.foodtavern.common.models.Fruit;
import ro.ovidiuconeac.foodtavern.webservice.components.food.business.beans.FruitsBean;
import ro.ovidiuconeac.foodtavern.webservice.components.food.exceptions.GetException;
import ro.ovidiuconeac.foodtavern.webservice.components.food.exceptions.PostException;

import java.util.List;

@RestController
@RequestMapping("/food/fruits")
public class FruitsControllerImpl {

    private final FruitsBean fruits;

    @Autowired
    public FruitsControllerImpl(FruitsBean fruits) {
        this.fruits = fruits;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/random", produces = "application/json")
    public Fruit getRandomFruit() throws GetException {
        return fruits.getRandom();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/all", produces = "application/json")
    public List<Fruit> getAllFruits() throws GetException {
        return fruits.getAll();
    }

    @RequestMapping(method = RequestMethod.POST, path = "/new", consumes = "application/json")
    public boolean addNewFruit(@RequestBody Fruit Fruit) throws PostException {
        return fruits.addNew(Fruit);
    }
}