package com.example.test2;

public class SucursalItem {
    private final int id;
    private final String nombre;

    public SucursalItem(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() { return id; }

    public String getNombre() { return nombre; }

    @Override
    public String toString() {
        // Esto será lo que se ve en el ComboBox
        return nombre;
    }
}

