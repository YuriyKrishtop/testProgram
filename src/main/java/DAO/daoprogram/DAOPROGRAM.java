package DAO.daoprogram;

import DAO.daomoduls.DAOMODUL;
import models.programs.Program;

public class DAOPROGRAM {

    Program program = new Program(1,"NewProgram",new DAOMODUL().getModuls());

    public Program getProgram() {
        return program;
    }
}
