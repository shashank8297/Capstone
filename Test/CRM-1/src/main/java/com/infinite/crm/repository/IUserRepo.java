package com.infinite.crm.repository;

import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepo extends JpaRepository<User, long>{

}
