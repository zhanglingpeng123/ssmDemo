package com.mapper;

import com.pojo.Paper;

import java.util.List;

public interface PaperMapper {
    int addPaper(Paper paper);

    int deletePaperById(long id);

    int updatePaper(Paper paper);

    Paper queryById(long id);

    List<Paper> queryAllPaper();


}