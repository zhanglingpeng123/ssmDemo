package com.service.impl;

import com.pojo.Paper;
import com.mapper.PaperMapper;
import com.service.PaperService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaperServiceImpl implements PaperService {
    @Autowired
    private PaperMapper paperMapper;

    @Override
    public int addPaper(Paper paper) {
        return paperMapper.addPaper(paper);
    }

    @Override
    public int deletePaperById(long id) {
        return paperMapper.deletePaperById(id);
    }

    @Override
    public int updatePaper(Paper paper) {
        return paperMapper.updatePaper(paper);
    }

    @Override
    public Paper queryById(long id) {
        return paperMapper.queryById(id);
    }

    @Override
    public List<Paper> queryAllPaper() {
        return paperMapper.queryAllPaper();
    }

}