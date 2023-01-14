package main.java.com.example.demo.medicine;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MedicineRepository extends JpaRepository<Medicine,Long> {




}
