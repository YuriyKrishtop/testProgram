package DAO.daotopic;

import models.topics.Topic;

import java.util.ArrayList;
import java.util.List;

public class DAOTOPIC {




    public List<Topic> getTopics() {
        List<Topic> topics = new ArrayList<Topic>();
        topics.add(new Topic(1, "modul1Topic1"));
        topics.add(new Topic(2, "modul1Topic2"));
        topics.add(new Topic(3, "modul1Topic3"));
        topics.add(new Topic(4, "modul2Topic1"));
        topics.add(new Topic(5, "modul2Topic2"));
        topics.add(new Topic(6, "modul2Topic3"));
        topics.add(new Topic(7, "modul3Topic1"));
        topics.add(new Topic(8, "modul3Topic2"));
        topics.add(new Topic(9, "modul3Topic3"));
        topics.add(new Topic(10, "modul4Topic1"));
        topics.add(new Topic(11, "modul4Topic2"));
        topics.add(new Topic(12, "modul4Topic3"));
        return topics;
    }
}
