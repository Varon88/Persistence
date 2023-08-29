package org.example;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu"); //This is required as inorder to create an object of EntityManager EMF is required as it follows a factory design patters
        EntityManager em = emf.createEntityManager(); //responsible for managing JPA entries

        student a = em.find(student.class,1); //used to find column 1 within database
        System.out.println(a);

        em.close();
        emf.close();
    }
}
