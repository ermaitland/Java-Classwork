package com.ellie.model.persistence;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ellie.entity.DVD;
@Transactional
@Repository
public interface DVDDao extends JpaRepository<DVD, Integer> {
	
	@Query("from DVD where title=:title")
	DVD findDVDByTitle(@Param("title") String title);
	
	@Modifying
	@Query("update DVD set user_rating=:rating where dvd_ID=:id" )
	int updateRatingByDVDId(@Param("id") int dvdId,@Param("rating") int rating);
}
