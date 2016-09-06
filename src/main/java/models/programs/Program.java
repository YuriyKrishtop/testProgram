package models.programs;


import models.moduls.Modul;

import java.util.List;

public class Program {
    private int id;
    private String name;
    private List<Modul>listModuls;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setListModuls(List<Modul> listModuls) {
        this.listModuls = listModuls;
    }

    public Program(int id, String name, List<Modul> listModuls) {
        this.id = id;
        this.name = name;

        this.listModuls = listModuls;
    }

    public List<Modul> getListModuls() {
        return listModuls;
    }



    @Override
    public String toString() {
        return "Program{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", listModuls=" + listModuls +
                '}';
    }
}
