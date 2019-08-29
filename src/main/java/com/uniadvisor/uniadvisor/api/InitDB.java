package com.uniadvisor.uniadvisor.api;

import com.uniadvisor.uniadvisor.db.DBContext;
import com.uniadvisor.uniadvisor.db.Database;
import com.uniadvisor.uniadvisor.db.MapDBContext;
import com.uniadvisor.uniadvisor.util.Pair;
import org.mapdb.DB;


import javax.xml.crypto.Data;
import java.util.Map;

public class InitDB {



    public static void main(String[] args) {

        Map<String, Location> locations = Database.getLocations();
        locations.put("diag", new Location());

        locations.put("exposte", new Location(41.896335, 12.5177278, "EX Poste - Edificio Marco Polo - Sapeienza Università di Roma", "exposte", "Via dello Scalo San Lorenzo, 82", Boolean.TRUE, Boolean.FALSE, Boolean.TRUE));
        locations.put("lab", new Location(41.8998813, 12.516822, "Laboratorio di Informatica Paolo Ercoli", "lab", "Via Tiburtina, 205", Boolean.TRUE, Boolean.TRUE, Boolean.TRUE));

        locations.put("exposte", new Location(41.896, 12.52, "EX Poste - Edificio Marco Polo - Sapeienza Università di Roma", "exposte", "Via dello Scalo San Lorenzo, 82", Boolean.TRUE, Boolean.FALSE, Boolean.TRUE));
        locations.put("lab", new Location(41.899, 12.516, "Laboratorio di Informatica Paolo Ercoli", "lab", "Via Tiburtina, 205", Boolean.TRUE, Boolean.TRUE, Boolean.TRUE));

        locations.put("pratone", new Location(41.903, 12.516, "Pratone della Sapienza", "pratone", "Viale Regina Elena, 334", Boolean.FALSE, Boolean.FALSE, Boolean.FALSE));
        locations.put("mirafiori", new Location(41.919, 12.517, "Università la Sapienza - Dipartimento di Filosofia", "mirafiori", "Via Carlo Fea, 2", Boolean.FALSE, Boolean.TRUE, Boolean.TRUE));
        locations.put("spv", new Location(41.893, 12.492, "La Sapienza - Dipartimento di Ingegneria Civile, Edile ed Ambientale", "spv", "Via Eudossiana, 22", Boolean.TRUE, Boolean.TRUE, Boolean.TRUE));
        locations.put("geologia", new Location(41.903, 12.513,"La Sapienza - Dipartimento di Scienze della Terra", "geologia", "Piazzale Aldo Moro, 5", Boolean.TRUE, Boolean.TRUE, Boolean.TRUE ));
        locations.put("maxxi", new Location(41.928, 12.477, "MAXXI", "maxxi", "Via Guido REni, 4A", Boolean.TRUE, Boolean.FALSE, Boolean.TRUE));
        locations.put("roma3", new Location(41.862, 12.478, "Università degli Studi Roma 3", "roma3", "Via Ostiense, 163", Boolean.TRUE, Boolean.TRUE, Boolean.TRUE));
        locations.put("bellearti", new Location(41.907, 12.475, "Accademia di Belle Arti", "bellearti", "Via di Ripetta, 222", Boolean.FALSE, Boolean.FALSE, Boolean.TRUE));
        Database.commit();
//        System.out.println(Database.getLocations().keySet());
//         Map<String, double[]> map = Database.test();
////         map.put("a", new double[]{1.0,5.0});
//        map.get("a")[0] = 2;
//
//        System.out.println(map.get("a")[0]);
//        map.put("a",new double[]{2.0,1.0});
//        Database.commit();
//        System.out.println(Database.test().get("a")[0]);
//         Database.commit();
//        test.put("a", a);
//        Database.commit();
//        System.out.println(Database.test().get("a")[0]);
    }
}
