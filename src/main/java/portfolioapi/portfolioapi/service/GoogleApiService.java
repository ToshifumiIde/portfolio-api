package portfolioapi.portfolioapi.service;

import com.google.api.client.googleapis.auth.oauth2.GoogleAuthorizationCodeTokenRequest;
import com.google.api.client.googleapis.auth.oauth2.GoogleTokenResponse;
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.gson.GsonFactory;
import com.google.auth.oauth2.GoogleCredentials;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import portfolioapi.portfolioapi.exception.BusinessException;
import portfolioapi.portfolioapi.exception.ErrorHandling;

import java.io.IOException;
import java.security.GeneralSecurityException;

@Service
@RequiredArgsConstructor
@Slf4j
public class GoogleApiService {

  private static final HttpTransport HTTP_TRANSPORT;

  private static final JsonFactory JSON_FACTORY = GsonFactory.getDefaultInstance();

  static {
    try {
      HTTP_TRANSPORT = GoogleNetHttpTransport.newTrustedTransport();
    } catch (GeneralSecurityException | IOException e) {
      throw new RuntimeException(e);
    }
  }

  @Value("${clientId}")
  private final String clientId;

  @Value("${clientSecret}")
  private final String clientSecret;

  @Value("${redirectUri}")
  private final String redirectUri;


  /**
   * Googleのアクセストークンを取得する
   *
   * @param authCode Googleの認可コード
   * @return Googleのアクセストークン
   */
  public String getAccessToken(String authCode) {
    GoogleTokenResponse response = null;
    try {
      response = new GoogleAuthorizationCodeTokenRequest(
        HTTP_TRANSPORT,
        JSON_FACTORY,
        clientId,
        clientSecret,
        authCode,
        redirectUri
      ).execute();
    } catch (IOException e) {
      log.error("google connection error");
      throw new BusinessException(HttpStatus.BAD_REQUEST, ErrorHandling.CONNECTION_ERROR.toString(), "Google Access Token Get Error");
    }
    return response.getAccessToken();
  }


  /**
   * Googleのアクセストークンを用いてGmailのアドレスを取得する
   *
   * @param accessToken Googleのアクセストークン
   * @return メールアドレス
   */
  public String getEmailByGoogleAccessToken(String accessToken) {
    GoogleCredentials credentials = GoogleCredentials.newBuilder().build();

    return "test";
  }
}
