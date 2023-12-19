package com.StarRatingProject.StarRatingDemo.Service;

import com.StarRatingProject.StarRatingDemo.Dto.Userdto;
import com.StarRatingProject.StarRatingDemo.model.UserModel;

public interface UserService {
    UserModel save(Userdto userdto);
}
