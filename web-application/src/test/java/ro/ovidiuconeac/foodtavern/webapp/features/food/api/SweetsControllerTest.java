package ro.ovidiuconeac.foodtavern.webapp.features.food.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import ro.ovidiuconeac.foodtavern.models.features.food.Fruit;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by Ovidiu CONEAC on 2/14/2017.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class SweetsControllerTest {

    @Autowired
    private MockMvc mvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public void testGetRandomSweet() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/food/sweets/random")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    @Test
    public void testGetAllSweets() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/food/sweets/all")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    @Ignore
    @Test
    public void testAddNewSweet() throws Exception {
        Fruit fruit = new Fruit();
        fruit.setName("Apple");
        mvc.perform(MockMvcRequestBuilders.post("/food/sweets/new")
                .accept(MediaType.APPLICATION_JSON)
                .content("{\"name\" : \"New stinky Fruit\"}"))
                .andExpect(status().isCreated());
    }
}