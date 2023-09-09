package org.example;

import com.google.gson.Gson;

/**
 * {"name":"Olexandr","lastName":"Khrystevich"}
 *
 */
public class App {
    public static void main( String[] args ) {
        User user = User.builder()
                .name("Olexandr")
                .lastName("Khrystevich")
                .build();
        String answer = new Gson().toJson(user);
        System.out.println(answer);
    }
}
