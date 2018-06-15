package com.demo.guitar.service;

import com.demo.guitar.dao.GuitarDao;
import com.demo.guitar.domain.Inventory;
import com.demo.guitar.po.guitar.Guitar;
import com.demo.guitar.po.guitar.GuitarSpec;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("guitarService")
public class GuitarServiceImpl implements GuitarService{

    @Autowired
    private GuitarDao guitarDao;

    @Autowired
    private Inventory inventory;

    @Override
    public List<Guitar> search(GuitarSpec searchSpec){
        List<Guitar> guitars=guitarDao.findAll();
        return inventory.search(searchSpec, guitars);
    }

    @Override
    public void add(Guitar guitar) {
        guitarDao.add(guitar);
    }

    @Override
    public void update(Guitar guitar) {
        guitarDao.update(guitar);
    }

    @Override
    public void delete(String id) {
        guitarDao.delete(id);
    }

    @Override
    public List<Guitar> queryByPage(int page,int rows) {
        PageHelper.startPage(page,rows);
        return guitarDao.findAll();
    }


    @Override
    public int count() {
        return guitarDao.count();
    }

}
