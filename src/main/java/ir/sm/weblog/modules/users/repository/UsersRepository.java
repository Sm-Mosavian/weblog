package ir.sm.weblog.modules.users.repository;

import ir.sm.weblog.modules.users.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UsersRepository extends JpaRepository<Users,Long> {

    Users findByEmail (String email)

        //@Query(nativeQuery = true,value = "select * from users")
        //Users userEmail();

    @Query("select u from Users where email = :eml")
    Users userEmail(@Param("eml") String email);

}
