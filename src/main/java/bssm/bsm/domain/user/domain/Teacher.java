package bssm.bsm.domain.user.domain;

import bssm.bsm.domain.user.presentation.dto.res.TeacherRes;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long teacherId;

    @Column(length = 8)
    private String name;

    @Column(length = 32)
    private String email;

    public static Teacher create(String name, String email) {
        Teacher teacher = new Teacher();
        teacher.name = name;
        teacher.email = email;
        return teacher;
    }

    public void update(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public TeacherRes toInfo() {
        return TeacherRes.builder()
                .name(name)
                .build();
    }

}
