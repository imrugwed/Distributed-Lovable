package com.rocks.distributed_lovable.account_service.dto.auth;

public record UserProfileResponse(
        Long id,
        String username,
        String name
) {
}
