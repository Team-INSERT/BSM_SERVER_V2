package bssm.bsm.domain.school.timetable.presentation.dto.req;

import bssm.bsm.domain.school.timetable.domain.TimetableType;
import lombok.Getter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
public class CreateTimetableReq {

    @NotBlank
    @Size(max = 12)
    private String name;

    @NotNull
    private TimetableType type;

    private int grade;

    private int classNo;

}
