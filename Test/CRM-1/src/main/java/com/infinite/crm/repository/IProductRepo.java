package com.infinite.crm.repository;

import org.springframework.stereotype.Repository;

@Repository
public interface IProductRepo extends JpaRepository<Product, long>{

}
