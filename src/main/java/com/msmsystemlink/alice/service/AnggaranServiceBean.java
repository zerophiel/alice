package com.msmsystemlink.alice.service;

import com.msmsystemlink.alice.constant.ErrorMessage;
import com.msmsystemlink.alice.model.Anggaran;
import com.msmsystemlink.alice.repository.AnggaranRepository;
import com.msmsystemlink.alice.util.Precondition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AnggaranServiceBean implements AnggaranService {
    @Autowired
    AnggaranRepository anggaranRepository;

    @Override
    public void createNewAnggaran(String id_anggaran, String id_opd, String jns_instansi, String kd_urusan, String kd_bidurusan, String kd_program, String kd_kegiatan, String kd_subkegiatan, String id_fungsi, String uraian, String hd_anggaran, String clevel, String hd, String id_rencana, Float nilai, Float nilai_ubah, Float realisasi, String tu_capai, String tk_capai) {
        Precondition.checkArgument(this.anggaranRepository.findAllById_anggaran(id_anggaran).isEmpty(), ErrorMessage.ERR_DATA_ALREADY_EXIST);
        this.anggaranRepository.createNewAnggaran(id_anggaran,id_opd,jns_instansi,kd_urusan,kd_bidurusan,kd_program,kd_kegiatan,kd_subkegiatan,id_fungsi,uraian,hd_anggaran,clevel,hd,id_rencana,nilai,nilai_ubah,realisasi,tu_capai,tk_capai);
    }

    @Override
    public void deleteById(Long id) throws Exception {
        this.anggaranRepository.deleteById(id);
    }


    @Override
    public void updateById(String id_anggaran, String id_opd, String jns_instansi, String kd_urusan, String kd_bidurusan, String kd_program, String kd_kegiatan, String kd_subkegiatan, String id_fungsi, String uraian, String hd_anggaran, String clevel, String hd, String id_rencana, Float nilai, Float nilai_ubah, Float realisasi, String tu_capai, String tk_capai, Long id) throws Exception {
        this.anggaranRepository.updateById(id_anggaran,id_opd,jns_instansi,kd_urusan,kd_bidurusan,kd_program,kd_kegiatan,kd_subkegiatan,id_fungsi,uraian,hd_anggaran,clevel,hd,id_rencana,nilai,nilai_ubah,realisasi,tu_capai,tk_capai,id);
    }

    @Override
    public List<Anggaran> findAll(){
        return anggaranRepository.findAll();
    }
}
