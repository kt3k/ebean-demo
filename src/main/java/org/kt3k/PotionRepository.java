package org.kt3k;

import com.avaje.ebean.Ebean;
import org.kt3k.dto.Potion;

public class PotionRepository {

    void save(Potion potion) {
        Ebean.save(potion);
    }

    Potion getById(Long id) {
        return Ebean.find(Potion.class, id);
    }
}
