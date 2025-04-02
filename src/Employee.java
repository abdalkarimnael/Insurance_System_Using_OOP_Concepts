import java.util.ArrayList;

public class Employee extends Person{
    private String address;
    private String departmentType;
    private ArrayList<BeneficiaryFamilyMembers>familyMembers;
    public Employee() {
        super();
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDepartmentType() {
        return departmentType;
    }

    public void setDepartmentType(String departmentType) {
        this.departmentType = departmentType;
    }

    public ArrayList<BeneficiaryFamilyMembers> getFamilyMembers() {
        return familyMembers;
    }

    public void setFamilyMembers(ArrayList<BeneficiaryFamilyMembers> familyMembers) {
        this.familyMembers = familyMembers;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Id: "+this.getId()+",Name: "+this.getName()+", Date Of Birth: "+this.getDOB()+", address='" + address + '\'' +
                ", departmentType='" + departmentType + '\'' +
                ", familyMembers=" + familyMembers +
                '}';
    }
}
