package org.kt3k;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.EbeanServer;
import org.kt3k.dto.*;

public class Main {

    private static EbeanServer server = Ebean.getServer("mysql");

    public static void main(String[] a) {

        System.out.println("main");

        server.beginTransaction();

        try {

            Potion potion1 = new Potion();
            potion1.setId(Long.valueOf(1));
            potion1.setColor("#115588");
            Ebean.save(potion1);

            Potion potion2 = new Potion();
            potion2.setId(Long.valueOf(2));
            potion2.setColor("#881155");
            Ebean.save(potion2);

            server.commitTransaction();

        } finally {

            server.endTransaction();

        }

        System.out.println(Ebean.find(Potion.class, 1));

    }

}
