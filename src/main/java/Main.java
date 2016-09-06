import DAO.daoprogram.DAOPROGRAM;
import models.moduls.Modul;
import models.programs.Program;
import models.topics.Topic;

public class Main {
    public static void main(String[] args) {
        DAOPROGRAM daoprogram = new DAOPROGRAM();

        Program program = daoprogram.getProgram();
        Modul modul = program.getListModuls().get(1);
        Topic topic = modul.getListTopics().get(1);
        System.out.println(topic.getNameTopic());
        System.out.println( modul.getName());

        System.out.printf(program.getListModuls().get(1).getListTopics().toString());

    }
}
