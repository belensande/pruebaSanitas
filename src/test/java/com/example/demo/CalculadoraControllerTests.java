package com.example.demo;

import com.example.demo.dto.InputDto;
import com.google.gson.Gson;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.math.BigDecimal;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class CalculadoraControllerTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void sumarWith200Response() throws Exception {
        Gson gson = new Gson();
        InputDto dto = new InputDto(BigDecimal.valueOf(3.1), BigDecimal.valueOf(2.2));

        this.mockMvc.perform(post("/sumar")
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON)
                .content(gson.toJson(dto))
        )
                .andExpect(status().isOk())
                .andExpect(jsonPath("$").value(5.3));
    }

    @Test
    public void restarWith200Response() throws Exception {
        Gson gson = new Gson();
        InputDto dto = new InputDto(BigDecimal.valueOf(3.1), BigDecimal.valueOf(2.2));

        this.mockMvc.perform(post("/restar")
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON)
                .content(gson.toJson(dto))
        )
                .andExpect(status().isOk())
                .andExpect(jsonPath("$").value(-0.9));
    }

}
