package digital.asap;

import javax.ejb.Singleton;
import javax.inject.Named;

@Singleton
@Named
public class PersonBean {
    private String firstName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
