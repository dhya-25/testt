package com.arabsoft.ajir.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.arabsoft.ajir.entities.CleLigBultStar;
import com.arabsoft.ajir.entities.LigBultStar;


@Repository
public interface LigBultStarRep  extends JpaRepository<LigBultStar,CleLigBultStar>{
	
	
	@Query(value="select \r\n"
			+ "num_bord_assur, \r\n"
			+ "annee_bord, \r\n"
			+ "num_lig_bord, \r\n"
			+ "num_ass, \r\n"
			+ "num_bult, \r\n"
			+ "code_complement, \r\n"
			+ "cod_soc, \r\n"
			+ "mat_pers, \r\n"
			+ "cod_etabliss, \r\n"
			+ "num_bord_etablis, \r\n"
			+ "mnt_etablis, \r\n"
			+ "cod_prest_star, \r\n"
			+ "cod_prest_bct, \r\n"
			+ "typ_parent_star, \r\n"
			+ "typ_parent_bct, \r\n"
			+ "dat_soins_star, \r\n"
			+ "dat_soins_bct, \r\n"
			+ "abrv_act_star, \r\n"
			+ "abrv_act_bct, \r\n"
			+ "nbr_unite_eng_star, \r\n"
			+ "nbr_unite_acc_star, \r\n"
			+ "nbr_unite_eng_bct, \r\n"
			+ "nbr_unite_acc_bct, \r\n"
			+ "tot_honor_star, \r\n"
			+ "tot_honor_bct, \r\n"
			+ "tot_remb_star, \r\n"
			+ "tot_a_remb_bct, \r\n"
			+ "reclam_assur, \r\n"
			+ "mnt_caa, \r\n"
 			+ "mnt_etab_conv from LIG_BULT_STAR \r\n"
			+ "where cod_soc= :codSoc and mat_pers= :matPers \r\n",nativeQuery=true)
	public List<LigBultStar> getListLigBultStart(@Param("matPers") String matPers,@Param("codSoc") String codSoc);

	@Query(value="selectt.type_act,\r\n"
			+ "       t.abrv_act,\r\n"
			+ "       t.cod_soc,\r\n"
			+ "       t.mat_pers,\r\n"
			+ "       t.num_soins,\r\n"
			+ "       t.dat_soins,\r\n"
			+ "       t.num_lig,\r\n"
			+ "       t.cod_trait,\r\n"
			+ "       t.cod_mld,\r\n"
			+ "       t.num_ass,\r\n"
			+ "       t.cod_prestataire,\r\n"
			+ "       t.dat_acte,\r\n"
			+ "       t.tot_honor,\r\n"
			+ "       t.tot_net,\r\n"
			+ "       t.indice_propos,\r\n"
			+ "       t.indice,\r\n"
			+ "       t.mld,\r\n"
			+ "       t.mnt_rembourse,\r\n"
			+ "       t.nbr_piece,\r\n"
			+ "       t.obs_lig_bult,\r\n"
			+ "       t.num_dent_lim1,\r\n"
			+ "       t.pos_dent_lim1,\r\n"
			+ "       t.num_dent_lim2,\r\n"
			+ "       t.pos_dent_lim2,\r\n"
			+ "       t.mode_remb,\r\n"
			+ "       t.num_ass_conj,\r\n"
			+ "       t.mat_pers_conj,\r\n"
			+ "       t.typ_praticien,\r\n"
			+ "       t.abrv_act_acc,\r\n"
			+ "       t.tot_net_conj,\r\n"
			+ "       t.typ_trait,\r\n"
			+ "       t.nbr_vign,\r\n"
			+ "       t.num_fam_bult,\r\n"
			+ "       t.typ_parent,\r\n"
			+ "       t.dat_rembourse,\r\n"
			+ "       t.annee_bord,\r\n"
			+ "       t.num_bord_assur,\r\n"
			+ "       t.etat_avanc_etablis,\r\n"
			+ "       t.mnt_eng_star,\r\n"
			+ "       t.indice__star,\r\n"
			+ "       t.tot_honor_star,\r\n"
			+ "       t.tot_net_star,\r\n"
			+ "       t.abrv_act_star,\r\n"
			+ "       t.num_av_etablis,\r\n"
			+ "       t.num_bord_etablis,\r\n"
			+ "       t.cod_etablis,\r\n"
			+ "       t.cod_user,\r\n"
			+ "       t.tot_remb_comp,\r\n"
			+ "       t.tot_honor_comp,\r\n"
			+ "       t.mnt_etab_conv,\r\n"
			+ "       t.imput_plaf,\r\n"
			+ "       t.duree_act,\r\n"
			+ "       t.ctr_duree,\r\n"
			+ "       t.a_indice,\r\n"
			+ "       t.plafond,\r\n"
			+ "       t.plafonne,\r\n"
			+ "       t.taux_act,\r\n"
			+ "       t.mtt_acte,\r\n"
			+ "       t.nat_act,\r\n"
			+ "       t.obs_a,\r\n"
			+ "       t.obs,\r\n"
			+ "       t.mnt_remb,\r\n"
			+ "       t.mnt_net,\r\n"
			+ "       t.mnt_honor,\r\n"
			+ "       t.dat_act,\r\n"
			+ "       t.prf_cod,\r\n"
			+ "       t.prf_typ,\r\n"
			+ "       t.dat_soin,\r\n"
			+ "       t.num_fam from LIG_BULT_STAR \r\n"
			+ "where cod_soc= :codSoc and mat_pers= :matPers and num_bult= :numBult\r\n",nativeQuery=true)
	public List<LigBultStar> getListLigBultStartDet(@Param("matPers") String matPers,@Param("codSoc") String codSoc,@Param("numBult") String numBult);

