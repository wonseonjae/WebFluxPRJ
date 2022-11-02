package kopo.webfluxprj.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Getter
@Setter
@Table("USER_INFO")
public class UserDTO {

    @Column("USER_ID")
    @Id
    private int userId;

    @Column("USER_NAME")
    private String userName;

    @Column("USER_NICK")
    private String userNick;


}
