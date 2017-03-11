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
import ro.ovidiuconeac.foodtavern.models.features.food.Cheese;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by Ovidiu CONEAC on 2/14/2017.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class CheesesControllerTest {

    @Autowired
    private MockMvc mvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public void testGetRandomCheese() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/food/cheeses/random")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    @Test
    public void testGetAllCheeses() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/food/cheeses/all")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    @Test
    public void testAddNewCheese() throws Exception {
        mvc.perform(MockMvcRequestBuilders.put("/food/cheeses/new")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"name\" : \"New stinky cheese\"}"))
                .andExpect(content().string("true"))
                .andExpect(status().is(200))
                .andExpect(status().isOk());
    }
}