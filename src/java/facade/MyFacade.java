package facade;
import java.util.List;

/**
 *
 * @author petersodborgchristensen
 */
public interface MyFacade {
    public Person getPerson(int id);
    public List<Person> getPersons();
    public List<Person> getPersons(int zipCode);
    public Company getCompany(cvr);
    
    
}
