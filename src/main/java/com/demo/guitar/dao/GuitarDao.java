package com.demo.guitar.dao;

import com.demo.guitar.po.guitar.Guitar;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface GuitarDao {

    @Select("SELECT * FROM guitar")
    List<Guitar> findAll();

    @Insert("INSERT INTO guitar (id,price,builder,model,type,back_wood,top_wood,serial_number) values (#{id},#{price},#{builder},#{model},#{type},#{backWood},#{topWood},#{serialNumber})")
    void add(Guitar guitar);

    @Update("UPDATE guitar set price=#{price},builder=#{builder},model=#{model},type=#{type},back_wood=#{backWood},top_wood=#{topWood},serial_number=#{serialNumber} where id=#{id}")
    void update(Guitar guitar);

    @Delete("DELETE from guitar where id=#{id}")
    void delete (String id);

    @Select("select count(*) from guitar")
    int count ();
}
