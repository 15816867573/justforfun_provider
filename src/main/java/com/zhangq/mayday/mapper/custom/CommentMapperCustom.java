package com.zhangq.mayday.mapper.custom;

import com.zhangq.mayday.model.domain.Comment;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CommentMapperCustom {
    List<Comment> findPageComment(Comment comment);
    Integer countByStatus(@Param(value = "status") Integer status);
    void insert(Comment comment);
    List<Comment> findAllChildComment(Comment comment);
}
