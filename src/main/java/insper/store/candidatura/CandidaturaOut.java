package insper.store.candidatura;

import lombok.Builder;
import lombok.experimental.Accessors;

@Builder
@Accessors(fluent = true, chain = true)
public record CandidaturaOut (
    String id,
    String name,
    String email
) {
    
}
