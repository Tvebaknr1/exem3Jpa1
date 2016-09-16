
import java.util.HashMap;
import javax.persistence.Persistence;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Emil
 */
public class Tester {
    static HashMap<String, Object> hash = new HashMap();

    public static void main(String[] args) {

        hash.put("javax.persistence.schema-generation.database.action", "drop-and-create");
        hash.put("javax.persistence.sql-load-script-source", "scripts/data.sql");
        Persistence.createEntityManagerFactory("jpa_1PU", hash);
    }
}
