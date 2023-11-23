package UMC.spring.study.domain;

import UMC.spring.study.domain.common.BaseEntity;
import UMC.spring.study.domain.enums.Gender;
import UMC.spring.study.domain.enums.MemberStatus;
import UMC.spring.study.domain.enums.SocialType;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Member extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String address;
    private String specAddress;
    private LocalDate inactiveDate;
    private String email;
    private Integer point;

    @Enumerated(EnumType.STRING)
    private Gender gender;
    @Enumerated(EnumType.STRING)
    private SocialType socialType;
    @Enumerated(EnumType.STRING)
    private MemberStatus status;



}