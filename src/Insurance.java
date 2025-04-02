public class Insurance {
    private String Insurance_num;
    private String startDate;
    private String availableDate;
    private String expireDate;
    private String emp_id;
    private String dep_type;

    public Insurance() {
        super();
    }

    public Insurance(String insurance_num, String startDate, String availableDate, String expireDate, String emp_id, String dep_type) {
        Insurance_num = insurance_num;
        this.startDate = startDate;
        this.availableDate = availableDate;
        this.expireDate = expireDate;
        this.emp_id = emp_id;
        this.dep_type = dep_type;
    }

    public String getInsurance_num() {
        return Insurance_num;
    }

    public void setInsurance_num(String insurance_num) {
        Insurance_num = insurance_num;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getAvailableDate() {
        return availableDate;
    }

    public void setAvailableDate(String availableDate) {
        this.availableDate = availableDate;
    }

    public String getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }

    public String getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(String emp_id) {
        this.emp_id = emp_id;
    }

    public String getDep_type() {
        return dep_type;
    }

    public void setDep_type(String dep_type) {
        this.dep_type = dep_type;
    }

    @Override
    public String toString() {
        return "Insurance{" +
                "Insurance_num='" + Insurance_num + '\'' +
                ", startDate='" + startDate + '\'' +
                ", availableDate='" + availableDate + '\'' +
                ", expireDate='" + expireDate + '\'' +
                ", emp_id='" + emp_id + '\'' +
                ", dep_type='" + dep_type + '\'' +
                '}';
    }
}
