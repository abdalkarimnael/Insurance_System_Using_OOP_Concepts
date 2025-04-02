import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        System.out.println("\t\tWelcome to the Insurance System");
        ArrayList<Employee>emp1 = new ArrayList<>();
        ArrayList<BeneficiaryFamilyMembers>members = new ArrayList<>();
        Department dep1 = new Department();
        dep1.setDep_type("Ministries");
        dep1.setAddress("Hebron");
        System.out.println("Enter number of employees: ");
        Scanner input = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        Scanner enter = new Scanner(System.in);
        int numberOfEmp = input.nextInt();
        for(int i=0; i<numberOfEmp; i++){
            Employee e1 = new Employee();
            System.out.println("Enter Id: ");
            String id = in.nextLine();
            //////check id if null
            System.out.println("Enter name: ");
            String name = in.nextLine();
            System.out.println("Enter date of birth: ");
            String DOB = in.nextLine();
            System.out.println("Enter address: ");
            String address = in.nextLine();
            e1.setId(id);
            e1.setName(name);
            e1.setDOB(DOB);
            e1.setAddress(address);
            e1.setDepartmentType("Ministries");
            System.out.println("How much family members who have? (If he/she doesn't have, enter 0)");
            int family_members = in.nextInt();
            ////To assign a members
            for(int j=0; j<family_members; j++){
                if(family_members == 0){
                    break;
                }

                BeneficiaryFamilyMembers b1 = new BeneficiaryFamilyMembers();
                System.out.println("Enter Id: ");
                String member_id = enter.nextLine();
                System.out.println("Enter name: ");
                String member_name = enter.nextLine();
                System.out.println("Enter date of birth: ");
                String dOb = enter.nextLine();
                System.out.println("Enter relationship: ");
                String relationship = enter.nextLine();
                b1.setId(member_id);
                b1.setName(member_name);
                b1.setDOB(dOb);
                b1.setRelationship(relationship);
                b1.setEmp_id(e1.getId());
                members.add(b1);
            }
            e1.setFamilyMembers(members);
            System.out.println("Create an insurance: ");
            Insurance ins1 = new Insurance();
            System.out.println("Insurance number: ");
            String Insurance_num = enter.nextLine();
            System.out.println("Start date: ");
            String startDate = enter.nextLine();
            System.out.println("Available date: ");
            String availableDate = enter.nextLine();
            System.out.println("Expire date: ");
            String expireDate = enter.nextLine();
            ins1.setInsurance_num(Insurance_num);
            ins1.setStartDate(startDate);
            ins1.setAvailableDate(availableDate);
            ins1.setExpireDate(expireDate);
            ins1.setEmp_id(e1.getId());
            ins1.setDep_type(dep1.getDep_type());
            emp1.add(e1);
            System.out.println("Insurance: ");
            System.out.println(ins1.toString());
        }
        dep1.setEmployees(emp1); /// assign the employees to department
        System.out.println("Department: ");
        System.out.println(dep1.toString());

    }
}