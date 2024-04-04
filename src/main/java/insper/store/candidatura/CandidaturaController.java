package insper.store.candidatura;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "store-candidatura")
public interface CandidaturaController {

    @PostMapping("/candidaturas")
    public ResponseEntity<CandidaturaOut> create(
        @RequestBody(required = true) CandidaturaIn in
    );

    // @PostMapping("/applications/login")
    // public ResponseEntity<CandidaturaOut> login(
    //     @RequestBody(required = true) LoginIn in
    // );

    @PutMapping("/candidaturas/{id}")
    public ResponseEntity<CandidaturaOut> update(
        @PathVariable(required = true) String id,
        @RequestBody(required = true) CandidaturaIn in
    );

    @GetMapping("/candidaturas")
    public ResponseEntity<CandidaturaOut> read(
        @RequestHeader(required = true, name = "id-user") String idUser,
        @RequestHeader(required = true, name = "role-user") String roleUser
    );
    
}