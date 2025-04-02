public class BeneficiaryFamilyMembers extends Person{
    private String relationship;
    private String emp_id;

    public BeneficiaryFamilyMembers() {
        super();
    }


    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    public String getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(String emp_id) {
        this.emp_id = emp_id;
    }

    @Override
    public String toString() {
        return "BeneficiaryFamilyMembers{" +
                "Id: "+this.getId()+", Name: "+this.getName()+", Date Of Birth: "+this.getDOB()+", relationship='" + relationship + '\'' +
                ", emp_id='" + emp_id + '\'' +
                '}';
    }
}
