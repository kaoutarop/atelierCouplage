package org.elhachemykaoutar.dao;

import java.util.ArrayList;
import java.util.List;

public class EtudiantDAO {
    private List<Etudiant> etudiantList;
public EtudiantDAO()
{this.etudiantList=new ArrayList<>();
}
    public Etudiant addEtudiant(Etudiant etudiant)
    {   if(isEmailused(etudiant.getEmail()))
    {
        throw new RuntimeException("ce email "+etudiant.getEmail()+ " deja utilise par un autre etudinat");
    }
        etudiantList.add(etudiant);
        return etudiant;
    }

    private boolean isEmailused(String email) {
        for (Etudiant etudiant:etudiantList)
        {
            if (etudiant.getEmail().equals(email)) {
                return true;
            }


        }
        return false;
    }

    public List<Etudiant> getAllEtudiants()
    {
        return etudiantList;
    }

}
