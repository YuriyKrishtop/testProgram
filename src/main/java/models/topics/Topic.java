package models.topics;

public class Topic {

    private int id;
    private String nameTopic;

    public Topic(int topicID) {
    }


    public int getId() {
        return id;
    }

    public String getNameTopic() {
        return nameTopic;
    }

    public Topic(int id, String nameTopic) {
        this.id = id;
        this.nameTopic = nameTopic;
    }

    @Override
    public String toString() {
        return "Topic{" +
                "id=" + id +
                ", nameTopic='" + nameTopic + '\'' +
                '}';
    }
}
