package digital.asap;

import javax.ejb.Singleton;
import javax.inject.Named;

@Singleton
@Named
public class PersonBean {
    private Person person;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
