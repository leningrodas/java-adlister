import models.employee;

import java.util.Date;

public class employeetest {
    public static void main(String[] args) {
        employee em1 = new employee();
        em1.getEmpNo(1L);
        em1.setFirstName("lening");
        em1.setLastName("rodas");
        em1.setBirthDate(new Date());
        em1.setHireDate(new Date());
        em1.setGender('M');

        System.out.println("fullname = " + em1.getFirstName() + " " + em1.getLastName());







    }



}
