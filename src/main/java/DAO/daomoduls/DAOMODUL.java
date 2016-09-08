package DAO.daomoduls;

import DAO.daotopic.DAOTOPIC;
import models.moduls.Modul;
import models.topics.Topic;

import java.util.ArrayList;
import java.util.List;

public class DAOMODUL {



    List<Topic> topics = new DAOTOPIC().getTopics();



    private void setTopicListToModul(int topicNuber, List<Topic> topicsModul) {
        for (int topicID = topicNuber; topicID < topicNuber + 3; topicID++) {
            topicsModul.add(topics.get(topicID -1 ));
        }
    }

    private void setMoulList(List<Modul> moduls) {
        int topicNuber = 1;
//        System.out.println(topics.size());
//        System.out.println(topics.size() / 3);


        for (int modulID = 1; modulID < topics.size() / 3 + 1 ; modulID++) {

            List topicsModul = new ArrayList();
            setTopicListToModul(topicNuber, topicsModul);
            String name = "Modul№" + modulID;
            moduls.add(new Modul(modulID, name, topicsModul));
            topicNuber = topicNuber + 3;
        }
    }


    public List<Modul> getModuls() {
        List<Modul> moduls = new ArrayList<Modul>();
        setMoulList(moduls);
        return moduls;
    }
}
