package me.dio.sdw.application;

import me.dio.sdw.domain.model.Champions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import java.util.List;

@SpringBootTest
public class ListChampionsIntegrationTest {

    @Autowired
    private ListChampions ListChampions;

    @Test
    public void testFindChampions(){
        List<Champions> champions = ListChampions.findAll();

        Assertions.assertEquals(12, champions.size());
    }
}
