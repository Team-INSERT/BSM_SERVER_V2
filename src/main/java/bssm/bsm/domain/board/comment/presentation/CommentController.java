package bssm.bsm.domain.board.comment.presentation;

import bssm.bsm.domain.board.comment.service.CommentService;
import bssm.bsm.domain.board.comment.presentation.dto.req.WriteCommentReq;
import bssm.bsm.domain.board.comment.presentation.dto.res.CommentRes;
import bssm.bsm.domain.board.post.presentation.dto.req.PostReq;
import bssm.bsm.global.auth.CurrentUser;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("comment")
@RequiredArgsConstructor
public class CommentController {

    private final CurrentUser currentUser;
    private final CommentService commentService;

    @PostMapping("/{boardId}/{postId}")
    public void writeComment(
            @PathVariable String boardId,
            @PathVariable int postId,
            @Valid @RequestBody WriteCommentReq dto
    ) {
        commentService.writeComment(currentUser.getUser(), new PostReq(boardId, postId), dto);
    }

    @DeleteMapping("/{boardId}/{postId}/{commentId}")
    public void deleteComment(
            @PathVariable String boardId,
            @PathVariable int postId,
            @PathVariable int commentId
    ) {
        commentService.deleteComment(currentUser.getUser(), new PostReq(boardId, postId), commentId);
    }

    @GetMapping("/{boardId}/{postId}")
    public List<CommentRes> viewCommentTree(
            @PathVariable String boardId,
            @PathVariable int postId
    ) {
        return commentService.viewCommentTree(currentUser.getUserOrNull(), new PostReq(boardId, postId));
    }
}