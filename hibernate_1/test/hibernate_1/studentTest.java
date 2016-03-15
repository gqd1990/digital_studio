package hibernate_1;


import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

//≤‚ ‘¿‡
public class studentTest {
	
	private SessionFactory sessionFactory;
	private Session session;
	private Transaction transaction;
	@Before
	public void init()
	{
		Configuration config = new Configuration().configure();
		ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().
				applySettings(config.getProperties()).buildServiceRegistry();
		sessionFactory = config.buildSessionFactory(serviceRegistry);
		session = sessionFactory.openSession();
		transaction =  session.beginTransaction();
	}
	@After
	public void desttory()
	{
		transaction.commit();
		session.close();
		sessionFactory.close();
	}
	
	@Test
	public void test()
	{
		Student s = new Student(1,"Tom","ƒ–",new Date(2015-12-12),"America");
		session.save(s);
		
	}

}
