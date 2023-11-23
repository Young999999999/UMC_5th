package UMC.spring.study.domain;

import UMC.spring.study.domain.common.BaseEntity;
import UMC.spring.study.domain.enums.Gender;
import UMC.spring.study.domain.enums.UserRoles;
import UMC.spring.study.domain.enums.UserStatus;
import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PROTECTED)

public class Store extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private BigDecimal rating;

    private String address;

    private BigDecimal latitude;
    private BigDecimal hardness;

    private String ClosedDays;

    private String operation_hours;

    //사장과 종속관계
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "master_id")
    private Master master;

    //지역과 종속관계
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "store_id")
    private Store store;


    //역할,상태,성별은 enum 넣자

}
