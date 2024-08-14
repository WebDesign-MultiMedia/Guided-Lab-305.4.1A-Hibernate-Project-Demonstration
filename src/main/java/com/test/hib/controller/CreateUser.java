package com.test.hib.controller;
import com.test.hib.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class CreateUser {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();

        Transaction t = session.beginTransaction();
        User uone = new User();
        uone.setEmail("haseeb@gmail.com");
        uone.setFullname("Julio Salas");
        uone.setPassword("RARA123");
        uone.setSalary(2000.69);
        uone.setAge(29);
        uone.setCity("NYC");

        User uTwo = new User();
        uTwo.setEmail("James@gmail.com");
        uTwo.setFullname("James Santana");
        uTwo.setPassword("James123");
        uTwo.setSalary(2060.69);
        uTwo.setAge(25);
        uTwo.setCity("Dallas");

        User uThree = new User();
        uThree.setEmail("Shahparan@gmail.com");
        uThree.setFullname("AH Shahparan");
        uThree.setPassword("Shasha123");
        uThree.setSalary(3060.69);
        uThree.setAge(30);
        uThree.setCity("Chicago");

        /*=============== we can pass value/data by using constructor ============*/
        User uFour = new User("Christ", "christ@gamil.com", "147852", 35, 35000.3, "NJ");
        User uFive = new User("Sid", "sid", "s258", 29, 4000.36, "LA");

        session.persist(uone);
        session.persist(uTwo);
        session.persist(uThree);
        session.persist(uFour);
        session.persist(uFive);

        t.commit();
        System.out.println("Successfully saved");
        factory.close();
        session.close();
    }
}
