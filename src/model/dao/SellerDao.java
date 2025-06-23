package model.dao;

import model.entities.Seller;

import java.util.List;

public interface SellerDao {
    void insert(Seller obj); //Inserção de banco de dados
    void  update(Seller obj); //Atualizar um Seller
    void  deleteById(Integer id); //Apagar um Seller
    Seller findById(Integer id); //Buscar um Seller
    List<Seller> findAll(); //Busca todos os Seller
}
