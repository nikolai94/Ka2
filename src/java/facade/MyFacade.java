package facade;
import entity.Company;
import entity.Person;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author petersodborgchristensen
 */
public class MyFacade {
    EntityManagerFactory emf;
    EntityManager em;
    public MyFacade(){
        emf = Persistence.createEntityManagerFactory("Ka2PU");
    }
    public Person getPerson(int id){
        return null;
        
    }
    public List<Person> getPersons(){
        return null;
        
    }
    public List<Person> getPersons(int zipCode){
        return null;
        
    }
    public Company getCompany(int cvr){
        return null;
        
    }
    
    
}
