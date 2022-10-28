package za.co.owfm.API.login;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;
import za.co.owfm.Util.Constants;

public interface UserService {

    @POST(Constants.LOGIN_PATH)
    Call<LoginResponse> userLogin(@Body LoginRequest loginRequest);

}
