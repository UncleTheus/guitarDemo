package com.demo.guitar.service;

import com.demo.guitar.po.guitar.Guitar;
import com.demo.guitar.po.guitar.GuitarSpec;

import java.util.List;

public interface GuitarService {
    List<Guitar> search(GuitarSpec searchSpec);


    List<Guitar> queryByPage(int page,int rows);


    void add(Guitar guitar);


    void update(Guitar guitar);


    void delete (String id);


    int count ();
}
