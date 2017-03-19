package ro.ovidiuconeac.foodtavern.webapp.components.serverconnection.api;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by Ovidiu CONEAC on 2/14/2017.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class ServerConnectionControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void getServerConnection() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/serverconnection")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }
}