package entities;
/**Representing the patient entity
 * */
public class Patient extends User {

    private Condition condition;

    public Patient(int id, String name) {
        super(id, name);
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }


}
