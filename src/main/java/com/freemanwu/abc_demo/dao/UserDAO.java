package com.freemanwu.abc_demo.dao;

import com.freemanwu.abc_demo.entity.Sheet_Music;
import com.freemanwu.abc_demo.entity.User;
import org.apache.ibatis.annotations.CacheNamespace;
import org.apache.ibatis.annotations.Mapper;

@CacheNamespace
@Mapper
public interface UserDAO {
    //用户注册
    void register(User user);

    //用户登陆
    User findByNameAndPassword(User user);

    //用户主页
    User findByName(User user);

    //用户更新信息
    void update(User user);
//——————————————————————————————————————————————————————————————————————————————————————————————————————————————————————
    //个人曲谱查询（用户）
    Sheet_Music findMusicByUserName(Sheet_Music music);

    //个人曲谱修改（用户）
    void updateMusicUser(Sheet_Music music);
}
