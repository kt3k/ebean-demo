package org.kt3k;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.EbeanServer;
import org.junit.BeforeClass;
import org.junit.Test;
import org.kt3k.dto.Potion;

import static org.junit.Assert.*;

public class PotionRepositoryTest {

    static private EbeanServer server;
    static private PotionRepository repository;

    @BeforeClass
    static public void setUp() {
        server = Ebean.getServer("mysql");

        repository = new PotionRepository();
    }

    @Test
    public void testSave() {

        Potion potion1 = new Potion();
        potion1.setId(Long.valueOf(1));
        potion1.setColor("#115588");

        repository.save(potion1);

        Potion saved = repository.getById(Long.valueOf(1));

        assertEquals("#115588", saved.color());

    }
}