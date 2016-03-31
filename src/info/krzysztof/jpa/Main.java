package info.krzysztof.jpa;

import info.krzysztof.jpa.domain.Employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.math.BigDecimal;

/**
 * Created by krzysztof on 25.03.16.
 */
public class Main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myDatabase");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        System.out.println("Działa");

        Employee employee = new Employee();
        //employee.setId(1L);
        employee.setFirstName("Jan");
        employee.setLastName("Nowak");
        employee.setSalary(3333.3);
        employee.setSalary2(new BigDecimal("12345.3"));

        entityManager.getTransaction().begin();
        entityManager.persist(employee);

        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();
    }

}
