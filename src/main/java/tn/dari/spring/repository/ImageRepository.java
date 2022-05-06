package tn.dari.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.dari.spring.entity.Image;
import tn.dari.spring.entity.Rendezvous;

@Repository
public interface ImageRepository extends JpaRepository<Image, Long>{

}