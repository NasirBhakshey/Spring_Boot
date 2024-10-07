package com.example.jpa_crud.service;

import java.util.List;

import com.example.jpa_crud.entities.Students;

public interface Studentservice {

    public boolean AddDetail(Students std);
    public List<Students> getallList();
    public Students getbyId(int id);
    public boolean updatedetail(Students std,int id);
    public boolean deletestd(int id);
    public boolean Editpage(Students students);

}
