package com.StarRatingProject.StarRatingDemo.Service;

import com.StarRatingProject.StarRatingDemo.Dto.Userdto;
import com.StarRatingProject.StarRatingDemo.Repository.UserRepos;
import com.StarRatingProject.StarRatingDemo.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
   private UserRepos userRepos;
    @Override
    public UserModel save(Userdto userdto) {
        UserModel userModel = new UserModel(userdto.getMovieName(), userdto.getRating());
        return userRepos.save(userModel);
    }
}
