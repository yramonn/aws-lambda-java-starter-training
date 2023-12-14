package tech.buildrun.lambda.response;

public class LoginResponse {

    boolean isAuthorized;

    public LoginResponse(boolean isAuthorized) {
        this.isAuthorized = isAuthorized;
    }

    public boolean isAuthorized() {
        return isAuthorized;
    }

    public void setAuthorized(boolean authorized) {
        isAuthorized = authorized;
    }
}
