package eu.dissco.orchestration.backend.properties;

import java.time.Duration;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

@Setter
@Getter
@Validated
@ConfigurationProperties("k8s")
public class KubernetesProperties {

  @NotNull
  private Duration apiPingInterval = Duration.ofSeconds(15L);

  @NotNull
  private Duration apiWriteTimeout = Duration.ofSeconds(30L);

  @NotNull
  private Duration apiReadTimeout = Duration.ofMinutes(2L);

  @NotNull
  private Duration apiConnectTimeout = Duration.ofSeconds(15L);
}
