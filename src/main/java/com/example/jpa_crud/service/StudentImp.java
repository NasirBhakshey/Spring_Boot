package com.example.jpa_crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.jpa_crud.entities.Students;
import com.example.jpa_crud.repository.Studentrepository;

@Service
public class StudentImp implements Studentservice{

    @Autowired
    private Studentrepository studentrepository;

    @Override
    public boolean AddDetail(Students std) {
    
        boolean status=false;
        try{
            studentrepository.save(std);
            status=true;

        }catch(Exception e){
            e.printStackTrace();
            status=false;
        }
        return status;
    }

    @Override
    public List<Students> getallList() {
        
        return studentrepository.findAll();
    }

    @Override
    public Students getbyId(int id) {
        
        Optional<Students> optional= studentrepository.findById(id);
        if(optional.isPresent())
        {
            return optional.get();
        }
        else{
            return null;
        }
    }

    @Override
    public boolean updatedetail(Students std,int id) {
        Students students=getbyId(id);
        if(students!=null)
        {
            studentrepository.save(std);
            return true;
        }
        return false;
    }

    @Override
    public boolean deletestd(int id) {
    
        boolean status=false;
        try {
            studentrepository.deleteById(id);
            status=true;
        } catch (Exception e) {
            e.printStackTrace();
            status=false;
        }
        return status;
    }

    @Override
    public boolean Editpage(Students students) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Editpage'");
    }

}
