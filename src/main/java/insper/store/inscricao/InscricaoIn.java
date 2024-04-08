package insper.store.inscricao;

import lombok.Builder;
import lombok.experimental.Accessors;

@Builder
@Accessors(fluent = true, chain = true)
public record InscricaoIn (
    String id_user,
    String id_job
) {
    
}
