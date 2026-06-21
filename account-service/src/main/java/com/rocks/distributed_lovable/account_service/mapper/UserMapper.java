package com.rocks.distributed_lovable.account_service.mapper;

import com.rocks.distributed_lovable.account_service.dto.auth.SignupRequest;
import com.rocks.distributed_lovable.account_service.dto.auth.UserProfileResponse;
import com.rocks.distributed_lovable.account_service.entity.User;
import com.rocks.distributed_lovable.common_lib.dto.UserDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    User toEntity(SignupRequest signupRequest);

    UserProfileResponse toUserProfileResponse(User user);

    UserDto toUserDto(User user);

}
