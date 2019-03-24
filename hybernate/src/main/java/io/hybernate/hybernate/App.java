package io.hybernate.hybernate;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Configuration con = new Configuration().configure().addAnnotatedClass(Employee.class);
        SessionFactory SF = con.buildSessionFactory();
        Session session = SF.openSession();
        Employee emp = new Employee();
        
        //To Insert value to a table
        emp.setId(2);
        emp.setName("Mona");
        emp.setSalary(2000);
        Transaction tx = session.beginTransaction();
       // session.save(emp);
        emp = session.get(Employee.class, 2);
        tx.commit();
        System.out.println(emp);
    }
}
