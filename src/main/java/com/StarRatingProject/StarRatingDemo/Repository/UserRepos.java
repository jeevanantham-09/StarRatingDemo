package com.StarRatingProject.StarRatingDemo.Repository;

import com.StarRatingProject.StarRatingDemo.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepos extends JpaRepository<UserModel,Long> {
    
}
