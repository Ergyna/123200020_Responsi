/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.ModelTambah;
import view.TambahView;

/**
 *
 * @author HP series
 */
public class ControllerTambah {
    public void createTambah() {
        TambahView tam = new TambahView();
        tam.openForm();
    }

    public void createTambah(String[] data) {
        ModelTambah mod = new ModelTambah();
        mod.createTambah(data);
    }
    
    public void editTambah(String[] data){
        TambahView mod = new TambahView();
        mod.edit(data);
    }
    
    public void editInput(String[] data){
        ModelTambah mod = new ModelTambah();
        mod.edit(data);
    }
}
