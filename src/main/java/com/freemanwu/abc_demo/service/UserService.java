package com.freemanwu.abc_demo.service;

import com.freemanwu.abc_demo.entity.Sheet_Music;
import com.freemanwu.abc_demo.entity.User;
import com.github.pagehelper.PageInfo;

public interface UserService {
    void register(User user);
    User findByNameAndPassword(User user);
    User findByName(User user);
    void update(User user);


    //删除个人曲谱
    void deleteOneMusicUser(Integer id);
    //个人曲谱修改（用户）
    void updateMusicUser(Sheet_Music music);

    //删除某单一曲谱（用户）
    void deleteOneUser(Integer id);
    //批量删除曲谱（用户）
    void deleteListMusic(Integer[] id);

    //按节拍查询曲谱
    PageInfo<Sheet_Music> findMusicByBeat(int pageNo, String beat);

    //按定调查询曲谱
    PageInfo<Sheet_Music> findMusicByTone(int pageNo, String tone);

    //组合查询
    PageInfo<Sheet_Music> CombinedFindMusic(int pageNo, Sheet_Music music);
}
