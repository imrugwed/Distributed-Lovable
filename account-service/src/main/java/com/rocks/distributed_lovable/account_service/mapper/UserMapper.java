package com.rocks.distributed_lovable.account_service.mapper;

import com.rocks.distributed_lovable.account_service.dto.auth.SignupRequest;
import com.rocks.distributed_lovable.account_service.dto.auth.UserProfileResponse;
import com.rocks.distributed_lovable.account_service.entity.User;
import com.rocks.distributed_lovable.common_lib.dto.UserDto;
import com.rocks.distributed_lovable.common_lib.security.JwtUserPrincipal;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {

    User toEntity(SignupRequest signupRequest);

    @Mapping(source = "userId", target = "id")
    UserProfileResponse toUserProfileResponse(JwtUserPrincipal user);

    UserDto toUserDto(User user);

}
