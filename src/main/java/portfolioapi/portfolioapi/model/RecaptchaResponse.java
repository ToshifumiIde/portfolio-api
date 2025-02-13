package portfolioapi.portfolioapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class RecaptchaResponse {

  private Boolean success;
  private float score;
  private String action;
  private String challenge_ts;
  private String hostname;
  // error-codesに関しては、Javaの命名規則上ハイフンが使えないため以下で仮置き
  private List<String> errorCodes;
}
