import java.util.ArrayList;

public class Department {
    private String dep_type;
    private String address;
    private ArrayList<Employee>employees;
    public Department() {
        super();
    }

    public String getDep_type() {
        return dep_type;
    }

    public void setDep_type(String dep_type) {
        this.dep_type = dep_type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Department{" +
                "dep_type='" + dep_type + '\'' +
                ", address='" + address + '\'' +
                ", employees=" + employees +
                '}';
    }
}
