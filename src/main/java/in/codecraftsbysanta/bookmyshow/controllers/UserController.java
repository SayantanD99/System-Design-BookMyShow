package in.codecraftsbysanta.bookmyshow.controllers;

import in.codecraftsbysanta.bookmyshow.dtos.*;
import in.codecraftsbysanta.bookmyshow.models.User;
import in.codecraftsbysanta.bookmyshow.services.UserService;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    public SignupResponseDto signUp(SignupRequestDto requestDto) {
        //TODO : Handle Exception (if any)
        User user = userService.signup(requestDto.getName(),
                requestDto.getEmail(),
                requestDto.getPassword());

        SignupResponseDto responseDto = new SignupResponseDto();
        responseDto.setResponseStatus(ResponseStatus.SUCCESS);
        responseDto.setUserId(user.getId());
        return responseDto;
    }

    public LoginResponseDto login(LoginRequestDto requestDto) {
        LoginResponseDto responseDto = new LoginResponseDto();
        try {
            User user = userService.login(requestDto.getEmail(),
                    requestDto.getPassword());
            responseDto.setResponseStatus(ResponseStatus.SUCCESS);
        } catch (Exception e) {
            responseDto.setResponseStatus(ResponseStatus.FAILURE);
        }
        return responseDto;
    }
}