package insper.store.candidatura;

import lombok.Builder;
import lombok.experimental.Accessors;

@Builder
@Accessors(fluent = true, chain = true)
public record CandidaturaIn (
    String name,
    String email,
    String password
) {
    
}
