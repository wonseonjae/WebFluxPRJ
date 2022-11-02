package kopo.webfluxprj.repository;


import kopo.webfluxprj.repository.Entity.UserEntity;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import reactor.core.publisher.Flux;

public interface UserRepository extends R2dbcRepository<UserEntity, Integer> {

    Flux<UserEntity> findByUserName(String userName);


}
