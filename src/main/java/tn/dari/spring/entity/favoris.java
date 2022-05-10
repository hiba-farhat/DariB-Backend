package tn.dari.spring.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor

@Table(name ="favoris")
public class favoris implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NonNull private Long idfavoris;
	@JsonIgnore	
	@ManyToOne(cascade = CascadeType.ALL)
	private User user;
	@JsonIgnore	
	@ManyToOne(cascade = CascadeType.ALL)
	private Annonce Annonce ;
	//@JoinTable(name = "annonce_favoris",
    //joinColumns = @JoinColumn(name = "favoris_id"),
    //inverseJoinColumns = @JoinColumn(name = "Annonce_id"))
	
	
}