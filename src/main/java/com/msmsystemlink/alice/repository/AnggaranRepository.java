package com.msmsystemlink.alice.repository;

import com.msmsystemlink.alice.model.Anggaran;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface AnggaranRepository extends JpaRepository<Anggaran,Long> {
    @Transactional
    @Modifying
    @Query(value = "INSERT INTO master_anggaran (id_anggaran,id_opd,jns_instansi,kd_urusan,kd_bidurusan,kd_program,kd_kegiatan,kd_subkegiatan,id_fungsi,uraian,hd_anggaran,clevel,hd,id_rencana,nilai,nilai_ubah,realisasi,tu_capai,tk_capai) VALUES (?1,?2,?3,?4,?5,?6,?7,?8,?9,?10,?11,?12,?13,?14,?15,?16,?17,?18,?19)",nativeQuery = true)
    void createNewAnggaran(String id_anggaran, String id_opd, String jns_instansi, String kd_urusan, String kd_bidurusan, String kd_program, String kd_kegiatan, String kd_subkegiatan, String id_fungsi, String uraian, String hd_anggaran, String clevel, String hd, String id_rencana, Float nilai, Float nilai_ubah, Float realisasi, String tu_capai, String tk_capai);

    void deleteById(Long id);

    List<Anggaran> findAll();

    @Query(value = "SELECT * FROM master_anggaran WHERE id_anggaran = ?1",nativeQuery = true)
    List<Anggaran> findAllById_anggaran(String id_anggaran);

    @Transactional
    @Modifying
    @Query(value = "UPDATE id_anggaran=?1,id_opd=?2,jns_instansi=?3,kd_urusan=?4,kd_bidurusan=?5,kd_program=?6,kd_kegiatan=?7,kd_subkegiatan=?8,id_fungsi=?9,uraian=?10,hd_anggaran=?11,clevel=?12,hd=?13,id_rencana=?14,nilai=?15,nilai_ubah=?16,realisasi=?17,tu_capai=?18,tk_capai=?19 WHERE id = ?20", nativeQuery = true)
    void updateById(String id_anggaran, String id_opd, String jns_instansi, String kd_urusan, String kd_bidurusan, String kd_program, String kd_kegiatan, String kd_subkegiatan, String id_fungsi, String uraian, String hd_anggaran, String clevel, String hd, String id_rencana, Float nilai, Float nilai_ubah, Float realisasi, String tu_capai, String tk_capai,Long id);
}
