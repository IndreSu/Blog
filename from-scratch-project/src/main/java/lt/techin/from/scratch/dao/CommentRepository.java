package lt.techin.from.scratch.dao;


import lt.techin.from.scratch.entity.Note;
import lt.techin.from.scratch.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {


}
