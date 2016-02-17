package org.kt3k;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.EbeanServer;
import org.avaje.agentloader.AgentLoader;
import org.kt3k.dto.*;

public class Main {

    private static EbeanServer server;

    static {
        if (!AgentLoader.loadAgentFromClasspath("avaje-ebeanorm-agent","debug=1;packages=org.kt3k.dto.**")) {
            System.out.println("avaje-ebeanorm-agent not found in classpath - not dynamically loaded");
        }

        server = Ebean.getServer("mysql");
    }

    public static void main(String[] a) {

        System.out.println("main");

        Potion potion = new Potion();
        potion.setId(Long.valueOf(1));
        potion.setColor("#115588");
        Ebean.save(potion);

    }

}
