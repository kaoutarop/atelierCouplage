package org.elhachemykaoutar.metier;

import org.elhachemykaoutar.dao.Etudiant;
import org.elhachemykaoutar.dao.EtudiantDAO;

import java.util.List;

public class EtudiantManager {
    public EtudiantDAO etudiantDAO;
public EtudiantManager()
{
    this.etudiantDAO=new EtudiantDAO();
}
    public Etudiant addEtudiant(Etudiant etudiant)
    {
         try {
             return etudiantDAO.addEtudiant(etudiant);
         } catch (RuntimeException e)
         {
             System.out.println(e.getMessage());
         }
         return null;
    }
    public List<Etudiant> getAllEtudiants()
    {
        return etudiantDAO.getAllEtudiants();
    }

}
