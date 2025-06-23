package application;

import db.DB;
import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

    public static void main(String[] args) {
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
        System.out.println("=== TEST 1: Department insert ===");
        Department dp = new Department(null, "Music");
        departmentDao.insert(dp);
        System.out.println(dp);

        System.out.println("=== TEST 2: Department update ===");
        dp.setName("Clothes");
        departmentDao.update(dp);

        //System.out.println("=== TEST 3: Department delete ===");
        //departmentDao.deleteById(5);

        System.out.println("=== TEST 4: Department findById ===");
        System.out.println(departmentDao.findById(7));

        System.out.println("=== TEST 5: Department findAll ===");
        for (Department dep : departmentDao.findAll()){
            System.out.println(dep);
        }
    }
}
