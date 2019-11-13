package com.work.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.work.entity.*;

@Repository
public interface alergias_usuariosRepo  extends JpaRepository<adminEntity, String>
{

}
