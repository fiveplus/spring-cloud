package com.fiveplus.user;

import com.fiveplus.api.user.UserAPI;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(value = "user-service")
public interface UserFeign extends UserAPI {
}
