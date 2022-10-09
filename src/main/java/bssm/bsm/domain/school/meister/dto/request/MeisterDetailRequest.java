package bssm.bsm.domain.school.meister.dto.request;

import lombok.*;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MeisterDetailRequest {

    private int grade;
    private int classNo;
    private int studentNo;
    private String pw;
}
