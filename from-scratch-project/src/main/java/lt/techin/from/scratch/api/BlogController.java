package lt.techin.from.scratch.api;

import lt.techin.from.scratch.entity.Note;
import lt.techin.from.scratch.entity.Comment;
import lt.techin.from.scratch.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("tinklarastis")
public class BlogController {

    @Autowired
    BlogService blogService;

    @GetMapping("/notes")
    public List<Note> getNotes() {
        return blogService.getNotes();
    }

    @PostMapping("/notes")
    public Note createNote(@RequestBody Note note) {
        return blogService.createNote(note);
    }

    @GetMapping("note/{id}")
    public Note findNote(@PathVariable Long id) { return blogService.findNote(id);}

    @PostMapping("/{noteId}/comment")
    public Comment createCommnet(@RequestBody Comment comment) {
        return blogService.createCommnet(comment.getId(), comment);
    }

}
