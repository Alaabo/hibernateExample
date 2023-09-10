package org.example.dao;

import org.example.model.etudiant;
import org.example.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class etudiantDao {

    //save etudiant
    public void saveEtudiant(etudiant E){
        Transaction transaction = null;
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            //start the transaction
            transaction = session.beginTransaction();

            //save the data
            session.save(E);

            //commit the change
            transaction.commit();
        }catch (Exception e){
            System.out.println(e);

            //undo changes
            if(transaction != null){transaction.rollback();}
        }
    }
    //Update etudiant
    public void updateEtudiant(etudiant E){
        Transaction transaction = null;
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            //start the transaction
            transaction = session.beginTransaction();

            //update it if already existing
            session.update(E);

            //commit the change
            transaction.commit();
        }catch (Exception e){
            System.out.println(e);

            //undo changes
            if(transaction != null){transaction.rollback();}
        }
    }
    //getById etudiant
    public etudiant getEtudiantbyid(int id){
        Transaction transaction = null;
        etudiant et = null;
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            //start the transaction
            transaction = session.beginTransaction();

            //save the data
             et = session.get(etudiant.class, id);

            //commit the change
            transaction.commit();
        }catch (Exception e){
            System.out.println(e);

            //undo changes
            if(transaction != null){transaction.rollback();}
        }
        return et;
    }
    //getAll etudiant
    public List<etudiant> getEtudiant(){
        Transaction transaction = null;
        List<etudiant> et = null;
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            //start the transaction
            transaction = session.beginTransaction();

            //we use hql syntax here
            et = session.createQuery("from etudiant").list();

            //commit the change
            transaction.commit();
        }catch (Exception e){
            System.out.println(e);

            //undo changes
            if(transaction != null){transaction.rollback();}
        }
        return et;
    }
    //Delete etudiant
    public void deleteEtudiant(int id){
        Transaction transaction = null;
        etudiant et = null;
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            //start the transaction
            transaction = session.beginTransaction();

            //save the data
            et = session.get(etudiant.class, id);
            session.delete(et);
            //commit the change
            transaction.commit();
        }catch (Exception e){
            System.out.println(e);

            //undo changes
            if(transaction != null){transaction.rollback();}
        }

    }

}
