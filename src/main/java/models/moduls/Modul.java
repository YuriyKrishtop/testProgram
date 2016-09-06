package models.moduls;


import models.topics.Topic;

import java.util.List;

public class Modul {
    private int id;
    private String name;
    private List<Topic> listTopics;

    public Modul(int id, String nameModul, List<Topic> listTopics) {
        this.id = id;
        this.name = nameModul;
        this.listTopics = listTopics;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Topic> getListTopics() {
        return listTopics;
    }

    @Override
    public String toString() {
        return "Modul{" +
                "id=" + id +
                ", nameModul='" + name + '\'' +
                ", listTopics=" + listTopics +
                '}';
    }
}
