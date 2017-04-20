package ro.ovidiuconeac.foodtavern.webservice.components.food.api;

/**
 * Created by Ovidiu CONEAC on 2/12/2017.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ro.ovidiuconeac.foodtavern.common.exceptions.GetException;
import ro.ovidiuconeac.foodtavern.common.exceptions.PostException;
import ro.ovidiuconeac.foodtavern.common.models.Sweet;
import ro.ovidiuconeac.foodtavern.webservice.components.food.business.beans.SweetsBean;

import java.util.List;

@RestController
@RequestMapping("/food/sweets")
public class SweetsControllerImpl {
    
    private final SweetsBean sweets;

    @Autowired
    public SweetsControllerImpl(SweetsBean sweets) {
        this.sweets = sweets;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/random", produces = "application/json")
    public Sweet getRandomSweet() throws GetException {
        return sweets.getRandom();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/all", produces = "application/json")
    public List<Sweet> getAllSweets() throws GetException {
        return sweets.getAll();
    }

    @RequestMapping(method = RequestMethod.POST, path = "/new", consumes = "application/json")
    public boolean addNewSweet(@RequestBody Sweet Sweet) throws PostException {
        return sweets.addNew(Sweet);
    }
}