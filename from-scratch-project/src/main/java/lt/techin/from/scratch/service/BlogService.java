package lt.techin.from.scratch.service;

import lt.techin.from.scratch.dao.NoteRepository;
import lt.techin.from.scratch.dao.CommentRepository;
import lt.techin.from.scratch.entity.Note;
import lt.techin.from.scratch.entity.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
public class BlogService {

    private NoteRepository noteRepository;
    private CommentRepository commentRepository;

    @Autowired
    public BlogService(NoteRepository noteRepository, CommentRepository commentRepository) {
        this.noteRepository = noteRepository;
        this.commentRepository = commentRepository;
    }

    public List<Note> getNotes() {
        return noteRepository.findAll();
    }

    public Note createNote(@RequestBody Note note) {
        return noteRepository.save(note);
    }

    public Note findNote(@PathVariable Long id) { return noteRepository.findById(id).orElseThrow(() -> new RuntimeException("Not found"));}

    public Comment createCommnet(@PathVariable Long noteId, @RequestBody Comment comment) {
        var note = noteRepository.findById(noteId).orElseThrow(() -> new NullPointerException(String.format("Entity with id is not found", noteId)));
        comment.setComment(note);
        return commentRepository.save(comment);
    }
}
