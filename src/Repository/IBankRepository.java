package Repository;

import java.util.Locale;

public interface IBankRepository {
    int checkInputAccount(Locale language);
    String checkInputPassword(Locale language);
    boolean checkInputCaptcha(String captchaGenerated, Locale language);
}