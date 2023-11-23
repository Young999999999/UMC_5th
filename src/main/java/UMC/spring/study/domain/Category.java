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

public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;



    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "store_id")
    private Store store;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "users_id")
    private Users user;

    //역할,상태,성별은 enum 넣자

}