	@Query(value="select  t.type_act,\r\n"
			+ "       t.abrv_act,\r\n"
			+ "       t.cod_soc,\r\n"
			+ "       t.mat_pers,\r\n"
			+ "       t.num_soins,\r\n"
			+ "       t.dat_soins,\r\n"
			+ "       t.num_lig,\r\n"
			+ "       t.cod_trait,\r\n"
			+ "       t.cod_mld,\r\n"
			+ "       t.num_ass,\r\n"
			+ "       t.cod_prestataire,\r\n"
			+ "       t.dat_acte,\r\n"
			+ "       t.tot_honor,\r\n"
			+ "       t.tot_net,\r\n"
			+ "       t.indice_propos,\r\n"
			+ "       t.indice,\r\n"
			+ "       t.mld,\r\n"
			+ "       t.mnt_rembourse,\r\n"
			+ "       t.nbr_piece,\r\n"
			+ "       t.obs_lig_bult,\r\n"
			+ "       t.num_dent_lim1,\r\n"
			+ "       t.pos_dent_lim1,\r\n"
			+ "       t.num_dent_lim2,\r\n"
			+ "       t.pos_dent_lim2,\r\n"
			+ "       t.mode_remb,\r\n"
			+ "       t.num_ass_conj,\r\n"
			+ "       t.mat_pers_conj,\r\n"
			+ "       t.typ_praticien,\r\n"
			+ "       t.abrv_act_acc,\r\n"
			+ "       t.tot_net_conj,\r\n"
			+ "       t.typ_trait,\r\n"
			+ "       t.nbr_vign,\r\n"
			+ "       t.num_fam_bult,\r\n"
			+ "       t.typ_parent,\r\n"
			+ "       t.dat_rembourse,\r\n"
			+ "       t.annee_bord,\r\n"
			+ "       t.num_bord_assur,\r\n"
			+ "       t.etat_avanc_etablis,\r\n"
			+ "       t.mnt_eng_star,\r\n"
			+ "       t.indice__star,\r\n"
			+ "       t.tot_honor_star,\r\n"
			+ "       t.tot_net_star,\r\n"
			+ "       t.abrv_act_star,\r\n"
			+ "       t.num_av_etablis,\r\n"
			+ "       t.num_bord_etablis,\r\n"
			+ "       t.cod_etablis,\r\n"
			+ "       t.cod_user,\r\n"
			+ "       t.tot_remb_comp,\r\n"
			+ "       t.tot_honor_comp,\r\n"
			+ "       t.mnt_etab_conv,\r\n"
			+ "       t.imput_plaf,\r\n"
			+ "       t.duree_act,\r\n"
			+ "       t.ctr_duree,\r\n"
			+ "       t.a_indice,\r\n"
			+ "       t.plafond,\r\n"
			+ "       t.plafonne,\r\n"
			+ "       t.taux_act,\r\n"
			+ "       t.mtt_acte,\r\n"
			+ "       t.nat_act,\r\n"
			+ "       t.obs_a,\r\n"
			+ "       t.obs,\r\n"
			+ "       t.mnt_remb,\r\n"
			+ "       t.mnt_net,\r\n"
			+ "       t.mnt_honor,\r\n"
			+ "       t.dat_act,\r\n"
			+ "       t.prf_cod,\r\n"
			+ "       t.prf_typ,\r\n"
			+ "       t.dat_soin,\r\n"
			+ "       t.num_fam from LIG_BULT t \r\n"
			+ "where cod_soc= :codSoc and mat_pers= :matPers and num_fam= :numFam",nativeQuery=true)
	public List<LigBultStar> getListLigBultPresid(@Param("matPers") String matPers,@Param("codSoc") String codSoc,@Param("numFam") String numFam);
	

}
