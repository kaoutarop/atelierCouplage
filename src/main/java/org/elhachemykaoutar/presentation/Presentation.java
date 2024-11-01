package org.elhachemykaoutar.presentation;

import org.elhachemykaoutar.dao.Etudiant;
import org.elhachemykaoutar.dao.EtudiantDAO;
import org.elhachemykaoutar.metier.EtudiantManager;

public class Presentation {
    public static void main(String[] args) {
        EtudiantManager manager=new EtudiantManager();
        manager.addEtudiant(new Etudiant(1L,"hassan","houssni","hassan@gmail.com"));
        manager.addEtudiant(new Etudiant(2L,"Mohamme","haji","mohammed@gmail.com"));

        manager.addEtudiant(new Etudiant(3L,"hanan","houssni","hassan@gmail.com"));
        manager.addEtudiant(new Etudiant(4L,"monir","haji","monir@gmail.com"));

    }
}
