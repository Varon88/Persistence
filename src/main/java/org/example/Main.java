package org.example;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.spi.PersistenceProvider;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

//        Persistence persistence = (Persistence) Persistence.createEntityManagerFactory("pu");
//        PersistenceProvider persistenceProvider = persistence.getPersistenceProvider();
//        student student = new student();
//        student.setId(1);
//        student.setUserName("Varon Rasiah");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu"); //This is required as inorder to create an object of EntityManager EMF is required as it follows a factory design patters
        EntityManager em = emf.createEntityManager(); //responsible for managing JPA entries

//        student student1 = em.find(student.class, 1);
//        student1.setId(1);
//        student1.setUserName("Varon Rasiah");
//        em.persist(student1);

        student student1 = em.find(student.class, 1);
        student1.setUserName("John Doe");
        student1.setId(1);
        em.persist(student1);


//        student a = em.find(student.class,1); //used to find column 1 within database
//        System.out.println(a);

        em.close();
        emf.close();
    }
}

