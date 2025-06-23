package model.dao;

import model.entities.Department;
import java.util.List;

public interface DepartmentDao {

    void insert(Department obj); //Inserção de banco de dados
    void  update(Department obj); //Atualizar um departamento
    void  deleteById(Integer id); //Apagar um departamento
    Department findById(Integer id); //Buscar um departamento
    List<Department> findAll(); //Busca todos os departamentos
}
