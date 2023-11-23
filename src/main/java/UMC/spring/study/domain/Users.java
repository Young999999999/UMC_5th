package UMC.spring.study.domain;

import UMC.spring.study.domain.common.BaseEntity;
import UMC.spring.study.domain.enums.Gender;
import UMC.spring.study.domain.enums.UserRoles;
import UMC.spring.study.domain.enums.UserStatus;
import lombok.*;
import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PROTECTED)

public class Users extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String nickname;

    private String email;

    private String sns_id;

    private String password;

    private String Phone;

    private String address;

    private String birth;

    private Integer point;

    private LocalDateTime inactive_time;

    @Enumerated(EnumType.STRING)
    private UserStatus status;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Enumerated(EnumType.STRING)
    private UserRoles role;

    //역할,상태,성별은 enum 넣자

}
