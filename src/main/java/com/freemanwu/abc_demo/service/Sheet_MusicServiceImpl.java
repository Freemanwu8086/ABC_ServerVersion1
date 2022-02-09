package com.freemanwu.abc_demo.service;

import com.freemanwu.abc_demo.dao.Sheet_MusicDAO;
import com.freemanwu.abc_demo.entity.Sheet_Music;
import com.freemanwu.abc_demo.utils.ConstantUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Sheet_MusicServiceImpl implements Sheet_MusicService {
    @Autowired
    private Sheet_MusicDAO musicDAO;
    @Override
    public void save(Sheet_Music music) {
        musicDAO.save(music);
    }

    @Override
    public PageInfo<Sheet_Music> findAllMusic(int pageNo) {
        PageHelper.startPage(pageNo, ConstantUtils.PAGE_SIZE);
        List<Sheet_Music> list = musicDAO.findAllMusic();
        PageInfo<Sheet_Music> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @Override
    public PageInfo<Sheet_Music> findByMusicName(int pageNo) {
        PageHelper.startPage(pageNo);
        List<Sheet_Music> list = musicDAO.findByMusicName();
        PageInfo<Sheet_Music> pageInfo = new PageInfo<>(list, 1);
        return pageInfo;
    }
}
