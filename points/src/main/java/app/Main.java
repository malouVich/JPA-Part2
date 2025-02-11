package app;

import app.DAO.CourseDAO;
import app.DAO.StudentDAO;
import app.DAO.TeacherDAO;
import app.config.HibernateConfig;
import app.entities.Point;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class Main {

    private static final EntityManagerFactory emf = HibernateConfig.getEntityManagerFactory();
    private static final CourseDAO courseDAO = CourseDAO.getInstance(emf);
    private static final TeacherDAO teacherDAO = TeacherDAO.getInstance(emf);
    private static final StudentDAO studentDAO = StudentDAO.getInstance(emf);

    public static void main(String[] args) {
        EntityManagerFactory emf = HibernateConfig.getEntityManagerFactory();
        EntityManager em = emf.createEntityManager();
//
//        // Store 1000 Point objects in the database:
//        em.getTransaction().begin();
//        for (int i = 0; i < 1000; i++) {
//            Point p = new Point(i, i);
//            em.persist(p);
//        }
//        em.getTransaction().commit();
//
//        // Find the number of Point objects in the database:
//        Query q1 = em.createQuery("SELECT COUNT(p) FROM Point p");
//        System.out.println("Total Points: " + q1.getSingleResult());
//
//        // Find the average X value:
//        Query q2 = em.createQuery("SELECT AVG(p.x) FROM Point p");
//        System.out.println("Average X: " + q2.getSingleResult());
//
//        // Retrieve all the Point objects from the database:
//        TypedQuery<Point> query = em.createQuery("SELECT p FROM Point p", Point.class);
//        List<Point> results = query.getResultList();
//        for (Point p : results) {
//            System.out.println(p);
//        }
//        //I stedet for at bruge for loopet, kunne man skrive =
//        //result.steams().forEach(System.out::println);
//
//        // Close the database connection:
//        em.close();
//        emf.close();
    }
}
