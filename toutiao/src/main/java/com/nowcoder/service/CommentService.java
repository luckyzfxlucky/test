package com.nowcoder.service;

import com.nowcoder.dao.CommentDao;
import com.nowcoder.model.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zfx on 2016/7/18.
 */
@Service
public class CommentService {
    @Autowired
    CommentDao commentDao;

    public List<Comment> getCommentsByEntity(int entityId,int entityType){
       return commentDao.selectByEntity(entityId, entityType);
    }

    public int addComment(Comment comment){
        return commentDao.addComment(comment);
    }

    public int getCommentCount(int entityId,int entityType){
        return commentDao.getCommentCount(entityId, entityType);
    }

    public void deleteComment(int entityId,int entityType){
        commentDao.updateStatus(entityId,entityType,1);
    }
}
