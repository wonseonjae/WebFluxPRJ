package kopo.webfluxprj.repository.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;


@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table("USER_INFO")
public class UserEntity {

        @Column("USER_ID")
        @Id
        private int userId;

        @Column("USER_NAME")
        private String userName;

        @Column("USER_NICK")
        private String userNick;



}
