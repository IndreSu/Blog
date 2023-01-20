package lt.techin.from.scratch.entity;

import javax.persistence.*;
import javax.persistence.Entity;

@Entity
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String text;

    @ManyToOne (fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
//    @JoinColumn(name = "entity_id")
    private Note comment;

    public Comment() {
    }

    public Comment(Long id, String text, Note comment) {
        this.id = id;
        this.text = text;
        this.comment = comment;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Note getComment() {
        return comment;
    }

    public void setComment(Note comment) {
        this.comment = comment;
    }
}
