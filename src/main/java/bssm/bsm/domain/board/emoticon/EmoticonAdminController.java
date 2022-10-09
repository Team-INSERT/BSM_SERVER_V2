package bssm.bsm.domain.board.emoticon;

import bssm.bsm.domain.board.emoticon.dto.request.EmoticonDeleteRequest;
import bssm.bsm.domain.board.emoticon.dto.response.EmoticonResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("admin/emoticon")
@RequiredArgsConstructor
public class EmoticonAdminController {

    private final EmoticonService emoticonService;

    @GetMapping("inactive")
    public List<EmoticonResponse> getInactiveEmoticonList() {
        return emoticonService.getInactiveEmoticonList();
    }

    @PutMapping("{id}/delete")
    public void deleteEmoticon(@PathVariable long id, @Valid @RequestBody EmoticonDeleteRequest dto) {
        emoticonService.deleteEmoticon(id, dto);
    }

    @PutMapping("{id}")
    public void activeEmoticon(@PathVariable long id) {
        emoticonService.activeEmoticon(id);
    }

}
