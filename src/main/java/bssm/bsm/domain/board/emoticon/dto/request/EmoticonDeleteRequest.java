package bssm.bsm.domain.board.emoticon.dto.request;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Getter
@NoArgsConstructor
public class EmoticonDeleteRequest {

    @NotBlank
    private String msg;

}
