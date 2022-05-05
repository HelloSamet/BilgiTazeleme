import java.util.ArrayList;
import java.util.List;

public class PersonServices implements IPerson {
    List<Person> personsList = new ArrayList();
    PersonServices(){

    }
    
    @Override
    public void PersonAdd(Person _person) {
        personsList.add(_person);
    }

    @Override
    public void PersonRemove(int id) {
        personsList.remove(id);
        
    }

    @Override
    public void PersonUpdate(Person _person) {
        personsList.remove(_person.id);
        personsList.add(_person);
        
    }

    @Override
    public void PersonDisplay() {
        System.out.println(personsList);
        
    }
    
    
}
