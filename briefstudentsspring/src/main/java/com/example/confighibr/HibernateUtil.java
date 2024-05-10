package com.example.confighibr;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        try {

            Configuration configuration = new Configuration().configure("hibernate.cfg.xml");


            return configuration.buildSessionFactory();
        } catch (Throwable ex) {
            System.err.println("Initialisation de la SessionFactory a échoué : " + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    }