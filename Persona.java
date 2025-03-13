package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa a una persona con nombre y lista de teléfonos.
 */
public class Persona {
    private String name;
    private List<String> phones;

    /**
     * Constructor que inicializa el nombre y el primer teléfono.
     * @param name Nombre de la persona.
     * @param phone Teléfono inicial.
     */
    public Persona(String name, String phone) {
        this.name = name;
        this.phones = new ArrayList<>();
        this.phones.add(phone);
    }

    public String getName() {
        return name;
    }

    public List<String> getPhones() {
        return new ArrayList<>(phones);
    }
}
